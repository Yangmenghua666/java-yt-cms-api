package yt.parent.model;

import java.util.Date;

public class PageDO {
    private Integer id;

    private String pageName;

    private Integer pageFid;

    private Integer pageStatus;

    private Date createTime;

    private String createGuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public Integer getPageFid() {
        return pageFid;
    }

    public void setPageFid(Integer pageFid) {
        this.pageFid = pageFid;
    }

    public Integer getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(Integer pageStatus) {
        this.pageStatus = pageStatus;
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