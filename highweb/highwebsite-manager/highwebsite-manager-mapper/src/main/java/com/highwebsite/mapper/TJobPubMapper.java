package com.highwebsite.mapper;

import com.highwebsite.pojo.TJobPub;
import com.highwebsite.pojo.TJobPubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJobPubMapper {
    int countByExample(TJobPubExample example);

    int deleteByExample(TJobPubExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TJobPub record);

    int insertSelective(TJobPub record);

    List<TJobPub> selectByExample(TJobPubExample example);

    TJobPub selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TJobPub record, @Param("example") TJobPubExample example);

    int updateByExample(@Param("record") TJobPub record, @Param("example") TJobPubExample example);

    int updateByPrimaryKeySelective(TJobPub record);

    int updateByPrimaryKey(TJobPub record);
}