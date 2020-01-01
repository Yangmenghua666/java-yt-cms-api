package yt.parent.common.framwork;

import java.util.List;
/**
 * 分页返回数据
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title PageResult
 * @date 2019/10/18
 */
public class PageResult<T> {

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
    /**
     * 数据总条数
     */
    private Long totalNum;
    /**
     * 总页数
     */
    private Long pages;
    /**
     * 当前页
     */
    private Long nowPage;
    /**
     * 每页数据条数
     */
    private Long pageSize;

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

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getNowPage() {
        return nowPage;
    }

    public void setNowPage(Long nowPage) {
        this.nowPage = nowPage;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
}
