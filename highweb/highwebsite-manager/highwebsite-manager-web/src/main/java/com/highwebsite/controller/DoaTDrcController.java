package com.highwebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highwebsite.pojo.DoaTDrc;
import com.highwebsite.service.DoaTDrcService;

@Controller
public class DoaTDrcController {

	@Autowired
	private DoaTDrcService doaTDrcService;
	
	@RequestMapping("/DoaTDrc/{md5}")
	@ResponseBody
	public DoaTDrc getDoaTDrcBymd5(@PathVariable String md5){
		DoaTDrc doaTDrc = doaTDrcService.getDoaTDrcBymd5(md5);
		return doaTDrc;
	}
}
