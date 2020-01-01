package yt.parent.convert;

import java.util.List;

/**
 * 体检查询返回数据
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title TjbgViewInfoBean
 * @date 2019/11/26
 */
public class TjbgViewInfoBean {
    /**
     * 医院ID
     **/
    private Long hosId;
    /**
     * 患者姓名
     **/
    private String patName;
    /**
     * 性别
     **/
    private String sex;
    /**
     * 年龄
     **/
    private String age;
    /**
     * 体检单号
     **/
    private String accessTjbgNo;
    /**
     * 体检单名称
     **/
    private String tjbgName;
    /**
     * 体检日期
     **/
    private String tjDate;
    /**
     * 体检总结
     **/
    private String summary;
    /**
     * 体检建议
     **/
    private String suggestion;
    /**
     * 各科总结
     **/
    private String variousSummary;
    /**
     * 科目信息
     */
    private List<TjbgViewKmEntity> kms;

    public Long getHosId() {
        return this.hosId;
    }

    public void setHosId(Long hosId) {
        this.hosId = hosId;
    }

    public String getPatName() {
        return this.patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAccessTjbgNo() {
        return this.accessTjbgNo;
    }

    public void setAccessTjbgNo(String accessTjbgNo) {
        this.accessTjbgNo = accessTjbgNo;
    }

    public String getTjbgName() {
        return this.tjbgName;
    }

    public void setTjbgName(String tjbgName) {
        this.tjbgName = tjbgName;
    }

    public String getTjDate() {
        return this.tjDate;
    }

    public void setTjDate(String tjDate) {
        this.tjDate = tjDate;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getVariousSummary() {
        return this.variousSummary;
    }

    public void setVariousSummary(String variousSummary) {
        this.variousSummary = variousSummary;
    }

    public List<TjbgViewKmEntity> getKms() {
        return this.kms;
    }

    public void setKms(List<TjbgViewKmEntity> kms) {
        this.kms = kms;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
