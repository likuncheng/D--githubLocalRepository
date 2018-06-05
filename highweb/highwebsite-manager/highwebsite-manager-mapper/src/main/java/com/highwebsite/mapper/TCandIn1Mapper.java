package com.highwebsite.mapper;

import com.highwebsite.pojo.TCandIn1;
import com.highwebsite.pojo.TCandIn1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCandIn1Mapper {
    int countByExample(TCandIn1Example example);

    int deleteByExample(TCandIn1Example example);

    int deleteByPrimaryKey(String userId);

    int insert(TCandIn1 record);

    int insertSelective(TCandIn1 record);

    List<TCandIn1> selectByExample(TCandIn1Example example);

    TCandIn1 selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TCandIn1 record, @Param("example") TCandIn1Example example);

    int updateByExample(@Param("record") TCandIn1 record, @Param("example") TCandIn1Example example);

    int updateByPrimaryKeySelective(TCandIn1 record);

    int updateByPrimaryKey(TCandIn1 record);
}