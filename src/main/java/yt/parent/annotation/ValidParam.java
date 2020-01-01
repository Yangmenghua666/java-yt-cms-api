package yt.parent.annotation;

import java.lang.annotation.*;

/**
 * 自定义对象验证注解(表示该对象需要进行验证)
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title ValidParam
 * @date 2019/10/14
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidParam {

}
