package com.highwebsite.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highwebsite.pojo.CompanyDetails;
import com.highwebsite.pojo.IndexJobCompany;
import com.highwebsite.pojo.T_ACT;
import com.highwebsite.pojo.T_AD;
import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.pojo.T_Com_InfoVo;
import com.highwebsite.pojo.T_INT_EVA;
import com.highwebsite.pojo.T_JOB_PUB;
import com.highwebsite.pojo.T_JOB_PUBListVo;
import com.highwebsite.pojo.T_JOB_PUBVo;
import com.highwebsite.service.IndexService;

@Controller
public class indexController {
	
	@Autowired
	private IndexService indexService;
	
	
	@RequestMapping("/findT_Com_InfoByLocationMethod")
	@ResponseBody
	public List<T_Com_Info> findT_Com_InfoByLocationMethod(T_Com_Info t_Com_Info){
		List<T_Com_Info> list = indexService.findT_Com_InfoByLocation(t_Com_Info);		
		return list;
	}
	
	@RequestMapping("/findT_Com_InfoByLogoMethod")
	@ResponseBody
	public T_Com_Info findT_Com_InfoByLogoMethod(T_Com_Info t_Com_Info){
		T_Com_Info t_com_Info = indexService.findT_Com_InfoByLogo(t_Com_Info);
		return t_com_Info;
	}
	
	@RequestMapping("/findIndexJobCompanyMethod")
	@ResponseBody
	public List<IndexJobCompany> findIndexJobCompanyMethod(IndexJobCompany indexJobCompany){
		List<IndexJobCompany> list = indexService.findIndexJobCompany(indexJobCompany);
		return list;
	}
	
	@RequestMapping("/findAllActiveMethod")
	@ResponseBody
	public List<T_ACT> findAllActiveMethod(T_ACT t_ACT){
		List<T_ACT> list = indexService.findAllActive(t_ACT);		
		return list;
	}
	
	@RequestMapping("/findJobsByCategoryMethod")
	@ResponseBody
	public List<T_JOB_PUB> findJobsByCategoryMethod(T_JOB_PUB t_JOB_PUB){
		List<T_JOB_PUB> list = indexService.findJobsByCategory(t_JOB_PUB);
		return list;
	}
	
	@RequestMapping("/findAllJobsMethod")
	@ResponseBody
	public List<T_JOB_PUB> findAllJobsMethod(){
		List<T_JOB_PUB> list = indexService.findAllJobs();		
		return list;
	}
	
	@RequestMapping("/findAllT_ADsMethod")
	@ResponseBody
	public List<T_AD> findAllT_ADsMethod(){
		List<T_AD> list = indexService.findAllT_ADs();
		return list;
	}
	
	//根据职位名和公司查询出该公司这个职位的详情
	@RequestMapping("/findT_Com_InfoVoByJobAndCompanynameMethod")
	@ResponseBody
	public T_Com_InfoVo findT_Com_InfoVoByJobAndCompanynameMethod(T_Com_InfoVo T_Com_InfoVo){
		try{
			T_Com_InfoVo t_Com_InfoVo = indexService.findT_Com_InfoVoByJobAndCompanyname(T_Com_InfoVo);
			System.out.println(t_Com_InfoVo.toString());
			System.out.println(t_Com_InfoVo.toString1());
			System.out.println("ffsdfsdfd");
			return t_Com_InfoVo;
		}catch(Exception e){
			System.out.println("-------controller抛异常了");
			e.printStackTrace();
			return null;
		}
	}
	
	//根据职位名查询所有的该职位(即每个公司发布的该职位),他妈的这个方法多余了
	@RequestMapping("/findT_Com_InfoVoByJobMethod")
	@ResponseBody
	public List<T_Com_InfoVo> findT_Com_InfoVoByJobMethod(T_Com_InfoVo T_Com_InfoVo){
		List<T_Com_InfoVo> list = indexService.findT_Com_InfoVoByJob(T_Com_InfoVo);
		for (T_Com_InfoVo t_Com_InfoVo2 : list) {
			System.out.println("=================================================================================");
			System.out.println(t_Com_InfoVo2.toString());
			System.out.println(t_Com_InfoVo2.toString1());
		}
		return list;
	}
	
	//根据一个公司名称查询出该公司的详细信息和该公司发布的所有职位，还有该公司的所有面试评价
	@RequestMapping("/findCompanyDetailsMethod")
	@ResponseBody
	public CompanyDetails findCompanyDetailsMethod(String company_name){
		CompanyDetails companyDetails = indexService.findCompanyDetails(company_name);		
		System.out.println(companyDetails);
		List<T_JOB_PUBVo> joblist = companyDetails.getJoblist();
		for (T_JOB_PUBVo t_JOB_PUBVo : joblist) {
			System.out.println("==========================================");
			System.out.println(t_JOB_PUBVo);
			List<T_INT_EVA> evalist = t_JOB_PUBVo.getEvalist();
			for (T_INT_EVA t_INT_EVA : evalist) {
				System.out.println(t_INT_EVA);
			}
		}
		return companyDetails;
	}
	
	//根据职位名称模糊查询所有的职位还有该职位所对应的公司信息
	@RequestMapping("/findJobsByNameMethod")
	@ResponseBody
	public List<T_JOB_PUBListVo> findJobsByNameMethod(String job){
		List<T_JOB_PUBListVo> list = indexService.findJobsByName(job);
		return list;
	}
	
	//根据公司名称模糊查询所有对应的公司
	@RequestMapping("/findCompanysByNameMethod")
	@ResponseBody
	public List<T_Com_Info> findCompanysByNameMethod(String company_name){
		List<T_Com_Info> list = indexService.findCompanysByName(company_name);
		return list;
	}
	
	//查询用户是否登录
	@RequestMapping("/findUserMethod")
	@ResponseBody
	public String findUserMethod(String a,HttpServletRequest request){		
		HttpSession session = request.getSession(false);			
		if(session!=null){
			Enumeration enumeration =session.getAttributeNames();
			while(enumeration.hasMoreElements()){
				String sessionKey=enumeration.nextElement().toString();//获取session中的键值
				if(sessionKey.equals("sessionName")){
					String phone = (String) session.getAttribute("sessionName");
					return phone;
				}
			}
			return "false";
		}
		else{
			return "false";
		}
		
	}
}
