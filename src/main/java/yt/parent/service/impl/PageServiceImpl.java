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
import yt.parent.common.framwork.ListResult;
import yt.parent.convert.PageConvert;
import yt.parent.dao.PageMapper;
import yt.parent.model.PageDO;
import yt.parent.model.PageExample;
import yt.parent.request.PageDTO;
import yt.parent.service.IPageService;
import yt.parent.utils.ResultDealUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("pageService")
public class PageServiceImpl implements IPageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageServiceImpl.class);

    @Resource
    private PageMapper pageMapper;

    @WriteDataSource
    @Override
    public ItemResult<Boolean> addOrModifyPageInfo(@ValidParam PageDTO request) {
        PageDO pageDO = PageConvert.toPageDO(request);
        if(null != pageDO.getId()){
            //添加页面
            pageMapper.updateByPrimaryKeySelective(pageDO);
            return ResultDealUtil.dealItemResult(Boolean.TRUE,Boolean.TRUE,"更新成功!");
        }
        pageMapper.insertSelective(pageDO);
        return ResultDealUtil.dealItemResult(Boolean.TRUE,Boolean.TRUE,"添加成功!");
    }

    @ReadDataSource
    @Override
    public ItemResult<PageDTO> queryItemPageInfo(@ValidParam Integer pageId) {
        PageDO pageDO = pageMapper.selectByPrimaryKey(pageId);
        if(null == pageDO){
            LOGGER.info("不存在pageId={}的页面!",pageId);
            return ResultDealUtil.dealItemResult(null,Boolean.FALSE, CommenErrorMsg.RESULT_EMPTY.getMsg());
        }
        PageDTO pageDTO = PageConvert.toPageDTO(pageDO);
        return ResultDealUtil.dealItemResult(pageDTO,Boolean.TRUE,CommenErrorMsg.SUCCESS.getMsg());
    }

    @ReadDataSource
    @Override
    public ListResult<PageDTO> queryAllPagesInfo() {
        List<PageDO> pageDOS = pageMapper.selectByExample(new PageExample());
        if(CollectionUtils.isEmpty(pageDOS)){
            LOGGER.info("暂时还没有创建任何页面!");
            return ResultDealUtil.dealListResult(null,Boolean.FALSE,CommenErrorMsg.RESULT_EMPTY.getMsg());
        }
        List<PageDTO> pageDTOS = PageConvert.toPageDTOList(pageDOS);
        return ResultDealUtil.dealListResult(pageDTOS,Boolean.FALSE,CommenErrorMsg.SUCCESS.getMsg());
    }
}
