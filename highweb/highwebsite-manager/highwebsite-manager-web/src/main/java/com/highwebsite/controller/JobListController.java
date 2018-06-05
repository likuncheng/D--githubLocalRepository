package com.highwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highwebsite.pojo.AllConditionForJobs;
import com.highwebsite.pojo.JobListBean;
import com.highwebsite.service.JobListService;

@Controller
public class JobListController {

	@Autowired
	private JobListService jobListService;
	
	@RequestMapping("/findcompany_nameByStreet_jobMethod")
	@ResponseBody
	public List<String> findcompany_nameByStreet_jobMethod(String street){
		List<String> list = jobListService.findcompany_nameByStreet_job(street);
		for (String string : list) {
			System.out.println(string);
		}
		return list;
	}
	
	@RequestMapping("/findJobsByAllConditionMethod")
	@ResponseBody
	public List<JobListBean> findJobsByAllConditionMethod(@RequestBody AllConditionForJobs allConditionForJobs){
		List<JobListBean> list = jobListService.findJobsByAllCondition(allConditionForJobs);
		if(list!=null){
			for (JobListBean jobListBean : list) {
				System.out.println(jobListBean);
			}
		}
		return list;
	}
	
}
