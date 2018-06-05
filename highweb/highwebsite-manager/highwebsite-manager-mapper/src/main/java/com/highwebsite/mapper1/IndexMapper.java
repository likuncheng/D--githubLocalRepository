package com.highwebsite.mapper1;

import java.util.List;

import com.highwebsite.pojo.CompanyDetails;
import com.highwebsite.pojo.IndexJobCompany;
import com.highwebsite.pojo.T_ACT;
import com.highwebsite.pojo.T_AD;
import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.pojo.T_Com_InfoVo;
import com.highwebsite.pojo.T_JOB_PUB;
import com.highwebsite.pojo.T_JOB_PUBListVo;

public interface IndexMapper {

	
	public List<T_JOB_PUB> findAllJobs();
	
	public List<T_JOB_PUB> findJobsByCategory(T_JOB_PUB t_JOB_PUB);
	
	public List<T_Com_Info> findT_Com_InfoByLocation(T_Com_Info t_Com_Info);
	
	public T_Com_Info findT_Com_InfoByLogo(T_Com_Info t_Com_Info);
	
	public List<IndexJobCompany> findIndexJobCompany(IndexJobCompany indexJobCompany);
	
	public List<T_ACT> findAllActive(T_ACT t_ACT);
	
	public List<T_AD> findAllT_ADs();
	//根据职位名和公司名称查询出职位详情页面所需要的数据
	public T_Com_InfoVo findT_Com_InfoVoByJobAndCompanyname(T_Com_InfoVo T_Com_InfoVo);
	//根据一个职位名称查询所有的该职位（包括发布该职位的公司），这并不是一对多
	public List<T_Com_InfoVo> findT_Com_InfoVoByJob(T_Com_InfoVo T_Com_InfoVo);
	//根据一个公司名称查询出该公司的详细信息和该公司发布的所有职位，还有该公司的所有面试评价
	public CompanyDetails findCompanyDetails(String company_name);
	//根据职位名称模糊查询所有的职位还有该职位对应的公司信息
	public List<T_JOB_PUBListVo> findJobsByName(String job);
	//根据公司名称模糊查询所有对应的公司
	public List<T_Com_Info> findCompanysByName(String company_name);
}
