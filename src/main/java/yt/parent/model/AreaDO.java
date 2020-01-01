package yt.parent.model;

import java.util.Date;

public class AreaDO {
    private Integer id;

    private String areaName;

    private Integer pageId;

    private Integer areaStatus;

    private Date createTime;

    private String createGuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getAreaStatus() {
        return areaStatus;
    }

    public void setAreaStatus(Integer areaStatus) {
        this.areaStatus = areaStatus;
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