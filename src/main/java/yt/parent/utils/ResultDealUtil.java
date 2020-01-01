package yt.parent.utils;

import yt.parent.common.framwork.ItemResult;
import yt.parent.common.framwork.ListResult;

import java.util.List;

/**
 * 错误处理工具
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title ResultDealUtil
 * @date 2019/10/18
 */
public class ResultDealUtil {
    /**
     * 处理单项数据返回结果
     * @param param
     * @title dealItemResult
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return
     */
    public static <T> ItemResult<T> dealItemResult(T param,Boolean status,String msg){
        ItemResult<T> result = new ItemResult<>();
        result.setData(param);
        result.setStatus(status);
        result.setMsg(msg);
        return result;
    }
    /**
     * 处理列表数据返回结果
     * @param param
     * @title dealListResult
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ListResult<T>
     */
    public static <T> ListResult<T> dealListResult(List<T> param,Boolean status,String msg){
        ListResult<T> result = new ListResult<>();
        result.setData(param);
        result.setStatus(status);
        result.setMsg(msg);
        return result;
    }

}
