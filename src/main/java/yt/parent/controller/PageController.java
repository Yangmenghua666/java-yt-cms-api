package yt.parent.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yt.parent.common.contants.CommenErrorMsg;
import yt.parent.common.framwork.ItemResult;
import yt.parent.common.framwork.ListResult;
import yt.parent.request.PageDTO;
import yt.parent.service.IPageService;
import yt.parent.utils.ResultDealUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 页面控制层
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title PageController
 * @date 2019/10/18
 */
@RestController
@RequestMapping("/page")
public class PageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageController.class);

    @Resource
    private IPageService pageService;
    /**
     * 添加或修改页面信息
     */
    @PostMapping(value = "/addOrModifyPage",produces = "application/json;charset=utf-8")
    public ItemResult<Boolean> addOrModifyPageInfo(HttpServletRequest request){
        String pageInfo = request.getParameter("page");
        LOGGER.info("调用addOrModifyPageInfo()方法,入参:{}",pageInfo);
        if(StringUtils.isBlank(pageInfo)){
            LOGGER.info("调用addOrModifyPageInfo()方法,入参为空!");
            return ResultDealUtil.dealItemResult(Boolean.FALSE,Boolean.FALSE, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        PageDTO pageDTO = JSONObject.parseObject(pageInfo,PageDTO.class);
        ItemResult<Boolean> result = pageService.addOrModifyPageInfo(pageDTO);
        return result;
    }
    /**
     * 查询页面信息
     */
    @GetMapping(value = "/queryItemPage",produces = "application/json;charset=utf-8")
    public ItemResult<PageDTO> queryItemPageInfo(HttpServletRequest request){
        String pageId = request.getParameter("pageId");
        LOGGER.info("调用queryItemPageInfo()方法,入参:{}",pageId);
        if(StringUtils.isBlank(pageId)){
            LOGGER.info("调用queryItemPageInfo()方法,入参为空!");
            return ResultDealUtil.dealItemResult(new PageDTO(),Boolean.FALSE, CommenErrorMsg.EMPTY_PARAM.getMsg());
        }
        ItemResult<PageDTO> result = pageService.queryItemPageInfo(Integer.parseInt(pageId));
        return result;
    }
    /**
     * 查询页面信息列表
     */
    @GetMapping(value = "/queryAllPages",produces = "application/json;charset=utf-8")
    public ListResult<PageDTO> queryAllPagesInfo(){
        LOGGER.info("开始查询页面列表!");
        ListResult<PageDTO> result = pageService.queryAllPagesInfo();
        return result;
    }
}
