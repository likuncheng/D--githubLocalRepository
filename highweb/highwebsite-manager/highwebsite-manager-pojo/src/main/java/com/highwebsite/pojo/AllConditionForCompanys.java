package com.highwebsite.pojo;

import java.util.List;

public class AllConditionForCompanys {

	private String street;
	private String region;
	private String company_scale;
	private String company_type;
	private List<String> categroys;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public List<String> getCategroys() {
		return categroys;
	}
	public void setCategroys(List<String> categroys) {
		this.categroys = categroys;
	}
	public String getCompany_scale() {
		return company_scale;
	}
	public void setCompany_scale(String company_scale) {
		this.company_scale = company_scale;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	
}
