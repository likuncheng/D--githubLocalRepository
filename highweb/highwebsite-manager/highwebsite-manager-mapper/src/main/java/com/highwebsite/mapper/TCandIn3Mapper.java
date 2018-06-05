package com.highwebsite.mapper;

import com.highwebsite.pojo.TCandIn3;
import com.highwebsite.pojo.TCandIn3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCandIn3Mapper {
    int countByExample(TCandIn3Example example);

    int deleteByExample(TCandIn3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCandIn3 record);

    int insertSelective(TCandIn3 record);

    List<TCandIn3> selectByExample(TCandIn3Example example);

    TCandIn3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCandIn3 record, @Param("example") TCandIn3Example example);

    int updateByExample(@Param("record") TCandIn3 record, @Param("example") TCandIn3Example example);

    int updateByPrimaryKeySelective(TCandIn3 record);

    int updateByPrimaryKey(TCandIn3 record);
}