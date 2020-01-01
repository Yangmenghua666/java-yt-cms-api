package yt.parent.controller;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yt.parent.common.contants.CommenErrorMsg;
import yt.parent.common.framwork.ItemResult;
import yt.parent.common.framwork.ListResult;
import yt.parent.request.AreaDTO;
import yt.parent.service.IAreaService;
import yt.parent.utils.ResultDealUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 区块服务控制层
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title AreaController
 * @date 2019/10/18
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AreaController.class);

    @Resource
    private IAreaService areaService;
    /**
     * 根据areaId查询区块基本信息
     */
    @PostMapping(value = "/queryItemArea",produces = "application/json;charset=utf-8")
    public ItemResult<AreaDTO> queryItemAreaInfo(HttpServletRequest request){
        String areaId = request.getParameter("areaId");
        LOGGER.info("调用queryItemAreaInfo()方法,入参:{}",areaId);
        if(StringUtils.isBlank(areaId)){
            LOGGER.info("调用queryItemAreaInfo()方法,入参为空!");
            return ResultDealUtil.dealItemResult(null,Boolean.FALSE, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        return areaService.queryItemAreaInfo(Integer.parseInt(areaId));
    }

    /**
     * 根据PageId查询页面所有区块
     */
    @PostMapping(value = "/queryAreasOfPage",produces = "application/json;charset=utf-8")
    public ListResult<AreaDTO> queryAreasByPageId(HttpServletRequest request){
        String pageId = request.getParameter("pageId");
        LOGGER.info("调用queryAreasByPageId()方法，入参:{}",pageId);
        if(StringUtils.isBlank(pageId)){
            LOGGER.info("调用queryAreasByPageId()方法,入参为空!");
            return ResultDealUtil.dealListResult(null,Boolean.FALSE, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        return areaService.queryAllAreasInfoByPageId(Integer.parseInt(pageId));
    }

    /**
     * 添加/修改区块基本信息
     */
    @PostMapping(value = "/addOrModifyAreas",produces = "application/json;charset=utf-8")
    public ItemResult<Boolean> addOrModifyAreas(HttpServletRequest request){
        String jsonAreas = request.getParameter("areas");
        if(StringUtils.isBlank(jsonAreas)){
            LOGGER.info("调用addOrModifyAreas()方法,入参为空!");
            return ResultDealUtil.dealItemResult(Boolean.TRUE,Boolean.TRUE,CommenErrorMsg.SUCCESS.getMsg());
        }
        List<AreaDTO> areaDTOS = JSONArray.parseArray(jsonAreas,AreaDTO.class);
        return areaService.addOrModifyAreas(areaDTOS);
    }
}
