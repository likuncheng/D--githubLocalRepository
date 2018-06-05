package com.highwebsite.mapper;

import com.highwebsite.pojo.DoaTUser;
import com.highwebsite.pojo.DoaTUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoaTUserMapper {
    int countByExample(DoaTUserExample example);

    int deleteByExample(DoaTUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(DoaTUser record);

    int insertSelective(DoaTUser record);

    List<DoaTUser> selectByExample(DoaTUserExample example);

    DoaTUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") DoaTUser record, @Param("example") DoaTUserExample example);

    int updateByExample(@Param("record") DoaTUser record, @Param("example") DoaTUserExample example);

    int updateByPrimaryKeySelective(DoaTUser record);

    int updateByPrimaryKey(DoaTUser record);
    
    DoaTUser selectDoaTUserByDoaTUser(DoaTUser doaTUser);
    
}