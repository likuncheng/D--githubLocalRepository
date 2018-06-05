package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highwebsite.mapper1.CompanyListMapper;
import com.highwebsite.pojo.AllConditionForCompanys;
import com.highwebsite.pojo.Industry_categroyclass;
import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.service.CompanyListService;
@Service
public class CompanyListServiceImpl implements CompanyListService{

	@Autowired
	private CompanyListMapper companyListMapper;
	
	@Override
	public List<String> findcompany_nameByStreet(String street) {
		List<String> list = companyListMapper.findcompany_nameByStreet(street);
		return list;
	}

	@Override
	public List<T_Com_Info> findCompanysByRegion(String region) {
		List<T_Com_Info> list = companyListMapper.findCompanysByRegion(region);
		return list;
	}

	

	@Override
	public List<T_Com_Info> findCompanysByScale(String company_scale) {
		List<T_Com_Info> list = companyListMapper.findCompanysByScale(company_scale);
		return list;
	}

	@Override
	public List<T_Com_Info> findCompanysByType(String company_type) {
		List<T_Com_Info> list = companyListMapper.findCompanysByType(company_type);
		return list;
	}

	@Override
	public List<T_Com_Info> findCompanysByIndustry_categroy(Industry_categroyclass industry_categroyclass) {
		List<T_Com_Info> list = companyListMapper.findCompanysByIndustry_categroy(industry_categroyclass);
		return list;
	}

	@Override
	public List<T_Com_Info> findCompanysByAllCondition(AllConditionForCompanys allConditionForCompanys) {
		List<T_Com_Info> list = companyListMapper.findCompanysByAllCondition(allConditionForCompanys);
		return list;
	}

}
