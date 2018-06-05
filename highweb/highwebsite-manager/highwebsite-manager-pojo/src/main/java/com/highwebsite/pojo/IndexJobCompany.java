package com.highwebsite.pojo;

public class IndexJobCompany {

	private String job;
	private String education_required;
	private String job_category;
	private String company_id;
	private String logo;
	private String company_name;
	private String industry_categroy;
	private String city;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEducation_required() {
		return education_required;
	}
	public void setEducation_required(String education_required) {
		this.education_required = education_required;
	}
	public String getJob_category() {
		return job_category;
	}
	public void setJob_category(String job_category) {
		this.job_category = job_category;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getIndustry_categroy() {
		return industry_categroy;
	}
	public void setIndustry_categroy(String industry_categroy) {
		this.industry_categroy = industry_categroy;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "IndexJobCompany [job=" + job + ", education_required=" + education_required + ", job_category="
				+ job_category + ", company_id=" + company_id + ", logo=" + logo + ", company_name=" + company_name
				+ ", industry_categroy=" + industry_categroy + ", city=" + city + "]";
	}
	
}
