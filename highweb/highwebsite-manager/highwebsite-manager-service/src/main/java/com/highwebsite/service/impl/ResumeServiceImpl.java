package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highwebsite.mapper1.ResumeMapper;
import com.highwebsite.pojo.T_CAND_IN_1;
import com.highwebsite.pojo.T_CAND_IN_2;
import com.highwebsite.pojo.T_CAND_IN_3;
import com.highwebsite.service.ResumeService;
@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeMapper resumeMapper;
	@Override
	public T_CAND_IN_2 findUserInformationByPhone(String phone) {
		T_CAND_IN_2 t_CAND_IN_2 = resumeMapper.findUserInformationByPhone(phone);
		return t_CAND_IN_2;
	}
	@Override
	public String findPresentCondition(String phone) {
		String presentCondition = resumeMapper.findPresentCondition(phone);
		return presentCondition;
	}
	@Override
	public void updatePresentCondition(String null3) {
		resumeMapper.updatePresentCondition(null3);		
	}
	@Override
	public T_CAND_IN_1 findT_CAND_IN_1ByPhone(String phone) {
		T_CAND_IN_1 t_CAND_IN_1 = resumeMapper.findT_CAND_IN_1ByPhone(phone);
		return t_CAND_IN_1;
	}
	@Override
	public void updateJobexperience1(T_CAND_IN_1 t_CAND_IN_1) {
		resumeMapper.updateJobexperience1(t_CAND_IN_1);		
	}
	@Override
	public void updateJobexperience2(T_CAND_IN_1 t_CAND_IN_1) {
		resumeMapper.updateJobexperience2(t_CAND_IN_1);		
	}
	@Override
	public T_CAND_IN_1 findCompanysIsNull(String null4) {
		T_CAND_IN_1 t_CAND_IN_1 = resumeMapper.findCompanysIsNull(null4);
		return t_CAND_IN_1;
	}
	@Override
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandCompany1(T_CAND_IN_1 t_CAND_IN_1) {
		T_CAND_IN_1 t_CAND_IN_11 = resumeMapper.findT_CAND_IN_1ByPhoneandCompany1(t_CAND_IN_1);
		return t_CAND_IN_11;
	}
	@Override
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandCompany2(T_CAND_IN_1 t_CAND_IN_1) {
		T_CAND_IN_1 t_CAND_IN_11 = resumeMapper.findT_CAND_IN_1ByPhoneandCompany2(t_CAND_IN_1);
		return t_CAND_IN_11;
	}
	@Override
	public T_CAND_IN_1 findSchoolsIsNull(String phone) {
		T_CAND_IN_1 t_CAND_IN_1 = resumeMapper.findSchoolsIsNull(phone);
		return t_CAND_IN_1;
	}
	@Override
	public void updateschool1(T_CAND_IN_1 t_CAND_IN_1) {
		resumeMapper.updateschool1(t_CAND_IN_1);
		
	}
	@Override
	public void updateschool2(T_CAND_IN_1 t_CAND_IN_1) {
		resumeMapper.updateschool2(t_CAND_IN_1);
		
	}
	@Override
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandSchool1(T_CAND_IN_1 t_CAND_IN_1) {
		T_CAND_IN_1 t_CAND_IN_11 = resumeMapper.findT_CAND_IN_1ByPhoneandSchool1(t_CAND_IN_1);
		return t_CAND_IN_11;
	}
	@Override
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandSchool2(T_CAND_IN_1 t_CAND_IN_1) {
		T_CAND_IN_1 T_CAND_IN_11 = resumeMapper.findT_CAND_IN_1ByPhoneandSchool2(t_CAND_IN_1);
		return T_CAND_IN_11;
	}
	@Override
	public List<T_CAND_IN_3> findProjectByPhone(String phone) {
		List<T_CAND_IN_3> list = resumeMapper.findProjectByPhone(phone);
		return list;
	}
	@Override
	public void UpdateProjectById(T_CAND_IN_3 t_CAND_IN_3) {
		resumeMapper.UpdateProjectById(t_CAND_IN_3);
		
	}
	@Override
	public List<T_CAND_IN_3> findOpusByPhone(String phone) {
		List<T_CAND_IN_3> list = resumeMapper.findOpusByPhone(phone);
		return list;
	}
	@Override
	public void UpdateOpusById(T_CAND_IN_3 t_CAND_IN_3) {
		resumeMapper.UpdateOpusById(t_CAND_IN_3);
		
	}
	@Override
	public String findself_descriptionByNull4(String phone) {
		String self_description = resumeMapper.findself_descriptionByNull4(phone);
		return self_description;
	}
	@Override
	public void updateself_descriptionByNull4(T_CAND_IN_1 t_CAND_IN_1) {
		resumeMapper.updateself_descriptionByNull4(t_CAND_IN_1);
		
	}
	@Override
	public T_CAND_IN_1 findexpectedByNull4(String phone) {
		T_CAND_IN_1 t_CAND_IN_1 = resumeMapper.findexpectedByNull4(phone);
		return t_CAND_IN_1;
	}
	@Override
	public void updateexpectedByNull4(T_CAND_IN_1 t_CAND_IN_1) {
		resumeMapper.updateexpectedByNull4(t_CAND_IN_1);	
	}
	@Override
	public void InsertProjectByPhone(T_CAND_IN_3 t_CAND_IN_3) {
		resumeMapper.InsertProjectByPhone(t_CAND_IN_3);		
	}
	@Override
	public T_CAND_IN_3 findProjectById(int id) {
		T_CAND_IN_3 t_CAND_IN_3 = resumeMapper.findProjectById(id);
		return t_CAND_IN_3;
	}
	@Override
	public T_CAND_IN_3 findOpusById(int id) {
		T_CAND_IN_3 t_CAND_IN_3 = resumeMapper.findOpusById(id);
		return t_CAND_IN_3;
	}
	@Override
	public void InsertOpusByPhone(T_CAND_IN_3 t_CAND_IN_3) {
		resumeMapper.InsertOpusByPhone(t_CAND_IN_3);	
	}

}
