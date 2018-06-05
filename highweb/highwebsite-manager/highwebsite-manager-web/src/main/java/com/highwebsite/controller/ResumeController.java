package com.highwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highwebsite.pojo.T_CAND_IN_1;
import com.highwebsite.pojo.T_CAND_IN_2;
import com.highwebsite.pojo.T_CAND_IN_3;
import com.highwebsite.service.ResumeService;

@Controller
public class ResumeController {

	@Autowired
	private ResumeService resumeService;
	
	@RequestMapping("/findUserInformationByPhoneMethod")
	@ResponseBody
	public T_CAND_IN_2 findUserInformationByPhoneMethod(String phone){
		T_CAND_IN_2 t_CAND_IN_2 = resumeService.findUserInformationByPhone(phone);
		//System.out.println(t_CAND_IN_2);
		return t_CAND_IN_2;
	}
	
	@RequestMapping("/findPresentConditionMethod")
	@ResponseBody
	public T_CAND_IN_2 findPresentConditionMethod(String phone){
		String presentCondition = resumeService.findPresentCondition(phone);
		//System.out.println(presentCondition);
		T_CAND_IN_2 t_CAND_IN_2 = new T_CAND_IN_2();
		t_CAND_IN_2.setNull3(presentCondition);
		return t_CAND_IN_2;
	}
	
	@RequestMapping("/updatePresentConditionMethod")
	@ResponseBody
	public String updatePresentConditionMethod(String null3){
		resumeService.updatePresentCondition(null3);
		return "true";
	}
	
	@RequestMapping("/findT_CAND_IN_1ByPhoneMethod")
	@ResponseBody
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneMethod(String phone){
		T_CAND_IN_1 t_CAND_IN_1 = resumeService.findT_CAND_IN_1ByPhone(phone);
		//System.out.println(t_CAND_IN_1);
		return t_CAND_IN_1;
	}
	
