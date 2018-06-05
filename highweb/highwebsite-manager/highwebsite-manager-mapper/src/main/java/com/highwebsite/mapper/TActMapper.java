package com.highwebsite.mapper;

import com.highwebsite.pojo.TAct;
import com.highwebsite.pojo.TActExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TActMapper {
    int countByExample(TActExample example);

    int deleteByExample(TActExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAct record);

    int insertSelective(TAct record);

    List<TAct> selectByExampleWithBLOBs(TActExample example);

    List<TAct> selectByExample(TActExample example);

    TAct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAct record, @Param("example") TActExample example);

    int updateByExampleWithBLOBs(@Param("record") TAct record, @Param("example") TActExample example);

    int updateByExample(@Param("record") TAct record, @Param("example") TActExample example);

    int updateByPrimaryKeySelective(TAct record);

    int updateByPrimaryKeyWithBLOBs(TAct record);

    int updateByPrimaryKey(TAct record);
}