package com.highwebsite.pojo;

public class JobListBean {

	private String job;
	private String null1;
	private String salary;
	private String education_required;
	private String experience_required;
	private String job_required;
	private String release_time;
	private String logo;
	private String company_name;
	private String company_type;
	private String industry_categroy;
	private String city;
	private String activity_degree;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getNull1() {
		return null1;
	}
	public void setNull1(String null1) {
		this.null1 = null1;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getEducation_required() {
		return education_required;
	}
	public void setEducation_required(String education_required) {
		this.education_required = education_required;
	}
	public String getExperience_required() {
		return experience_required;
	}
	public void setExperience_required(String experience_required) {
		this.experience_required = experience_required;
	}
	public String getJob_required() {
		return job_required;
	}
	public void setJob_required(String job_required) {
		this.job_required = job_required;
	}
	public String getRelease_time() {
		return release_time;
	}
	public void setRelease_time(String release_time) {
		this.release_time = release_time;
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
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
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
	public String getActivity_degree() {
		return activity_degree;
	}
	public void setActivity_degree(String activity_degree) {
		this.activity_degree = activity_degree;
	}
	@Override
	public String toString() {
		return "JobListBean [job=" + job + ", null1=" + null1 + ", salary=" + salary + ", education_required="
				+ education_required + ", experience_required=" + experience_required + ", job_required=" + job_required
				+ ", release_time=" + release_time + ", logo=" + logo + ", company_name=" + company_name
				+ ", company_type=" + company_type + ", industry_categroy=" + industry_categroy + ", city=" + city
				+ ", activity_degree=" + activity_degree + "]";
	}
	
}
