package yt.parent.convert;

import java.util.List;

/**
 * 体检科目信息
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title TjbgViewKmEntity
 * @date 2019/11/26
 */
public class TjbgViewKmEntity {
    /**
     * 科目名称
     **/
    private String kmName;
    /**
     * 异常项数量
     **/
    private String abnormalNum;
    /**
     * 科目小结
     **/
    private String kmSummary;
    /**
     * 体检医生
     **/
    private String tjDocName;
    /**
     * 审核医生
     **/
    private String shDocName;
    /**
     * 小结时间
     **/
    private String summaryTime;
    /**
     * 检查项
     */
    private List<TjbgViewKmItemEntity> items;

    public String getKmName() {
        return this.kmName;
    }

    public void setKmName(String kmName) {
        this.kmName = kmName;
    }

    public String getAbnormalNum() {
        return this.abnormalNum;
    }

    public void setAbnormalNum(String abnormalNum) {
        this.abnormalNum = abnormalNum;
    }

    public String getKmSummary() {
        return this.kmSummary;
    }

    public void setKmSummary(String kmSummary) {
        this.kmSummary = kmSummary;
    }

    public String getTjDocName() {
        return this.tjDocName;
    }

    public void setTjDocName(String tjDocName) {
        this.tjDocName = tjDocName;
    }

    public String getShDocName() {
        return this.shDocName;
    }

    public void setShDocName(String shDocName) {
        this.shDocName = shDocName;
    }

    public String getSummaryTime() {
        return this.summaryTime;
    }

    public void setSummaryTime(String summaryTime) {
        this.summaryTime = summaryTime;
    }

    public List<TjbgViewKmItemEntity> getItems() {
        return this.items;
    }

    public void setItems(List<TjbgViewKmItemEntity> items) {
        this.items = items;
    }
}
