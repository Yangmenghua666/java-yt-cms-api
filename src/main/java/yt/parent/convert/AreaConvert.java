package yt.parent.convert;

import org.springframework.util.CollectionUtils;
import yt.parent.model.AreaDO;
import yt.parent.request.AreaDTO;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * 区块基本信息转换工具类
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title AreaConvert
 * @date 2019/10/24
 */
public class AreaConvert {

    /**
     * 将AreaDO转换为AreaDTO
     * @param param
     * @title toAreaDTO
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return AreaDTO
     */
    public static AreaDTO toAreaDTO(AreaDO param){
        if(null == param){
            return null;
        }
        AreaDTO result = new AreaDTO();
        if(null != param.getId()){
            result.setId(param.getId());
        }
        if(null != param.getAreaName()){
            result.setAreaName(param.getAreaName());
        }
        if(null != param.getPageId()){
            result.setPageId(param.getPageId());
        }
        if(null != param.getAreaStatus()){
            result.setAreaStatus(param.getAreaStatus());
        }
        return result;
    }

    public static List<AreaDTO> toAreaDTOS(List<AreaDO> areaDOS){
        if(CollectionUtils.isEmpty(areaDOS)){
            return Collections.emptyList();
        }
        return areaDOS.stream().map(AreaConvert::toAreaDTO).collect(Collectors.toList());
    }
    /**
     * 将AreaDTO转化为AreaDO
     * @param param
     * @title toAreaDO
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return AreaDO
     */
    public static AreaDO toAreaDO(AreaDTO param){
        AreaDO result = new AreaDO();
        if(null != param.getId()){
            result.setId(param.getId());
        }else{
            result.setCreateGuid(UUID.randomUUID().toString());
        }
        if(null != param.getAreaName()){
            result.setAreaName(param.getAreaName());
        }
        if(null != param.getPageId()){
            result.setPageId(param.getPageId());
        }
        if(null != param.getAreaStatus()){
            result.setAreaStatus(param.getAreaStatus());
        }
        return result;
    }

    public static List<AreaDO> toAreaDOS(List<AreaDTO> areaDTOS){
        if(CollectionUtils.isEmpty(areaDTOS)){
            return Collections.emptyList();
        }
        return areaDTOS.stream().map(AreaConvert::toAreaDO).collect(Collectors.toList());
    }
}
