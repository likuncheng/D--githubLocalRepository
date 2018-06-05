package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highwebsite.mapper1.CompanyDetailsMapper;
import com.highwebsite.pojo.T_Com_Info;
import com.highwebsite.pojo.T_INT_EVA;
import com.highwebsite.pojo.T_JOB_PUB;
import com.highwebsite.service.CompanyDetailsService;
@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService {

	@Autowired
	private CompanyDetailsMapper companyDetailsMapper;
	@Override
	public List<T_JOB_PUB> findAllJobsByCompanyName(String company_name) {
		List<T_JOB_PUB> list = companyDetailsMapper.findAllJobsByCompanyName(company_name);
		return list;
	}

	@Override
	public List<T_INT_EVA> findAllEvasByCompanyName(String company_name) {
		List<T_INT_EVA> list = companyDetailsMapper.findAllEvasByCompanyName(company_name);
		return list;
	}

	@Override
	public T_Com_Info findCompanyByName(String company_name) {
		T_Com_Info t_Com_Info = companyDetailsMapper.findCompanyByName(company_name);
		return t_Com_Info;
	}

}
