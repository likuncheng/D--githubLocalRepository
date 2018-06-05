package com.highwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.pojo.T_INT_EVA;
import com.highwebsite.pojo.T_JOB_PUB;
import com.highwebsite.service.CompanyDetailsService;

@Controller
public class CompanyDetailsController {

	@Autowired
	private CompanyDetailsService companyDetailsService;
	
	@RequestMapping("/findAllJobsByCompanyNameMethod")
	@ResponseBody
	public List<T_JOB_PUB> findAllJobsByCompanyNameMethod(String company_name){
		List<T_JOB_PUB> list = companyDetailsService.findAllJobsByCompanyName(company_name);
		return list;
	}
	
	@RequestMapping("/findAllEvasByCompanyNameMethod")
	@ResponseBody
	public List<T_INT_EVA> findAllEvasByCompanyNameMethod(String company_name){
		List<T_INT_EVA> list = companyDetailsService.findAllEvasByCompanyName(company_name);
		return list;
	}
	
	@RequestMapping("/findAllEvasCountByCompanyNameMethod")
	@ResponseBody
	public int findAllEvasCountByCompanyNameMethod(String company_name){
		List<T_INT_EVA> list = companyDetailsService.findAllEvasByCompanyName(company_name);
		return list.size();
	}
	
	@RequestMapping("/findCompanyByNameMethod")
	@ResponseBody
	public T_Com_Info findCompanyByNameMethod(String company_name){
		T_Com_Info t_Com_Info = companyDetailsService.findCompanyByName(company_name);
		return t_Com_Info;
	}
	
	@RequestMapping("/fenyeMethod")
	@ResponseBody
	public List<T_INT_EVA> fenyeMethod(String company_name,@RequestParam(required=true,defaultValue="1") String representPage, @RequestParam(required=false,defaultValue="3") Integer pageSize){
		//System.out.println(company_name+"--"+representPage+"--"+pageSize);
		PageHelper.startPage(Integer.parseInt(representPage), pageSize);
		List<T_INT_EVA> list = companyDetailsService.findAllEvasByCompanyName(company_name);
		PageInfo<T_INT_EVA> pageInfo = new PageInfo<T_INT_EVA>(list);
		List<T_INT_EVA> list1 = pageInfo.getList();
		return list1;
	}
}
