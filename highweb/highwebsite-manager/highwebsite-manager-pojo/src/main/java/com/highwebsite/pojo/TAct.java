package com.highwebsite.pojo;

import java.util.Date;

public class TAct {
    private Integer id;

    private String posterAddress;

    private String introduction;

    private Date deadline;

    private String md5;

    private Date startDate;

    private Date dataDate;

    private Date endDate;

    private String null1;

    private String null2;

    private String null3;

    private String null4;

    private String null5;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosterAddress() {
        return posterAddress;
    }

    public void setPosterAddress(String posterAddress) {
        this.posterAddress = posterAddress == null ? null : posterAddress.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}