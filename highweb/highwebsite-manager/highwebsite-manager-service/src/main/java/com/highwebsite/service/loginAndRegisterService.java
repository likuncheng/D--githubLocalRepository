package com.highwebsite.service;

import java.util.List;

import com.highwebsite.pojo.DoaTUser;
import com.highwebsite.pojo.DoaTUser1;
import com.highwebsite.pojo.LoginedUser;
import com.highwebsite.pojo.registerUser;

public interface loginAndRegisterService {

	public DoaTUser selectUser(DoaTUser user);
	public DoaTUser1 selectUser1(DoaTUser1 user1);
	public void insertUser(DoaTUser user);
	public registerUser selectByphone(registerUser registeruser);
	//插入一条数据
	public void insertOne(LoginedUser loginedUser);
	//根据phone删除一条记录
	public void deleteByPhone(String phone);
	//根据phone查询一条记录
	public LoginedUser selectByPhone(String phone);
}
