package yt.parent.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;

/**
 * 校验工具类
 */
public class ValidationUtils {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationUtils.class);

    public static <T> void validateEntity(T obj) throws Exception{
        Set<ConstraintViolation<T>> result = validator.validate(obj, Default.class);
        if (!CollectionUtils.isEmpty(result)) {
            StringBuilder msg = new StringBuilder();
            for(ConstraintViolation constraintViolation : result){
                msg.append(constraintViolation.getPropertyPath().toString() + constraintViolation.getMessage());
            }
            LOGGER.error("调用ValidationUtils.validateEntity()验证集合对象,验证不通过:{}", msg.toString());
            throw new Exception(msg.toString());
        }
    }
}
