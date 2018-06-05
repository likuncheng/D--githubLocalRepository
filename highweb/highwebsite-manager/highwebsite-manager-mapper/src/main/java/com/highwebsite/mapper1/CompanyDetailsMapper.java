package com.highwebsite.mapper1;

import java.util.List;

import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.pojo.T_INT_EVA;
import com.highwebsite.pojo.T_JOB_PUB;

public interface CompanyDetailsMapper {

	//根据公司名字查询出公司发布的所有职位
	public List<T_JOB_PUB> findAllJobsByCompanyName(String company_name);
	//根据公司名字查询出该公司的所有面试评价-
	public List<T_INT_EVA> findAllEvasByCompanyName(String company_name);
	//根据公司名字查询出该公司的详细信息
	public T_Com_Info findCompanyByName(String company_name);
}