	@RequestMapping("/updateJobexperience1Method")
	@ResponseBody
	public String updateJobexperience1Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		resumeService.updateJobexperience1(t_CAND_IN_1);
		return "true";
	}
	
	@RequestMapping("/updateJobexperience2Method")
	@ResponseBody
	public String updateJobexperience2Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		resumeService.updateJobexperience2(t_CAND_IN_1);
		return "true";
	}
	
	@RequestMapping("/findCompanysIsNullMethod")
	@ResponseBody
	public T_CAND_IN_1 findCompanysIsNullMethod(String null4){
		T_CAND_IN_1 t_CAND_IN_1 = resumeService.findCompanysIsNull(null4);
		String result = t_CAND_IN_1.getPrevious_company_1()+","+t_CAND_IN_1.getPrevious_company_2();
		//System.out.println(result);
		return t_CAND_IN_1;
	}
	
	@RequestMapping("/findT_CAND_IN_1ByPhoneandCompany1Method")
	@ResponseBody
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandCompany1Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		T_CAND_IN_1 t_CAND_IN_11 = resumeService.findT_CAND_IN_1ByPhoneandCompany1(t_CAND_IN_1);
		//System.out.println(t_CAND_IN_11);
		return t_CAND_IN_11;
	}
	
	@RequestMapping("/findT_CAND_IN_1ByPhoneandCompany2Method")
	@ResponseBody
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandCompany2Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		T_CAND_IN_1 t_CAND_IN_11 = resumeService.findT_CAND_IN_1ByPhoneandCompany2(t_CAND_IN_1);
		//System.out.println(t_CAND_IN_11);
		return t_CAND_IN_11;
	}
	
	@RequestMapping("/findSchoolsIsNullMethod")
	@ResponseBody
	public String findSchoolsIsNullMethod(String phone){
		T_CAND_IN_1  t_CAND_IN_1  = resumeService.findSchoolsIsNull(phone);
		String school1 = t_CAND_IN_1.getSchool_1();
		String school2 = t_CAND_IN_1.getSchool_2();
		//System.out.println(school1+","+school2);
		if(school1!=null&&school1!=""&&school2!=null&&school2!=""){
			return "true";
		}
		else{
			return "false";
		}
	}
	
	@RequestMapping("/updateschool1Method")
	@ResponseBody
	public String updateschool1Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		resumeService.updateschool1(t_CAND_IN_1);
		return "true";
	}
	
	@RequestMapping("/updateschool2Method")
	@ResponseBody
	public String updateschool2Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		resumeService.updateschool2(t_CAND_IN_1);
		return "true";
	}
	
	@RequestMapping("/findT_CAND_IN_1ByPhoneandSchool1Method")
	@ResponseBody
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandSchool1Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		T_CAND_IN_1 t_CAND_IN_11 = resumeService.findT_CAND_IN_1ByPhoneandSchool1(t_CAND_IN_1);
		//System.out.println(t_CAND_IN_11);
		return t_CAND_IN_11;
	}
	
	@RequestMapping("/findT_CAND_IN_1ByPhoneandSchool2Method")
	@ResponseBody
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandSchool2Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		T_CAND_IN_1 t_CAND_IN_11 = resumeService.findT_CAND_IN_1ByPhoneandSchool2(t_CAND_IN_1);
		//System.out.println(t_CAND_IN_11);
		return t_CAND_IN_11;
	}
	
	@RequestMapping("/findProjectByPhoneMethod")
	@ResponseBody
	public List<T_CAND_IN_3> findProjectByPhoneMethod(String phone){
		List<T_CAND_IN_3> list = resumeService.findProjectByPhone(phone);
//		for (T_CAND_IN_3 t_CAND_IN_3 : list) {
//			System.out.println(t_CAND_IN_3);
//		}
		return list;
	}
	
	@RequestMapping("/UpdateProjectByIdMethod")
	@ResponseBody
	public String UpdateProjectByIdMethod(@RequestBody T_CAND_IN_3 t_CAND_IN_3){
		resumeService.UpdateProjectById(t_CAND_IN_3);
		return "true";
	}
	
	@RequestMapping("/InsertProjectByPhoneMethod")
	@ResponseBody
	public String InsertProjectByPhoneMethod(@RequestBody T_CAND_IN_3 t_CAND_IN_3){
		resumeService.InsertProjectByPhone(t_CAND_IN_3);
		return "true";
	}
	
	@RequestMapping("/findProjectByIdMethod")
	@ResponseBody
	public T_CAND_IN_3 findProjectByIdMethod(int id){
		T_CAND_IN_3 t_CAND_IN_3 = resumeService.findProjectById(id);
		//System.out.println(t_CAND_IN_3);
		return t_CAND_IN_3;
	}
	
	@RequestMapping("/findOpusByPhoneMethod")
	@ResponseBody
	public List<T_CAND_IN_3> findOpusByPhoneMethod(String phone){
		List<T_CAND_IN_3> list = resumeService.findOpusByPhone(phone);
//		for (T_CAND_IN_3 t_CAND_IN_3 : list) {
//			System.out.println(t_CAND_IN_3);
//		}
		return list;
	}
	
	@RequestMapping("/UpdateOpusByIdMethod")
	@ResponseBody
	public String UpdateOpusByIdMethod(@RequestBody T_CAND_IN_3 t_CAND_IN_3){
		resumeService.UpdateOpusById(t_CAND_IN_3);
		return "true";
	}
	
	@RequestMapping("/findOpusByIdMethod")
	@ResponseBody
	public T_CAND_IN_3 findOpusByIdMethod(int id){
		T_CAND_IN_3 t_CAND_IN_3 = resumeService.findOpusById(id);
		//System.out.println(t_CAND_IN_3);
		return t_CAND_IN_3;
	}
	
	@RequestMapping("/InsertOpusByPhoneMethod")
	@ResponseBody
	public String InsertOpusByPhoneMethod(@RequestBody T_CAND_IN_3 t_CAND_IN_3){
		resumeService.InsertOpusByPhone(t_CAND_IN_3);
		return "true";
	}
	
	@RequestMapping("/findself_descriptionByNull4Method")
	@ResponseBody
	public T_CAND_IN_1 findself_descriptionByNull4Method(String phone){
		String self_description = resumeService.findself_descriptionByNull4(phone);
		//System.out.println(self_description);
		T_CAND_IN_1 t_CAND_IN_1 = new T_CAND_IN_1();
		t_CAND_IN_1.setSelf_description(self_description);
		return t_CAND_IN_1;
	}
	
	@RequestMapping("/updateself_descriptionByNull44Method")
	@ResponseBody
	public String updateself_descriptionByNull44Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		resumeService.updateself_descriptionByNull4(t_CAND_IN_1);
		return "true";
	}
	
	@RequestMapping("/findexpectedByNull4Method")
	@ResponseBody
	public T_CAND_IN_1 findexpectedByNull4Method(String phone){
		T_CAND_IN_1 t_CAND_IN_1 = resumeService.findexpectedByNull4(phone);
		//System.out.println(t_CAND_IN_1);
		return t_CAND_IN_1;
	}
	
	@RequestMapping("/updateexpectedByNull4Method")
	@ResponseBody
	public String updateexpectedByNull4Method(@RequestBody T_CAND_IN_1 t_CAND_IN_1){
		resumeService.updateexpectedByNull4(t_CAND_IN_1);
		return "true";
	}
	
}
