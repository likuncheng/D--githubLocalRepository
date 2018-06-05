package com.highwebsite.service;

import java.util.List;

import com.highwebsite.pojo.AllConditionForCompanys;
import com.highwebsite.pojo.Industry_categroyclass;
import com.highwebsite.pojo.T_Com_Info;

public interface CompanyListService {

		//根据公司的street模糊查询出所有的公司名称
		public List<String> findcompany_nameByStreet(String street);
		//根据公司的region查询出所有在该region下的公司详细信息
		public List<T_Com_Info> findCompanysByRegion(String region);
		//根据companyList页面的行业领域作为参数来模糊查询出对应的industry_categroy的所有公司详细信息
		public List<T_Com_Info> findCompanysByIndustry_categroy(Industry_categroyclass industry_categroyclass);
		//根据企业规模来查询出所有符合条件的公司
		public List<T_Com_Info> findCompanysByScale(String company_scale);
		//根据企业性质；来查询出所有符合条件的公司
		public List<T_Com_Info> findCompanysByType(String company_type);
		//他妈的前面四个方法没用，白写了
		//根据street,region,industry_categroy查询综合查询公司的详细信息
		public List<T_Com_Info> findCompanysByAllCondition(AllConditionForCompanys allConditionForCompanys);
}
