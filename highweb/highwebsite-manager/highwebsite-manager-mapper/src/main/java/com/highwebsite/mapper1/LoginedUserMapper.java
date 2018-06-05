package com.highwebsite.mapper1;

import com.highwebsite.pojo.LoginedUser;

public interface LoginedUserMapper {

	//插入一条数据
	public void insertOne(LoginedUser loginedUser);
	//根据phone删除一条记录
	public void deleteByPhone(String phone);
	//根据phone查询一条记录
	public LoginedUser selectByPhone(String phone);
}
