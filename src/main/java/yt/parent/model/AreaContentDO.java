package yt.parent.model;

import java.util.Date;

public class AreaContentDO {
    private Integer id;

    private Integer areaId;

    private String areaBasemodel;

    private String areaBasedata;

    private String areaListmodel;

    private String areaListdata;

    private Date createTime;

    private String createGuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaBasemodel() {
        return areaBasemodel;
    }

    public void setAreaBasemodel(String areaBasemodel) {
        this.areaBasemodel = areaBasemodel == null ? null : areaBasemodel.trim();
    }

    public String getAreaBasedata() {
        return areaBasedata;
    }

    public void setAreaBasedata(String areaBasedata) {
        this.areaBasedata = areaBasedata == null ? null : areaBasedata.trim();
    }

    public String getAreaListmodel() {
        return areaListmodel;
    }

    public void setAreaListmodel(String areaListmodel) {
        this.areaListmodel = areaListmodel == null ? null : areaListmodel.trim();
    }

    public String getAreaListdata() {
        return areaListdata;
    }

    public void setAreaListdata(String areaListdata) {
        this.areaListdata = areaListdata == null ? null : areaListdata.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateGuid() {
        return createGuid;
    }

    public void setCreateGuid(String createGuid) {
        this.createGuid = createGuid == null ? null : createGuid.trim();
    }
}