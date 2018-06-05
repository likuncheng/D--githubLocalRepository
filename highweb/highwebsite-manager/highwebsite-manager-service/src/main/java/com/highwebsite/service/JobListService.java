package com.highwebsite.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.highwebsite.pojo.AllConditionForJobs;
import com.highwebsite.pojo.JobListBean;

public interface JobListService {

	//根据公司的street模糊查询出所有的公司名称
	public List<String> findcompany_nameByStreet_job(String street);
	//根据页面所有的查询条件查询出所有对应公司的详细信息
	public List<JobListBean> findJobsByAllCondition(AllConditionForJobs allConditionForJobs);
}
