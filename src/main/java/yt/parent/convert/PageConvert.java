package yt.parent.convert;

import org.springframework.util.CollectionUtils;
import yt.parent.model.PageDO;
import yt.parent.request.PageDTO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Page页面数据转换
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title PageConvert
 * @date 2019/10/18
 */
public class PageConvert {

    /**
     * 将PageDTO转换成PageDO
     * @param param
     * @title toPageDO
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return PageDO
     */
    public static PageDO toPageDO(PageDTO param){
        PageDO result = new PageDO();
        if(null != param.getId()){
            result.setId(param.getId());
        }
        if(null != param.getPageName()){
            result.setPageName(param.getPageName());
        }
        if(null != param.getPageFid()){
            result.setPageFid(param.getPageFid());
        }
        if(null != param.getPageStatus()){
            result.setPageStatus(param.getPageStatus());
        }else{
            result.setPageStatus(1);
        }
        return result;
    }
    /**
     * PageDO转化为PageDTO
     * @param param
     * @title toPageDTO
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return PageDTO
     */
    public static PageDTO toPageDTO(PageDO param){
        PageDTO result = new PageDTO();
        if(null != param.getId()){
            result.setId(param.getId());
        }
        if(null != param.getPageName()){
            result.setPageName(param.getPageName());
        }
        if(null != param.getPageFid()){
            result.setPageFid(param.getPageFid());
        }
        if(null != param.getPageStatus()){
            result.setPageStatus(param.getPageStatus());
        }
        return result;
    }

    public static List<PageDTO> toPageDTOList(List<PageDO> pageDOS){
        if(CollectionUtils.isEmpty(pageDOS)){
            return Collections.emptyList();
        }
        return pageDOS.stream().map(PageConvert::toPageDTO).collect(Collectors.toList());
    }
}
