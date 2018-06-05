package com.highwebsite.mapper;

import com.highwebsite.pojo.DoaTPubKey;
import com.highwebsite.pojo.DoaTPubKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoaTPubKeyMapper {
    int countByExample(DoaTPubKeyExample example);

    int deleteByExample(DoaTPubKeyExample example);

    int deleteByPrimaryKey(String userId);

    int insert(DoaTPubKey record);

    int insertSelective(DoaTPubKey record);

    List<DoaTPubKey> selectByExample(DoaTPubKeyExample example);

    DoaTPubKey selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") DoaTPubKey record, @Param("example") DoaTPubKeyExample example);

    int updateByExample(@Param("record") DoaTPubKey record, @Param("example") DoaTPubKeyExample example);

    int updateByPrimaryKeySelective(DoaTPubKey record);

    int updateByPrimaryKey(DoaTPubKey record);
}