package yt.parent.config;

import java.lang.reflect.Method;

import yt.parent.annotation.ReadDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class DataSourceAop {
    private static Logger LOGGER = LoggerFactory.getLogger(DataSourceAop.class);
    @Pointcut("@annotation(yt.parent.annotation.WriteDataSource)")
    public void writeMethod(){}
    @Pointcut("@annotation(yt.parent.annotation.ReadDataSource)")
    public void readMethod(){}
    @Before("writeMethod()")
    public void beforeWrite(JoinPoint point) {
        DataSourceContextHolder.write();
        /*String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();*/
    }
    @Before("readMethod()")
    public void beforeRead(JoinPoint point) throws ClassNotFoundException {
        //设置数据库为读数据
        DataSourceContextHolder.read();
        /*spring AOP测试代码*/
        /*//根据切点获取当前调用的类名
        String currentClassName = point.getTarget().getClass().getName();
        //根据切点获取当前调用的类方法
        String methodName = point.getSignature().getName();
        //根据切点获取当前类方法的参数
        Object[] args = point.getArgs();
        //根据反射获取当前调用类的实例
        Class reflexClassName = Class.forName(currentClassName);
        //获取该实例的所有方法
        Method[] methods = reflexClassName.getMethods();
        for(Method method : methods){
            if(method.getName().equals(methodName)){
                //获取该实例方法上注解里面的描述信息
                String desrciption = method.getAnnotation(ReadDataSource.class).description();
            }
        }*/
    }
}

