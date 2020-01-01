package yt.parent.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 区块内容DTO
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title AreaContentDTO
 * @date 2019/10/18
 */
public class AreaContentDTO implements Serializable {

    private static final Long serialVersionUID = 63143148324L;
    /**
     * id
     */
    private Integer id;
    /**
     * 区块Id
     */
    @NotNull
    private Integer areaId;
    /**
     * 区块基础信息模板
     */
    private String areaBasemodel;
    /**
     * 区块基础信息数据
     */
    private String areaBasedata;
    /**
     * 区块列表模板
     */
    private String areaListmodel;
    /**
     * 区块列表数据
     */
    private String areaListdata;

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
        this.areaBasemodel = areaBasemodel;
    }

    public String getAreaBasedata() {
        return areaBasedata;
    }

    public void setAreaBasedata(String areaBasedata) {
        this.areaBasedata = areaBasedata;
    }

    public String getAreaListmodel() {
        return areaListmodel;
    }

    public void setAreaListmodel(String areaListmodel) {
        this.areaListmodel = areaListmodel;
    }

    public String getAreaListdata() {
        return areaListdata;
    }

    public void setAreaListdata(String areaListdata) {
        this.areaListdata = areaListdata;
    }
}
