package com.highwebsite.mapper;

import com.highwebsite.pojo.TPersRegi;
import com.highwebsite.pojo.TPersRegiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPersRegiMapper {
    int countByExample(TPersRegiExample example);

    int deleteByExample(TPersRegiExample example);

    int deleteByPrimaryKey(String registerId);

    int insert(TPersRegi record);

    int insertSelective(TPersRegi record);

    List<TPersRegi> selectByExample(TPersRegiExample example);

    TPersRegi selectByPrimaryKey(String registerId);

    int updateByExampleSelective(@Param("record") TPersRegi record, @Param("example") TPersRegiExample example);

    int updateByExample(@Param("record") TPersRegi record, @Param("example") TPersRegiExample example);

    int updateByPrimaryKeySelective(TPersRegi record);

    int updateByPrimaryKey(TPersRegi record);
}