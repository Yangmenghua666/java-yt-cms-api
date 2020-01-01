package yt.parent.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yt.parent.model.AreaContentDO;
import yt.parent.model.AreaContentExample;

public interface AreaContentMapper {
    long countByExample(AreaContentExample example);

    int deleteByExample(AreaContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaContentDO record);

    int insertSelective(AreaContentDO record);

    List<AreaContentDO> selectByExample(AreaContentExample example);

    AreaContentDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaContentDO record, @Param("example") AreaContentExample example);

    int updateByExample(@Param("record") AreaContentDO record, @Param("example") AreaContentExample example);

    int updateByPrimaryKeySelective(AreaContentDO record);

    int updateByPrimaryKey(AreaContentDO record);
    /**
     * 根据区块ID查询区块模板信息
     * @param areaId-区块id
     * @title selectModelByAreaId
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return AreaContentDO
     */
    AreaContentDO selectModelByAreaId(@Param("areaId") Integer areaId);
    /**
     * 更新区块基本信息数据
     * @param record
     * @title updateBaseInfoContent
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return int
     */
    int updateBaseInfoContent(AreaContentDO record);
    /**
     * 更新区块列表信息数据
     * @param record
     * @title updateListInfoContent
     * @author yuanfei0241@hsyuntai.com
     * @since v1.0.0
     * @return int
     */
    int updateListInfoContent(AreaContentDO record);
}