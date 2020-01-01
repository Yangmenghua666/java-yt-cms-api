package yt.parent.convert;

import java.util.List;

/**
 * 体检报告详情support-service层返回参数
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title TjbgViewResponse
 * @date 2019/11/26
 */
public class TjbgViewResponse {
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
        return hosId;
    }

    public void setHosId(Long hosId) {
        this.hosId = hosId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAccessTjbgNo() {
        return accessTjbgNo;
    }

    public void setAccessTjbgNo(String accessTjbgNo) {
        this.accessTjbgNo = accessTjbgNo;
    }

    public String getTjbgName() {
        return tjbgName;
    }

    public void setTjbgName(String tjbgName) {
        this.tjbgName = tjbgName;
    }

    public String getTjDate() {
        return tjDate;
    }

    public void setTjDate(String tjDate) {
        this.tjDate = tjDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getVariousSummary() {
        return variousSummary;
    }

    public void setVariousSummary(String variousSummary) {
        this.variousSummary = variousSummary;
    }

    public List<TjbgViewKmEntity> getKms() {
        return kms;
    }

    public void setKms(List<TjbgViewKmEntity> kms) {
        this.kms = kms;
    }
}
