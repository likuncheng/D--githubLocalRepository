package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highwebsite.mapper1.JobListMapper;
import com.highwebsite.pojo.AllConditionForJobs;
import com.highwebsite.pojo.JobListBean;
import com.highwebsite.service.JobListService;
@Service
public class JobListServiceImpl implements JobListService {

	@Autowired
	private JobListMapper jobListMapper;
	@Override
	public List<String> findcompany_nameByStreet_job(String street) {
		List<String> list = jobListMapper.findcompany_nameByStreet_job(street);
		return list;
	}

	@Override
	public List<JobListBean> findJobsByAllCondition(AllConditionForJobs allConditionForJobs) {
		List<JobListBean> list = jobListMapper.findJobsByAllCondition(allConditionForJobs);
		return list;
	}

}
