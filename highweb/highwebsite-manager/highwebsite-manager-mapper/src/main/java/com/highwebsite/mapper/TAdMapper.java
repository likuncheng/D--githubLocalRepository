package com.highwebsite.mapper;

import com.highwebsite.pojo.TAd;
import com.highwebsite.pojo.TAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdMapper {
    int countByExample(TAdExample example);

    int deleteByExample(TAdExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(TAd record);

    int insertSelective(TAd record);

    List<TAd> selectByExample(TAdExample example);

    TAd selectByPrimaryKey(String companyId);

    int updateByExampleSelective(@Param("record") TAd record, @Param("example") TAdExample example);

    int updateByExample(@Param("record") TAd record, @Param("example") TAdExample example);

    int updateByPrimaryKeySelective(TAd record);

    int updateByPrimaryKey(TAd record);
}