package com.highwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/loginAndRegist")
	public String showloginAndRegist(){
		return "loginAndRegist";
	}
	
	@RequestMapping("/index")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/jobList")
	public String showjobList(){
		return "jobList";
	}
	
	@RequestMapping("/jobDetails")
	public String showjobDetails(){
		return "jobDetails";
	}
	
	@RequestMapping("/companyList")
	public String showcompanyList(){
		return "companyList";
	}
	
	@RequestMapping("/companyDetails")
	public String showcompanyDetails(){
		return "companyDetails";
	}
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/resume")
	public String resume(){
		return "resume";
	}
	
	@RequestMapping("/recommend")
	public String recommend(){
		return "recommend";
	}
}