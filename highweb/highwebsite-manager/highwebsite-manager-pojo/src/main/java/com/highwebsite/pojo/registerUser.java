package com.highwebsite.pojo;

import javax.servlet.http.HttpServletRequest;

public class registerUser {

	private HttpServletRequest request;
	private String phone;
	private String registPasswd;
	private String identifyCode;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdentifyCode() {
		return identifyCode;
	}
	public void setIdentifyCode(String identifyCode) {
		this.identifyCode = identifyCode;
	}
	public String getRegistPasswd() {
		return registPasswd;
	}
	public void setRegistPasswd(String registPasswd) {
		this.registPasswd = registPasswd;
	}
	@Override
	public String toString() {
		return "registerUser [request=" + request + ", phone=" + phone + ", registPasswd=" + registPasswd
				+ ", identifyCode=" + identifyCode + "]";
	}
	
	
}
