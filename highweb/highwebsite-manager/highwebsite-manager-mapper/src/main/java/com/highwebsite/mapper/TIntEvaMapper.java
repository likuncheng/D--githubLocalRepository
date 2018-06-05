package com.highwebsite.mapper;

import com.highwebsite.pojo.TIntEva;
import com.highwebsite.pojo.TIntEvaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TIntEvaMapper {
    int countByExample(TIntEvaExample example);

    int deleteByExample(TIntEvaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TIntEva record);

    int insertSelective(TIntEva record);

    List<TIntEva> selectByExample(TIntEvaExample example);

    TIntEva selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TIntEva record, @Param("example") TIntEvaExample example);

    int updateByExample(@Param("record") TIntEva record, @Param("example") TIntEvaExample example);

    int updateByPrimaryKeySelective(TIntEva record);

    int updateByPrimaryKey(TIntEva record);
}