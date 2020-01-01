package yt.parent.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import yt.parent.annotation.ReadDataSource;
import yt.parent.annotation.ValidParam;
import yt.parent.annotation.WriteDataSource;
import yt.parent.common.contants.CommenErrorMsg;
import yt.parent.common.framwork.ItemResult;
import yt.parent.convert.AreaContentConvert;
import yt.parent.dao.AreaContentMapper;
import yt.parent.model.AreaContentDO;
import yt.parent.model.AreaContentExample;
import yt.parent.request.AreaContentDTO;
import yt.parent.service.IAreaContentService;
import yt.parent.utils.CmsJsonCheckUtil;
import yt.parent.utils.ResultDealUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("areaContentService")
public class AreaContentServiceImpl implements IAreaContentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AreaContentServiceImpl.class);

    @Resource
    private AreaContentMapper areaContentMapper;

    @WriteDataSource
    @Override
    public ItemResult<Boolean> initOrModifyAreaModel(@ValidParam AreaContentDTO request) {
        AreaContentDO areaContentDO = AreaContentConvert.toAreaContentDO(request);
        //1-检验模板信息是否符合格式要求
        if(!CmsJsonCheckUtil.cmsJsonCheck(areaContentDO.getAreaBasemodel())){
            LOGGER.error("区块ID:{}，所定义的基本信息模板格式错误!",request.getAreaId());
            return ResultDealUtil.dealItemResult(false,false,"基本信息模板格式错误!");
        }
        if(!CmsJsonCheckUtil.cmsJsonCheck(areaContentDO.getAreaListmodel())){
            LOGGER.error("区块:{},所定义的列表模板格式错误!",request.getAreaId());
            return ResultDealUtil.dealItemResult(false,false,"列表模板格式错误!");
        }
        //2-插入/更新数据库数据库
        if(null == areaContentDO.getId()){
            areaContentMapper.insertSelective(areaContentDO);
        }else{
            areaContentMapper.updateByPrimaryKey(areaContentDO);
        }
        LOGGER.info("初始化成功!");
        return ResultDealUtil.dealItemResult(true,true,"初始化成功!");
    }

    @ReadDataSource
    @Override
    public ItemResult<AreaContentDTO> queryAreaModelByAreaId(Long areaId) {
        AreaContentDO areaContentDO = areaContentMapper.selectModelByAreaId(areaId.intValue());
        if(null == areaContentDO){
            LOGGER.error("未查询到areaId:{}的模板数据!",areaId);
            return ResultDealUtil.dealItemResult(null,false, CommenErrorMsg.RESULT_EMPTY.getMsg());
        }
        //将AreaContentDO转换为AreaContentDTO
        AreaContentDTO areaContentDTO = AreaContentConvert.toAreaContentDTO(areaContentDO);
        LOGGER.info("查询AreaId:{}模板数据成功!",areaId);
        return  ResultDealUtil.dealItemResult(areaContentDTO,true, CommenErrorMsg.SUCCESS.getMsg());
    }

    @ReadDataSource
    @Override
    public ItemResult<AreaContentDTO> queryAreaContentInfoByAreaId(Long areaId) {
        AreaContentExample areaContentExample = new AreaContentExample();
        AreaContentExample.Criteria criteria = areaContentExample.createCriteria();
        criteria.andAreaIdEqualTo(areaId.intValue());
        List<AreaContentDO> areaContentDOS = areaContentMapper.selectByExample(areaContentExample);
        if(CollectionUtils.isEmpty(areaContentDOS)){
            LOGGER.error("未查询areaId:{}到对应的区块内容数据!",areaId);
            return ResultDealUtil.dealItemResult(null,false,CommenErrorMsg.RESULT_EMPTY.getMsg());
        }
        AreaContentDTO areaContentDTO = AreaContentConvert.toAreaContentDTO(areaContentDOS.get(0));
        return ResultDealUtil.dealItemResult(areaContentDTO,true,CommenErrorMsg.SUCCESS.getMsg());
    }

    @WriteDataSource
    @Override
    public ItemResult<Boolean> modifyAreaContentOfBase(@ValidParam AreaContentDTO request) {
        if(null == request.getId()){
            LOGGER.error("区块记录Id为空!");
            return ResultDealUtil.dealItemResult(false,false,"区块记录Id为空!");
        }
        AreaContentDO areaContentDO = AreaContentConvert.toAreaContentDO(request);
        areaContentMapper.updateBaseInfoContent(areaContentDO);
        LOGGER.info("id:{}基本信息内容更新成功!",request.getId());
        return ResultDealUtil.dealItemResult(true,true,"修改成功!");
    }

    @WriteDataSource
    @Override
    public ItemResult<Boolean> modifyAreaContentOfList(@ValidParam AreaContentDTO request) {
        if(null == request.getId()){
            LOGGER.error("区块记录Id为空!");
            return ResultDealUtil.dealItemResult(false,false,"区块记录Id为空!");
        }
        AreaContentDO areaContentDO = AreaContentConvert.toAreaContentDO(request);
        areaContentMapper.updateListInfoContent(areaContentDO);
        LOGGER.info("id:{}列表信息内容更新成功!",request.getId());
        return ResultDealUtil.dealItemResult(true,true,"修改成功!");
    }
}
