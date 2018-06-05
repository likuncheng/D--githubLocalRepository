package com.highwebsite.mapper;

import com.highwebsite.pojo.TComInfo;
import com.highwebsite.pojo.TComInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TComInfoMapper {
    int countByExample(TComInfoExample example);

    int deleteByExample(TComInfoExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(TComInfo record);

    int insertSelective(TComInfo record);

    List<TComInfo> selectByExample(TComInfoExample example);

    TComInfo selectByPrimaryKey(String companyId);

    int updateByExampleSelective(@Param("record") TComInfo record, @Param("example") TComInfoExample example);

    int updateByExample(@Param("record") TComInfo record, @Param("example") TComInfoExample example);

    int updateByPrimaryKeySelective(TComInfo record);

    int updateByPrimaryKey(TComInfo record);
}