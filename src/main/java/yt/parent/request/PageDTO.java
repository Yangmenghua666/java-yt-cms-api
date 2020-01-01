package yt.parent.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 页面添加/修改/查询DTO
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title PageDTO
 * @date 2019/10/18
 */
public class PageDTO implements Serializable {

    private static final Long serialVersionUID = 63743248324L;
    /**
     * pageId
     */
    private Integer id;
    /**
     * 页面名称
     */
    @NotNull
    private String pageName;
    /**
     * 页面所属父页面
     */
    @NotNull
    private Integer pageFid;
    /**
     * 页面状态
     */
    @NotNull
    private Integer pageStatus;

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
        this.pageName = pageName;
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

}
