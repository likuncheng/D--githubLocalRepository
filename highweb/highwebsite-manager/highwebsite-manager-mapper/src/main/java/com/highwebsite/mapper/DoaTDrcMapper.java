package com.highwebsite.mapper;

import com.highwebsite.pojo.DoaTDrc;
import com.highwebsite.pojo.DoaTDrcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoaTDrcMapper {
    int countByExample(DoaTDrcExample example);

    int deleteByExample(DoaTDrcExample example);

    int deleteByPrimaryKey(String md5);

    int insert(DoaTDrc record);

    int insertSelective(DoaTDrc record);

    List<DoaTDrc> selectByExample(DoaTDrcExample example);

    DoaTDrc selectByPrimaryKey(String md5);

    int updateByExampleSelective(@Param("record") DoaTDrc record, @Param("example") DoaTDrcExample example);

    int updateByExample(@Param("record") DoaTDrc record, @Param("example") DoaTDrcExample example);

    int updateByPrimaryKeySelective(DoaTDrc record);

    int updateByPrimaryKey(DoaTDrc record);
}