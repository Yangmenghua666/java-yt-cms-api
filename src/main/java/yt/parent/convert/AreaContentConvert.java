package yt.parent.convert;

import yt.parent.model.AreaContentDO;
import yt.parent.request.AreaContentDTO;

/**
 * 区块内容数据转换工具类
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title AreaContentConvert
 * @date 2019/11/20
 */
public class AreaContentConvert {

    public static AreaContentDO toAreaContentDO(AreaContentDTO param){
        AreaContentDO result = new AreaContentDO();
        if(null != param.getId()){
            result.setId(param.getId());
        }
        if(null != param.getAreaId()){
            result.setAreaId(param.getAreaId());
        }
        if(null != param.getAreaBasemodel()){
            result.setAreaBasemodel(param.getAreaBasemodel());
        }
        if(null != param.getAreaBasedata()){
            result.setAreaBasedata(param.getAreaBasedata());
        }
        if(null != param.getAreaListmodel()){
            result.setAreaListmodel(param.getAreaListmodel());
        }
        if(null != param.getAreaListdata()){
            result.setAreaListdata(param.getAreaListdata());
        }
        return result;
    }

    public static AreaContentDTO toAreaContentDTO(AreaContentDO param){
        AreaContentDTO result = new AreaContentDTO();
        if(null != param.getId()){
            result.setId(param.getId());
        }
        if(null != param.getAreaId()){
            result.setAreaId(param.getAreaId());
        }
        if(null != param.getAreaBasemodel()){
            result.setAreaBasemodel(param.getAreaBasemodel());
        }
        if(null != param.getAreaBasedata()){
            result.setAreaBasedata(param.getAreaBasedata());
        }
        if(null != param.getAreaListmodel()){
            result.setAreaListmodel(param.getAreaListmodel());
        }
        if(null != param.getAreaListdata()){
            result.setAreaListdata(param.getAreaListdata());
        }
        return result;
    }
}
