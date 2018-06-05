package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.highwebsite.mapper1.IndexMapper;
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
@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexMapper indexMapper;
	

	@Override
	public List<T_Com_Info> findT_Com_InfoByLocation(T_Com_Info t_Com_Info) {
		List<T_Com_Info> list = indexMapper.findT_Com_InfoByLocation(t_Com_Info);
		return list;
	}
	@Override
	public T_Com_Info findT_Com_InfoByLogo(T_Com_Info t_Com_Info) {
		T_Com_Info t_com_Info = indexMapper.findT_Com_InfoByLogo(t_Com_Info);
		return t_com_Info;
	}
	@Override
	public List<IndexJobCompany> findIndexJobCompany(IndexJobCompany indexJobCompany) {
		List<IndexJobCompany> list = indexMapper.findIndexJobCompany(indexJobCompany);			
		return list;
	}
	@Override
	public List<T_ACT> findAllActive(T_ACT t_ACT) {
		List<T_ACT> list = indexMapper.findAllActive(t_ACT);
		return list;
	}
	@Override
	public List<T_JOB_PUB> findJobsByCategory(T_JOB_PUB t_JOB_PUB) {
		List<T_JOB_PUB> list = indexMapper.findJobsByCategory(t_JOB_PUB);
		return list;
	}
	@Override
	public List<T_JOB_PUB> findAllJobs() {
		List<T_JOB_PUB> list = indexMapper.findAllJobs();
		return list;
	}
	@Override
	public List<T_AD> findAllT_ADs() {
		List<T_AD> list = indexMapper.findAllT_ADs();
		return list;
	}
	@Override
	public T_Com_InfoVo findT_Com_InfoVoByJobAndCompanyname(T_Com_InfoVo T_Com_InfoVo){
		try{
			T_Com_InfoVo t_Com_InfoVo = indexMapper.findT_Com_InfoVoByJobAndCompanyname(T_Com_InfoVo);
			return t_Com_InfoVo;
		}catch(Exception e){
			System.out.println("-------serviceImpl抛异常了");
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<T_Com_InfoVo> findT_Com_InfoVoByJob(T_Com_InfoVo T_Com_InfoVo) {
		List<T_Com_InfoVo> list = indexMapper.findT_Com_InfoVoByJob(T_Com_InfoVo);
		return list;
	}
	@Override
	public CompanyDetails findCompanyDetails(String company_name) {
		CompanyDetails companyDetails = indexMapper.findCompanyDetails(company_name);
		return companyDetails;
	}
	@Override
	public List<T_JOB_PUBListVo> findJobsByName(String job) {
		List<T_JOB_PUBListVo> list = indexMapper.findJobsByName(job);
		return list;
	}
	@Override
	public List<T_Com_Info> findCompanysByName(String company_name) {
		List<T_Com_Info> list = indexMapper.findCompanysByName(company_name);
		return list;
	}
	
		
}
