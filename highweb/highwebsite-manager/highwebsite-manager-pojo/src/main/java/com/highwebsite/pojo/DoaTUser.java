package com.highwebsite.pojo;

import java.util.Date;

public class DoaTUser {
    private String userId;

    private String registId;

    private String registPasswd;

    private String name;

    private Date birth;

    private Boolean gender;

    private String phone;

    private String address;

    private String email;

    private String psapk;

    private Date registerDrcDate;

    private String post;

    private String politic;

    private String null3;

    private String null4;

    private String null5;

    private String null6;

    private String null7;
    
    

    @Override
	public String toString() {
		return "DoaTUser [userId=" + userId + ", registId=" + registId + ", registPasswd=" + registPasswd + ", name="
				+ name + ", birth=" + birth + ", gender=" + gender + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", psapk=" + psapk + ", registerDrcDate=" + registerDrcDate + ", post=" + post
				+ ", politic=" + politic + ", null3=" + null3 + ", null4=" + null4 + ", null5=" + null5 + ", null6="
				+ null6 + ", null7=" + null7 + "]";
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRegistId() {
        return registId;
    }

    public void setRegistId(String registId) {
        this.registId = registId == null ? null : registId.trim();
    }

    public String getRegistPasswd() {
        return registPasswd;
    }

    public void setRegistPasswd(String registPasswd) {
        this.registPasswd = registPasswd == null ? null : registPasswd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPsapk() {
        return psapk;
    }

    public void setPsapk(String psapk) {
        this.psapk = psapk == null ? null : psapk.trim();
    }

    public Date getRegisterDrcDate() {
        return registerDrcDate;
    }

    public void setRegisterDrcDate(Date registerDrcDate) {
        this.registerDrcDate = registerDrcDate;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getPolitic() {
        return politic;
    }

    public void setPolitic(String politic) {
        this.politic = politic == null ? null : politic.trim();
    }

    public String getNull3() {
        return null3;
    }

    public void setNull3(String null3) {
        this.null3 = null3 == null ? null : null3.trim();
    }

    public String getNull4() {
        return null4;
    }

    public void setNull4(String null4) {
        this.null4 = null4 == null ? null : null4.trim();
    }

    public String getNull5() {
        return null5;
    }

    public void setNull5(String null5) {
        this.null5 = null5 == null ? null : null5.trim();
    }

    public String getNull6() {
        return null6;
    }

    public void setNull6(String null6) {
        this.null6 = null6 == null ? null : null6.trim();
    }

    public String getNull7() {
        return null7;
    }

    public void setNull7(String null7) {
        this.null7 = null7 == null ? null : null7.trim();
    }
}