package yt.parent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import yt.parent.model.AreaDO;
import yt.parent.model.AreaExample;
@Mapper
public interface AreaMapper {
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaDO record);

    int insertSelective(AreaDO record);

    List<AreaDO> selectByExample(AreaExample example);

    AreaDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaDO record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") AreaDO record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(AreaDO record);

    int updateByPrimaryKey(AreaDO record);
}