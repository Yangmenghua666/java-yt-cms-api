package yt.parent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import yt.parent.model.PageDO;
import yt.parent.model.PageExample;
@Mapper
public interface PageMapper {
    long countByExample(PageExample example);

    int deleteByExample(PageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PageDO record);

    int insertSelective(PageDO record);

    List<PageDO> selectByExample(PageExample example);

    PageDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PageDO record, @Param("example") PageExample example);

    int updateByExample(@Param("record") PageDO record, @Param("example") PageExample example);

    int updateByPrimaryKeySelective(PageDO record);

    int updateByPrimaryKey(PageDO record);
}