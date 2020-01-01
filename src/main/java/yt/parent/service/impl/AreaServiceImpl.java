package yt.parent.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import yt.parent.annotation.ReadDataSource;
import yt.parent.annotation.ValidParam;
import yt.parent.annotation.WriteDataSource;
import yt.parent.common.contants.CommenErrorMsg;
import yt.parent.common.framwork.ItemResult;
import yt.parent.common.framwork.ListResult;
import yt.parent.convert.AreaConvert;
import yt.parent.dao.AreaMapper;
import yt.parent.model.AreaDO;
import yt.parent.model.AreaExample;
import yt.parent.request.AreaDTO;
import yt.parent.service.IAreaService;
import yt.parent.utils.ResultDealUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("areaService")
public class AreaServiceImpl implements IAreaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AreaServiceImpl.class);

    @Resource
    private AreaMapper areaMapper;

    @ReadDataSource
    @Override
    public ItemResult<AreaDTO> queryItemAreaInfo(Integer areaId) {
        AreaDO areaDO = areaMapper.selectByPrimaryKey(areaId);
        AreaDTO result = AreaConvert.toAreaDTO(areaDO);
        return null == result ? ResultDealUtil.dealItemResult(result,false, CommenErrorMsg.RESULT_EMPTY.getMsg())
                : ResultDealUtil.dealItemResult(result,true,CommenErrorMsg.SUCCESS.getMsg());
    }

    @ReadDataSource
    @Override
    public ListResult<AreaDTO> queryAllAreasInfoByPageId(Integer pageId) {
        AreaExample example = new AreaExample();
        AreaExample.Criteria criteria = example.createCriteria();
        criteria.andPageIdEqualTo(pageId);
        List<AreaDO> areaDOS = areaMapper.selectByExample(example);
        List<AreaDTO> result = AreaConvert.toAreaDTOS(areaDOS);
        return ResultDealUtil.dealListResult(result,true,CommenErrorMsg.SUCCESS.getMsg());
    }

    @WriteDataSource
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ItemResult<Boolean> addOrModifyAreas(@ValidParam List<AreaDTO> request) {
        //将AreaDTO转换为AreaDO
        List<AreaDO> areaDOS = AreaConvert.toAreaDOS(request);
        if(CollectionUtils.isEmpty(areaDOS)){
            LOGGER.info("调用AreaConvert.toAreaDOS()转换结果为空!");
            return ResultDealUtil.dealItemResult(true,true,"编辑成功!");
        }
        for(AreaDO areaDO : areaDOS){
            if(areaDO.getId() == null){
                //新增
                areaMapper.insertSelective(areaDO);
            }else {
                //更新
                areaMapper.updateByPrimaryKey(areaDO);
            }
        }
        return ResultDealUtil.dealItemResult(true,true,"编辑成功!");
    }
}
