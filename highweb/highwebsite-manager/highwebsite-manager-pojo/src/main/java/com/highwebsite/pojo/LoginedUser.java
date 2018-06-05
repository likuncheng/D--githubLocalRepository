package com.highwebsite.pojo;

public class LoginedUser {

	private String phone;
	private String regist_passwd;
	
	public LoginedUser() {
		
	}
		
	public LoginedUser(String phone, String regist_passwd) {
		this.phone = phone;
		this.regist_passwd = regist_passwd;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegist_passwd() {
		return regist_passwd;
	}
	public void setRegist_passwd(String regist_passwd) {
		this.regist_passwd = regist_passwd;
	}
	@Override
	public String toString() {
		return "LoginedUser [phone=" + phone + ", regist_passwd=" + regist_passwd + "]";
	}
	
}
