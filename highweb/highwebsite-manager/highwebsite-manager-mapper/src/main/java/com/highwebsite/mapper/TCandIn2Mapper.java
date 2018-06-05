package com.highwebsite.mapper;

import com.highwebsite.pojo.TCandIn2;
import com.highwebsite.pojo.TCandIn2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCandIn2Mapper {
    int countByExample(TCandIn2Example example);

    int deleteByExample(TCandIn2Example example);

    int deleteByPrimaryKey(String userId);

    int insert(TCandIn2 record);

    int insertSelective(TCandIn2 record);

    List<TCandIn2> selectByExample(TCandIn2Example example);

    TCandIn2 selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TCandIn2 record, @Param("example") TCandIn2Example example);

    int updateByExample(@Param("record") TCandIn2 record, @Param("example") TCandIn2Example example);

    int updateByPrimaryKeySelective(TCandIn2 record);

    int updateByPrimaryKey(TCandIn2 record);
}