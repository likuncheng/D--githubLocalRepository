package com.highwebsite.pojo;

import java.util.Date;

public class TCandIn3 {
    private Integer id;

    private String userId;

    private String projectName;

    private String projectProfile;

    private String display;

    private String md5;

    private Date startTime;

    private Date endTime;

    private String null1;

    private String null2;

    private String null3;

    private String null4;

    private String null5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectProfile() {
        return projectProfile;
    }

    public void setProjectProfile(String projectProfile) {
        this.projectProfile = projectProfile == null ? null : projectProfile.trim();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getNull1() {
        return null1;
    }

    public void setNull1(String null1) {
        this.null1 = null1 == null ? null : null1.trim();
    }

    public String getNull2() {
        return null2;
    }

    public void setNull2(String null2) {
        this.null2 = null2 == null ? null : null2.trim();
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
}