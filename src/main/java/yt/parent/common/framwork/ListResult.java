package yt.parent.common.framwork;

import java.util.List;
/**
 * 列表返回数据
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title ListResult
 * @date 2019/10/18
 */
public class ListResult<T> {

    /**
     * 状态
     */
    private Boolean status;
    /**
     * 描述信息
     */
    private String msg;
    /**
     * 数据实体
     */
    private List<T> data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
