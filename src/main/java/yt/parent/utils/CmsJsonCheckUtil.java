package yt.parent.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import yt.parent.common.enums.FieldTypeEnums;

import java.util.Map;

/**
 * 内容管理系统模板校验工具类
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title CmsJsonCheckUtil
 * @date 2019/11/20
 */
public class CmsJsonCheckUtil {
    /**
     * 模板校验
     * @param param
     * @title cmsJsonCheck
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return boolean
     */
    public static boolean cmsJsonCheck(String param){
        if(StringUtils.isBlank(param)){
            return false;
        }
        try {
            JSONObject jsonObject = JSONObject.parseObject(param);
            for(Map.Entry<String, Object> entry : jsonObject.entrySet()){
                String[] fieldValues = ((String) entry.getValue()).split("\\|");
                if(fieldValues.length != 2){
                    return false;
                }
                if(null == FieldTypeEnums.findTypeEnums(fieldValues[1])){
                    return false;
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
