package yt.parent.service;

import yt.parent.common.framwork.ItemResult;
import yt.parent.common.framwork.ListResult;
import yt.parent.request.PageDTO;

/**
 * 页面操作服务
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title IPageService
 * @date 2019/10/18
 */
public interface IPageService {
    /**
     * 增加/修改页面信息
     * @param request
     * @title addOrModifyPageInfo
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    ItemResult<Boolean> addOrModifyPageInfo(PageDTO request);
    /**
     * 根据页面id查询页面信息
     * @param pageId
     * @title queryItemPageInfo
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<PageDO>
     */
    ItemResult<PageDTO> queryItemPageInfo(Integer pageId);
    /**
     * 查询所有页面信息
     * @title queryAllPagesInfo
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ListResult<PageDO>
     */
    ListResult<PageDTO> queryAllPagesInfo();
}
