package com.highwebsite.pojo;

import java.util.Date;
import java.util.List;

public class CompanyDetails extends T_Com_Info{
	
	private List<T_JOB_PUBVo> joblist;

	public List<T_JOB_PUBVo> getJoblist() {
		return joblist;
	}

	public void setJoblist(List<T_JOB_PUBVo> joblist) {
		this.joblist = joblist;
	}
	
	public CompanyDetails(){
		
	}
}
