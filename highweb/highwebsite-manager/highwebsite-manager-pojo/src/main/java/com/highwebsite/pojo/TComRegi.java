package com.highwebsite.pojo;

import java.util.Date;

public class TComRegi {
    private String registerId;

    private String passwd;

    private Date startDate;

    private Date endDate;

    private Date dataDate;

    private String null1;

    private String null2;

    private String null3;

    private String null4;

    private String null5;

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId == null ? null : registerId.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
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