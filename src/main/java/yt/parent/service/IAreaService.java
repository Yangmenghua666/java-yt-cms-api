package yt.parent.service;

import yt.parent.common.framwork.ItemResult;
import yt.parent.common.framwork.ListResult;
import yt.parent.request.AreaDTO;

import java.util.List;

/**
 * 区块数据服务接口
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title IAreaService
 * @date 2019/10/18
 */
public interface IAreaService {
    /**
     * 根据areaId查询区块信息
     * @param areaId
     * @title queryItemAreaInfo
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<AreaDO>
     */
    ItemResult<AreaDTO> queryItemAreaInfo(Integer areaId);
    /**
     * 根据pageId查询下属所有区块
     * @param pageId
     * @title queryAllAreasInfoByPageId
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ListResult<AreaDO>
     */
    ListResult<AreaDTO> queryAllAreasInfoByPageId(Integer pageId);
    /**
     * 添加/修改区块信息
     * @param request
     * @title addOrModifyAreas
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    ItemResult<Boolean> addOrModifyAreas(List<AreaDTO> request);
}
