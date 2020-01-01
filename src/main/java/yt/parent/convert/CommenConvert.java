package yt.parent.convert;

import yt.parent.model.AreaContentDO;
import yt.parent.model.AreaDO;
import yt.parent.request.*;
import yt.parent.utils.ReflectionUtil;

import java.lang.reflect.Field;

/**
 * DTO/DO相互转换
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title CommenConvert
 * @date 2019/10/18
 */
public class CommenConvert {

    public static void main(String[] args) {
        CommenConvert.DTOConvertToDO(AreaContentDO.class, AreaContentDTO.class);
    }



    private static void DTOConvertToDO(Class<?> dtoClass,Class<?> doClass){
        String doClassName = doClass.getSimpleName();
        String dtoClassName = dtoClass.getSimpleName();
        //打印方法
        System.out.println("public static " + doClassName + " to" + doClassName + "(" +
                dtoClassName + " param){");
        System.out.println("    " + doClassName + " result = new " + doClassName + "();");
        Field[] allFields1 = dtoClass.getDeclaredFields();
        if(null != allFields1){
            for(Field item : allFields1){
                Field field = ReflectionUtil.getDeclaredField(doClass,item.getName());
                if(null != field){
                    String fieldName = field.getName();
                    String bigFieldName = ((fieldName.charAt(0) + "").toUpperCase()) + fieldName.substring(1);
                    if(String.class.equals(field.getClass())){
                        System.out.println("    if(StringUtils.isNotBlank(param.get" + bigFieldName + "())){");
                        System.out.println("        result.set" + bigFieldName + "(param.get" + bigFieldName + "());");
                        System.out.println("    }");
                    }else{
                        System.out.println("    if(null != param.get" + bigFieldName + "()){");
                        System.out.println("        result.set" + bigFieldName + "(param.get" + bigFieldName + "());");
                        System.out.println("    }");
                    }
                }else{
                    System.out.println("//" + item.getName() + "未匹配");
                }
            }
        }
        System.out.println("    return result;");
        System.out.println("}");
    }
}
