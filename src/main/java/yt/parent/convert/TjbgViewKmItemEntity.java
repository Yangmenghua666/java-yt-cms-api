package yt.parent.convert;
/**
 * 体检检查项
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title TjbgViewKmItemEntity
 * @date 2019/11/26
 */
public class TjbgViewKmItemEntity {
    /**
     * 体检项ID
     **/
    private String itemId;
    /**
     * 体检项名称
     **/
    private String itemName;
    /**
     * 体检项英文名称
     **/
    private String itemEnName;
    /**
     * 单位
     **/
    private String unit;
    /**
     * 检查结果值
     **/
    private String value;
    /**
     * 结果标识
     **/
    private String status;
    /**
     * 正常范围/参考范围
     **/
    private String valueRange;

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemEnName() {
        return this.itemEnName;
    }

    public void setItemEnName(String itemEnName) {
        this.itemEnName = itemEnName;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValueRange() {
        return this.valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }
}
