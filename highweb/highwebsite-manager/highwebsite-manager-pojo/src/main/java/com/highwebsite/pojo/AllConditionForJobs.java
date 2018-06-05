package com.highwebsite.pojo;

import java.util.List;

public class AllConditionForJobs {

	private String region;//区域
	private List<String> categroys;//行业领域
	private String salarysmall;//薪资下限
	private String salarybig;//薪资上限
	private String experience_requiredsmall;//工作年限下限
	private String experience_requiredbig;//工作年限上限
	private String company_type;//企业性质
	private String education_required;//学历要求
	private String release_timesmall;//发布日期
	private String release_timebig;//发布日期
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
	public String getSalarysmall() {
		return salarysmall;
	}
	public void setSalarysmall(String salarysmall) {
		this.salarysmall = salarysmall;
	}
	public String getSalarybig() {
		return salarybig;
	}
	public void setSalarybig(String salarybig) {
		this.salarybig = salarybig;
	}
	public String getExperience_requiredsmall() {
		return experience_requiredsmall;
	}
	public void setExperience_requiredsmall(String experience_requiredsmall) {
		this.experience_requiredsmall = experience_requiredsmall;
	}
	public String getExperience_requiredbig() {
		return experience_requiredbig;
	}
	public void setExperience_requiredbig(String experience_requiredbig) {
		this.experience_requiredbig = experience_requiredbig;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	public String getEducation_required() {
		return education_required;
	}
	public void setEducation_required(String education_required) {
		this.education_required = education_required;
	}
	
	public String getRelease_timesmall() {
		return release_timesmall;
	}
	public void setRelease_timesmall(String release_timesmall) {
		this.release_timesmall = release_timesmall;
	}
	public String getRelease_timebig() {
		return release_timebig;
	}
	public void setRelease_timebig(String release_timebig) {
		this.release_timebig = release_timebig;
	}
	@Override
	public String toString() {
		return "AllConditionForJobs [region=" + region + ", categroys=" + categroys + ", salarysmall=" + salarysmall
				+ ", salarybig=" + salarybig + ", experience_requiredsmall=" + experience_requiredsmall
				+ ", experience_requiredbig=" + experience_requiredbig + ", company_type=" + company_type
				+ ", education_required=" + education_required + ", release_timesmall=" + release_timesmall
				+ ", release_timebig=" + release_timebig + "]";
	}
	
}
