package yt.parent.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import yt.parent.annotation.ValidParam;
import yt.parent.common.contants.ParamCheckMsgCons;
import yt.parent.utils.ValidationUtils;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 参数检查切面类
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title ParamCheckAspect
 * @date 2019/10/14
 */
@Aspect
@Component
public class ParamCheckAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParamCheckAspect.class);

    @Before("execution(* yt.parent.service.impl.*.*(..))")
    public void paramCheck(JoinPoint joinPoint) throws Exception{
        //获取参数对象
        Object[] args = joinPoint.getArgs();
        //获取方法参数
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Parameter[] parameters = signature.getMethod().getParameters();
        for (int i = 0; i < parameters.length; i++) {
            Parameter parameter = parameters[i];
            if (isPrimite(parameter.getType())) {
                //Java自带基本类型的参数（例如Integer、String）的处理方式
                dealPrimiteObject(parameter,args[i],signature);
                continue;
            }
            //非基本类型对象
            if (parameter.getAnnotation(ValidParam.class) == null) {
                //没有标注@ValidParam注解的不做处理
                continue;
            }
            if(!parameter.getType().getName().equals("java.util.List")){
                //非集合参数
                dealSimpleObject(parameter,args,signature);
            }else {
                //集合参数
                dealCollectionObject(parameter,args);
            }
        }
    }
    /**
     * 处理基本类型，String，Date类型的验证
     * @param parameter
     * @title dealPrimiteObject
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return
     */
    private void dealPrimiteObject(Parameter parameter, Object arg, MethodSignature signature) throws Exception{
        NotNull notNull = parameter.getAnnotation(NotNull.class);
        if (notNull != null && arg == null) {
            LOGGER.error("调用" + signature.getMethod().getName() + "方法，"  + parameter.toString()
                    + ParamCheckMsgCons.NOT_NULL_MSG);
            throw new Exception(parameter.toString() + ParamCheckMsgCons.NOT_NULL_MSG);
        }
    }
    /**
     * 处理简单对象
     * @param parameter
     * @title dealSimpleObject
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     */
    private void dealSimpleObject(Parameter parameter,Object[] args,
                                  MethodSignature signature) throws Exception{
        Class<?> paramClazz = parameter.getType();
        //得到参数的所有成员变量
        Field[] declaredFields = paramClazz.getDeclaredFields();
        //获取类型所对应的参数对象
        Object arg = Arrays.stream(args).filter(item -> paramClazz
                .isAssignableFrom(item.getClass())).findFirst().get();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            //校验标有@NotNull注解的字段
            NotNull notNull = field.getAnnotation(NotNull.class);
            if (notNull != null) {
                notNullCheck(notNull,field,arg,signature);
                continue;
            }
            Valid valid = field.getAnnotation(Valid.class);
            if(valid != null){
                for(Object item : (List<Object>) field.get(arg)){
                    ValidationUtils.validateEntity(item);
                }
            }
        }
    }
    /**
     * 验证集合对象中的数据
     * @param parameter
     * @title dealCollectionObject
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return
     */
    private void dealCollectionObject(Parameter parameter,Object[] args) throws Exception{
        Class<?> paramClazz = parameter.getType();
        //获取类型所对应的参数对象
        Object arg = Arrays.stream(args).filter(item -> paramClazz
                .isAssignableFrom(item.getClass())).findFirst().get();
        for(Object item : (List<Object>) arg){
            ValidationUtils.validateEntity(item);
        }
    }
    /**
     * 对象中NotNull参数验证
     * @param notNull
     * @title notNullCheck
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return
     */
    private void notNullCheck(NotNull notNull,Field field,Object arg,MethodSignature signature)
            throws Exception{
        Object fieldValue = null;
        try {
            fieldValue = field.get(arg);
        } catch (IllegalAccessException e) {
            LOGGER.error("AOP参数验证异常:{}", e);
        }
        if (fieldValue == null) {
            LOGGER.error("调用" + signature.getMethod().getName() + "方法，" + field.getName() + notNull.message());
            throw new Exception(field.getName() + notNull.message());
        }
    }
    /**
     * 判断是否为基本类型/包装类：包括String
     * @param clazz
     * @title isPrimite
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return boolean
     */
    private boolean isPrimite(Class<?> clazz){
        return clazz.isPrimitive() || clazz == String.class || isWrapperClass(clazz)
                || clazz == Date.class;
    }
    /**
     * 判断是否是基本类型的包装类
     * @param clazz
     * @title isWrapperClass
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return boolean
     */
    private boolean isWrapperClass(Class<?> clazz){
        if(clazz == Byte.class){
            return true;
        }
        if(clazz == Short.class){
            return true;
        }
        if(clazz == Integer.class){
            return true;
        }
        if(clazz == Long.class){
            return true;
        }
        if(clazz == Float.class){
            return true;
        }
        if(clazz == Double.class){
            return true;
        }
        if(clazz == Character.class){
            return true;
        }
        if(clazz == Boolean.class){
            return true;
        }
        return false;
    }
}