package com.highwebsite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highwebsite.pojo.AllConditionForCompanys;
import com.highwebsite.pojo.FenyePage;
import com.highwebsite.pojo.Industry_categroyclass;
import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.service.CompanyListService;

@Controller
public class CompanyListController {

	@Autowired
	private CompanyListService companyListService;
	
	public static int totalCount=0;//一共有多少条记录
	public static int RepresentPage=1;//当前页数
	public static int pageCount=4;//一页展示多少条记录
	public static int totalPage=0;//一共有多少页
	
	@RequestMapping("/findcompany_nameByStreetMethod")
	@ResponseBody
	public List<String> findcompany_nameByStreetMethod(String street){
		List<String> list = companyListService.findcompany_nameByStreet(street);
		for (String string : list) {
			System.out.println(string);
		}
		return list;
	}
	
	@RequestMapping("/findCompanysByRegionMethod")
	@ResponseBody
	public List<T_Com_Info> findCompanysByRegionMethod(String region){
		List<T_Com_Info> list = companyListService.findCompanysByRegion(region);
		for (T_Com_Info t_Com_Info : list) {
			System.out.println(t_Com_Info);
		}
		return list;
	}
	
	@RequestMapping("/findCompanysByIndustry_categroyMethod")
	@ResponseBody
	public List<T_Com_Info> findCompanysByIndustry_categroyMethod(@RequestBody Industry_categroyclass categroy){
		List<T_Com_Info> list = companyListService.findCompanysByIndustry_categroy(categroy);
		for (T_Com_Info t_Com_Info : list) {
			System.out.println(t_Com_Info);
		}
		return list;
	}
	
	@RequestMapping("/findCompanysByScaleMethod")
	@ResponseBody
	public List<T_Com_Info> findCompanysByScaleMethod(String company_scale){
		List<T_Com_Info> list = companyListService.findCompanysByScale(company_scale);
		for (T_Com_Info t_Com_Info : list) {
			System.out.println(t_Com_Info);
		}
		return list;
	}
	
	@RequestMapping("/findCompanysByTypeMethod")
	@ResponseBody
	public List<T_Com_Info> findCompanysByTypeMethod(String company_type){
		List<T_Com_Info> list = companyListService.findCompanysByType(company_type);
		for (T_Com_Info t_Com_Info : list) {
			System.out.println(t_Com_Info);
		}
		return list;
	}
	
	@RequestMapping("/findCompanysByAllConditionMethod")
	@ResponseBody
	public List<T_Com_Info> findCompanysByAllConditionMethod(@RequestBody AllConditionForCompanys allConditionForCompanys){
		
		System.out.println(allConditionForCompanys.getStreet()+"--"+allConditionForCompanys.getRegion()+"--"+allConditionForCompanys.getCompany_scale()+"--"+allConditionForCompanys.getCompany_type());
		List<String> list1 = allConditionForCompanys.getCategroys();
		if(list1!=null && list1.size()>0){
			for (String string : list1) {
				System.out.println(string);
			}
		}
		List<T_Com_Info> list = companyListService.findCompanysByAllCondition(allConditionForCompanys);
		for (T_Com_Info t_Com_Info : list) {
			System.out.println(t_Com_Info);
		}
		return list;
	}
	
	@RequestMapping("/fenyeResultMethod")
	@ResponseBody
	public List<T_Com_Info> fenyeMethod(@RequestBody List<T_Com_Info> data){
		totalCount = data.size();
		if(totalCount%pageCount!=0){
			totalPage = totalCount/pageCount+1;
		}
		else{
			totalPage = totalCount/pageCount;
		}
		
		List<T_Com_Info> newdate = new ArrayList<>();
		for(int i=0;i<data.size();i++){
			if((i>=(RepresentPage-1)*pageCount)&&(i<(RepresentPage)*pageCount)){
				System.out.println(data.get(i));
				newdate.add(data.get(i));
			}
		}
		System.out.println("fenyeResultMethod");
		System.out.println("totalCount:"+totalCount+"--"+"RepresentPage:"+RepresentPage+"--"+"pageCount:"+pageCount+"--"+"totalPage:"+totalPage);
		return newdate;
	}
	
	@RequestMapping("/fenyeSetMethod")
	@ResponseBody
	public FenyePage fenyeSetMethod(int representPage){
		FenyePage fenyePage = new FenyePage();
		fenyePage.setTotalCount(totalCount);
		fenyePage.setRepresentPage(representPage);
		RepresentPage=representPage;
		fenyePage.setPageCount(pageCount);
		fenyePage.setTotalPage(totalPage);
		System.out.println("fenyeSetMethod");
		System.out.println("totalCount:"+totalCount+"--"+"RepresentPage:"+RepresentPage+"--"+"pageCount:"+pageCount+"--"+"totalPage:"+totalPage);
		return fenyePage;
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/testMethod")
	@ResponseBody
	public Industry_categroyclass testMethod(@RequestBody Industry_categroyclass categroy){
		System.out.println("进来了");
		List<String> list = categroy.getCategroys();
		for (String string : list) {
			System.out.println(string);
		}
		return categroy;
	}	
	
	
}
