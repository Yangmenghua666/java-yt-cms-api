package yt.parent.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yt.parent.common.contants.CommenErrorMsg;
import yt.parent.common.framwork.ItemResult;
import yt.parent.request.AreaContentDTO;
import yt.parent.service.IAreaContentService;
import yt.parent.utils.ResultDealUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 区块内容服务控制层
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title AreaContentController
 * @date 2019/11/20
 */
@RestController
@RequestMapping("/areaContent")
public class AreaContentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AreaController.class);

    @Resource
    private IAreaContentService areaContentService;

    /**
     * 区块初始化(定义基础信息和列表信息模板)
     * @param request
     * @return
     */
    @PostMapping(value = "/initOrModifyAreaModel",produces = "application/json;charset=utf-8")
    public ItemResult<Boolean> initOrModifyAreaModel(HttpServletRequest request){
        String areaContent = request.getParameter("areaContent");
        LOGGER.info("调用initOrModifyAreaModel()方法,入参:{}",areaContent);
        if(StringUtils.isBlank(areaContent)){
            LOGGER.error("调用initOrModifyAreaModel()方法异常，入参为空!");
            return ResultDealUtil.dealItemResult(false,false, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        AreaContentDTO areaContentDTO = JSONObject.parseObject(areaContent,AreaContentDTO.class);
        return areaContentService.initOrModifyAreaModel(areaContentDTO);
    }
    /**
     * 根据区块id查询区块模板信息
     * @param request
     * @title modifyAreaModel
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<AreaContentDTO>
     */
    @PostMapping(value = "/queryAreaModelByAreaId",produces = "application/json;charset=utf-8")
    public ItemResult<AreaContentDTO> queryAreaModelByAreaId(HttpServletRequest request){
        String areaId = request.getParameter("areaId");
        LOGGER.info("调用queryAreaModelByAreaId()方法，入参:{}",areaId);
        if (StringUtils.isBlank(areaId)) {
            LOGGER.error("调用queryAreaModelByAreaId()方法,入参为空!");
            return ResultDealUtil.dealItemResult(null,false,CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        Long areaIdL = Long.parseLong(areaId);
        return areaContentService.queryAreaModelByAreaId(areaIdL);
    }
    /**
     * 根据AreaId查询区块内容数据
     * @param request
     * @title queryAreaContentByAreaId
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<AreaContentDTO>
     */
    @PostMapping(value = "/queryAreaContentInfoByAreaId",produces = "application/json;charset=utf-8")
    public ItemResult<AreaContentDTO> queryAreaContentInfoByAreaId(HttpServletRequest request){
        String areaId = request.getParameter("areaId");
        LOGGER.info("调用queryAreaContentInfoByAreaId()方法，入参:{}",areaId);
        if (StringUtils.isBlank(areaId)) {
            LOGGER.error("调用queryAreaContentInfoByAreaId()方法,入参为空!");
            return ResultDealUtil.dealItemResult(null,false,CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        Long areaIdL = Long.parseLong(areaId);
        return areaContentService.queryAreaContentInfoByAreaId(areaIdL);
    }
    /**
     * 修改区块基础信息数据
     * @param request
     * @title modifyAreaContentOfBase
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    @PostMapping(value = "/modifyAreaContentOfBase",produces = "application/json;charset=utf-8")
    public ItemResult<Boolean> modifyAreaContentOfBase(HttpServletRequest request){
        String areaContent = request.getParameter("areaContent");
        LOGGER.info("调用modifyAreaContentOfBase()方法,入参:{}",areaContent);
        if(StringUtils.isBlank(areaContent)){
            LOGGER.error("调用modifyAreaContentOfBase()方法异常，入参为空!");
            return ResultDealUtil.dealItemResult(false,false, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        AreaContentDTO areaContentDTO = JSONObject.parseObject(areaContent,AreaContentDTO.class);
        return areaContentService.modifyAreaContentOfBase(areaContentDTO);
    }
    /**
     * 修改区块列表数据
     * @param request
     * @title modifyAreaContentOfList
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return ItemResult<Boolean>
     */
    @PostMapping(value = "/modifyAreaContentOfList",produces = "application/json;charset=utf-8")
    public ItemResult<Boolean> modifyAreaContentOfList(HttpServletRequest request){
        String areaContent = request.getParameter("areaContent");
        LOGGER.info("调用modifyAreaContentOfList()方法,入参:{}",areaContent);
        if(StringUtils.isBlank(areaContent)){
            LOGGER.error("调用modifyAreaContentOfList()方法异常，入参为空!");
            return ResultDealUtil.dealItemResult(false,false, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        AreaContentDTO areaContentDTO = JSONObject.parseObject(areaContent,AreaContentDTO.class);
        return areaContentService.modifyAreaContentOfList(areaContentDTO);
    }

}
