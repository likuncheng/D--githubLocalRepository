package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highwebsite.mapper.DoaTUserMapper;
import com.highwebsite.mapper.DoaTUserMapper1;
import com.highwebsite.mapper.registerUserMapper;
import com.highwebsite.mapper1.LoginedUserMapper;
import com.highwebsite.pojo.DoaTUser;
import com.highwebsite.pojo.DoaTUser1;
import com.highwebsite.pojo.DoaTUserExample;
import com.highwebsite.pojo.DoaTUserExample.Criteria;
import com.highwebsite.pojo.LoginedUser;
import com.highwebsite.pojo.registerUser;
import com.highwebsite.service.loginAndRegisterService;
import com.highwebsite.webUtils.serviceUtils;
@Service
public class loginAndRegisterServiceImpl implements loginAndRegisterService {

	@Autowired
	private DoaTUserMapper doaTUserMapper;
	
	@Autowired(required =true)
	private DoaTUserMapper1 doaTUserMapper1;
	
	@Autowired(required =true)
	private registerUserMapper registerUsermapper;
	
	@Autowired(required =true)
	private LoginedUserMapper loginedUserMapper;
	
	@Override
	public DoaTUser selectUser(DoaTUser user) {
		DoaTUserExample example = new DoaTUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(user.getPhone());
		List<DoaTUser> list = doaTUserMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			DoaTUser doaTUser = list.get(0);
			//System.out.println(doaTUser.getPhone()+":"+doaTUser.getRegistPasswd());
			return doaTUser;
		}		
			return null;
	}
	@Override
	public void insertUser(DoaTUser user) {
		if(user!=null){
			StringBuilder s = new StringBuilder();
			for(int i=0;i<5;i++){
				s.append(Math.floor(Math.random()*10 + 1));
			}
			System.out.println("s:"+s);
			user.setUserId(s.toString());
			user.setRegistPasswd(serviceUtils.md5(user.getRegistPasswd()));
			int a = doaTUserMapper.insert(user);
			System.out.println("a:"+a);
		}
	}

	@Override
	public DoaTUser1 selectUser1(DoaTUser1 user1) {
		user1.setRegist_passwd(serviceUtils.md5(user1.getRegist_passwd()));		
		System.out.println("user1: "+user1);
		DoaTUser1 doaTUser1 = doaTUserMapper1.findDoaTUserByDoaTUser(user1);
		System.out.println(doaTUser1);
		if(doaTUser1!=null){
			System.out.println(doaTUser1.getPhone()+":"+doaTUser1.getRegist_passwd());
			return doaTUser1;
		}
			return null;
	}
	@Override
	public registerUser selectByphone(registerUser registeruser) {
		registerUser registeruser1 = registerUsermapper.selectByphone(registeruser);
		return registeruser1;
	}
	@Override
	public void insertOne(LoginedUser loginedUser) {
		
		loginedUser.setRegist_passwd(serviceUtils.md5(loginedUser.getRegist_passwd()));
		loginedUserMapper.insertOne(loginedUser);		
	}
	@Override
	public void deleteByPhone(String phone) {
		loginedUserMapper.deleteByPhone(phone);
		
	}
	@Override
	public LoginedUser selectByPhone(String phone) {
		LoginedUser loginedUser = loginedUserMapper.selectByPhone(phone);
		return loginedUser;
	}
	

}
