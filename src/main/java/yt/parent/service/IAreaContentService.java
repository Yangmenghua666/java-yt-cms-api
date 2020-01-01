package yt.parent.service;

import yt.parent.common.framwork.ItemResult;
import yt.parent.request.AreaContentDTO;

/**
 * 区块内容服务接口
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title IAreaContentService
 * @date 2019/10/18
 */
public interface IAreaContentService {
    /**
     * 区块初始化(定义基础信息和列表信息模板)
     * @param request
     * @title initOrModifyAreaModel
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    ItemResult<Boolean> initOrModifyAreaModel(AreaContentDTO request);
    /**
     * 根据区块id查询区块模板信息
     * @param areaId
     * @title modifyAreaModel
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<AreaContentDTO>
     */
    ItemResult<AreaContentDTO> queryAreaModelByAreaId(Long areaId);
    /**
     * 根据AreaId查询区块内容数据
     * @param areaId
     * @title queryAreaContentByAreaId
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<AreaContentDTO>
     */
    ItemResult<AreaContentDTO> queryAreaContentInfoByAreaId(Long areaId);
    /**
     * 修改区块基础信息数据
     * @param request
     * @title modifyAreaContentOfBase
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    ItemResult<Boolean> modifyAreaContentOfBase(AreaContentDTO request);
    /**
     * 修改区块列表数据
     * @param request
     * @title modifyAreaContentOfList
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    ItemResult<Boolean> modifyAreaContentOfList(AreaContentDTO request);
}
