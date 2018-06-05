package com.highwebsite.mapper;

import com.highwebsite.pojo.TComRegi;
import com.highwebsite.pojo.TComRegiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TComRegiMapper {
    int countByExample(TComRegiExample example);

    int deleteByExample(TComRegiExample example);

    int deleteByPrimaryKey(String registerId);

    int insert(TComRegi record);

    int insertSelective(TComRegi record);

    List<TComRegi> selectByExample(TComRegiExample example);

    TComRegi selectByPrimaryKey(String registerId);

    int updateByExampleSelective(@Param("record") TComRegi record, @Param("example") TComRegiExample example);

    int updateByExample(@Param("record") TComRegi record, @Param("example") TComRegiExample example);

    int updateByPrimaryKeySelective(TComRegi record);

    int updateByPrimaryKey(TComRegi record);
}