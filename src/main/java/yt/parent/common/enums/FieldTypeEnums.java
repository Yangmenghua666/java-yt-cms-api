package yt.parent.common.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 字段类型枚举
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title FieldTypeEnums
 * @date 2020/1/1
 */
public enum FieldTypeEnums {

    TEXT("text","文本类型"),
    IMG("img","图片类型"),
    INTEGER("int","整数类型");
    /**
     * 字段类型名称
     */
    private String typeName;
    /**
     * 类型描述
     */
    private String typeDescription;

    FieldTypeEnums(String typeName, String typeDescription) {
        this.typeName = typeName;
        this.typeDescription = typeDescription;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }
    /**
     * 查找对应的字段类型
     * @param typeName
     * @title findTypeEnums
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return FieldTypeEnums
     */
    public static FieldTypeEnums findTypeEnums(String typeName){
        if(StringUtils.isBlank(typeName)){
            return null;
        }
        for(FieldTypeEnums fieldTypeEnums : FieldTypeEnums.values()){
            if(fieldTypeEnums.typeName.equals(typeName)){
                return fieldTypeEnums;
            }
        }
        return null;
    }
}
