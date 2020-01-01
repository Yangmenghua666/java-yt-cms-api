package yt.parent.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
/**
 * 区块DTO
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title AreaDTO
 * @date 2019/10/18
 */
public class AreaDTO implements Serializable {

    private static final Long serialVersionUID = 63143248324L;
    /**
     * 区块id
     */
    private Integer id;
    /**
     * 区块名称
     */
    @NotNull
    private String areaName;
    /**
     * 区块所属页面Id
     */
    @NotNull
    private Integer pageId;
    /**
     * 区块状态
     */
    @NotNull
    private Integer areaStatus;

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
        this.areaName = areaName;
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
}
