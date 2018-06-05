package com.highwebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoaTUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoaTUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRegistIdIsNull() {
            addCriterion("regist_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistIdIsNotNull() {
            addCriterion("regist_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistIdEqualTo(String value) {
            addCriterion("regist_id =", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotEqualTo(String value) {
            addCriterion("regist_id <>", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdGreaterThan(String value) {
            addCriterion("regist_id >", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdGreaterThanOrEqualTo(String value) {
            addCriterion("regist_id >=", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLessThan(String value) {
            addCriterion("regist_id <", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLessThanOrEqualTo(String value) {
            addCriterion("regist_id <=", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLike(String value) {
            addCriterion("regist_id like", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotLike(String value) {
            addCriterion("regist_id not like", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdIn(List<String> values) {
            addCriterion("regist_id in", values, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotIn(List<String> values) {
            addCriterion("regist_id not in", values, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdBetween(String value1, String value2) {
            addCriterion("regist_id between", value1, value2, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotBetween(String value1, String value2) {
            addCriterion("regist_id not between", value1, value2, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdIsNull() {
            addCriterion("regist_passwd is null");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdIsNotNull() {
            addCriterion("regist_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdEqualTo(String value) {
            addCriterion("regist_passwd =", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdNotEqualTo(String value) {
            addCriterion("regist_passwd <>", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdGreaterThan(String value) {
            addCriterion("regist_passwd >", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("regist_passwd >=", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdLessThan(String value) {
            addCriterion("regist_passwd <", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdLessThanOrEqualTo(String value) {
            addCriterion("regist_passwd <=", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdLike(String value) {
            addCriterion("regist_passwd like", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdNotLike(String value) {
            addCriterion("regist_passwd not like", value, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdIn(List<String> values) {
            addCriterion("regist_passwd in", values, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdNotIn(List<String> values) {
            addCriterion("regist_passwd not in", values, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdBetween(String value1, String value2) {
            addCriterion("regist_passwd between", value1, value2, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andRegistPasswdNotBetween(String value1, String value2) {
            addCriterion("regist_passwd not between", value1, value2, "registPasswd");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPsapkIsNull() {
            addCriterion("PSAPK is null");
            return (Criteria) this;
        }

        public Criteria andPsapkIsNotNull() {
            addCriterion("PSAPK is not null");
            return (Criteria) this;
        }

        public Criteria andPsapkEqualTo(String value) {
            addCriterion("PSAPK =", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkNotEqualTo(String value) {
            addCriterion("PSAPK <>", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkGreaterThan(String value) {
            addCriterion("PSAPK >", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkGreaterThanOrEqualTo(String value) {
            addCriterion("PSAPK >=", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkLessThan(String value) {
            addCriterion("PSAPK <", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkLessThanOrEqualTo(String value) {
            addCriterion("PSAPK <=", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkLike(String value) {
            addCriterion("PSAPK like", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkNotLike(String value) {
            addCriterion("PSAPK not like", value, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkIn(List<String> values) {
            addCriterion("PSAPK in", values, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkNotIn(List<String> values) {
            addCriterion("PSAPK not in", values, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkBetween(String value1, String value2) {
            addCriterion("PSAPK between", value1, value2, "psapk");
            return (Criteria) this;
        }

        public Criteria andPsapkNotBetween(String value1, String value2) {
            addCriterion("PSAPK not between", value1, value2, "psapk");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateIsNull() {
            addCriterion("register_drc_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateIsNotNull() {
            addCriterion("register_drc_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateEqualTo(Date value) {
            addCriterion("register_drc_date =", value, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateNotEqualTo(Date value) {
            addCriterion("register_drc_date <>", value, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateGreaterThan(Date value) {
            addCriterion("register_drc_date >", value, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_drc_date >=", value, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateLessThan(Date value) {
            addCriterion("register_drc_date <", value, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateLessThanOrEqualTo(Date value) {
            addCriterion("register_drc_date <=", value, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateIn(List<Date> values) {
            addCriterion("register_drc_date in", values, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateNotIn(List<Date> values) {
            addCriterion("register_drc_date not in", values, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateBetween(Date value1, Date value2) {
            addCriterion("register_drc_date between", value1, value2, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDrcDateNotBetween(Date value1, Date value2) {
            addCriterion("register_drc_date not between", value1, value2, "registerDrcDate");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPoliticIsNull() {
            addCriterion("politic is null");
            return (Criteria) this;
        }

        public Criteria andPoliticIsNotNull() {
            addCriterion("politic is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticEqualTo(String value) {
            addCriterion("politic =", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotEqualTo(String value) {
            addCriterion("politic <>", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticGreaterThan(String value) {
            addCriterion("politic >", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticGreaterThanOrEqualTo(String value) {
            addCriterion("politic >=", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticLessThan(String value) {
            addCriterion("politic <", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticLessThanOrEqualTo(String value) {
            addCriterion("politic <=", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticLike(String value) {
            addCriterion("politic like", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotLike(String value) {
            addCriterion("politic not like", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticIn(List<String> values) {
            addCriterion("politic in", values, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotIn(List<String> values) {
            addCriterion("politic not in", values, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticBetween(String value1, String value2) {
            addCriterion("politic between", value1, value2, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotBetween(String value1, String value2) {
            addCriterion("politic not between", value1, value2, "politic");
            return (Criteria) this;
        }

        public Criteria andNull3IsNull() {
            addCriterion("null3 is null");
            return (Criteria) this;
        }

        public Criteria andNull3IsNotNull() {
            addCriterion("null3 is not null");
            return (Criteria) this;
        }

        public Criteria andNull3EqualTo(String value) {
            addCriterion("null3 =", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3NotEqualTo(String value) {
            addCriterion("null3 <>", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3GreaterThan(String value) {
            addCriterion("null3 >", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3GreaterThanOrEqualTo(String value) {
            addCriterion("null3 >=", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3LessThan(String value) {
            addCriterion("null3 <", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3LessThanOrEqualTo(String value) {
            addCriterion("null3 <=", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3Like(String value) {
            addCriterion("null3 like", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3NotLike(String value) {
            addCriterion("null3 not like", value, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3In(List<String> values) {
            addCriterion("null3 in", values, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3NotIn(List<String> values) {
            addCriterion("null3 not in", values, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3Between(String value1, String value2) {
            addCriterion("null3 between", value1, value2, "null3");
            return (Criteria) this;
        }

        public Criteria andNull3NotBetween(String value1, String value2) {
            addCriterion("null3 not between", value1, value2, "null3");
            return (Criteria) this;
        }

        public Criteria andNull4IsNull() {
            addCriterion("null4 is null");
            return (Criteria) this;
        }

        public Criteria andNull4IsNotNull() {
            addCriterion("null4 is not null");
            return (Criteria) this;
        }

        public Criteria andNull4EqualTo(String value) {
            addCriterion("null4 =", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4NotEqualTo(String value) {
            addCriterion("null4 <>", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4GreaterThan(String value) {
            addCriterion("null4 >", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4GreaterThanOrEqualTo(String value) {
            addCriterion("null4 >=", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4LessThan(String value) {
            addCriterion("null4 <", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4LessThanOrEqualTo(String value) {
            addCriterion("null4 <=", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4Like(String value) {
            addCriterion("null4 like", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4NotLike(String value) {
            addCriterion("null4 not like", value, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4In(List<String> values) {
            addCriterion("null4 in", values, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4NotIn(List<String> values) {
            addCriterion("null4 not in", values, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4Between(String value1, String value2) {
            addCriterion("null4 between", value1, value2, "null4");
            return (Criteria) this;
        }

        public Criteria andNull4NotBetween(String value1, String value2) {
            addCriterion("null4 not between", value1, value2, "null4");
            return (Criteria) this;
        }

        public Criteria andNull5IsNull() {
            addCriterion("null5 is null");
            return (Criteria) this;
        }

        public Criteria andNull5IsNotNull() {
            addCriterion("null5 is not null");
            return (Criteria) this;
        }

        public Criteria andNull5EqualTo(String value) {
            addCriterion("null5 =", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5NotEqualTo(String value) {
            addCriterion("null5 <>", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5GreaterThan(String value) {
            addCriterion("null5 >", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5GreaterThanOrEqualTo(String value) {
            addCriterion("null5 >=", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5LessThan(String value) {
            addCriterion("null5 <", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5LessThanOrEqualTo(String value) {
            addCriterion("null5 <=", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5Like(String value) {
            addCriterion("null5 like", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5NotLike(String value) {
            addCriterion("null5 not like", value, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5In(List<String> values) {
            addCriterion("null5 in", values, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5NotIn(List<String> values) {
            addCriterion("null5 not in", values, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5Between(String value1, String value2) {
            addCriterion("null5 between", value1, value2, "null5");
            return (Criteria) this;
        }

        public Criteria andNull5NotBetween(String value1, String value2) {
            addCriterion("null5 not between", value1, value2, "null5");
            return (Criteria) this;
        }

        public Criteria andNull6IsNull() {
            addCriterion("null6 is null");
            return (Criteria) this;
        }

        public Criteria andNull6IsNotNull() {
            addCriterion("null6 is not null");
            return (Criteria) this;
        }

        public Criteria andNull6EqualTo(String value) {
            addCriterion("null6 =", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6NotEqualTo(String value) {
            addCriterion("null6 <>", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6GreaterThan(String value) {
            addCriterion("null6 >", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6GreaterThanOrEqualTo(String value) {
            addCriterion("null6 >=", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6LessThan(String value) {
            addCriterion("null6 <", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6LessThanOrEqualTo(String value) {
            addCriterion("null6 <=", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6Like(String value) {
            addCriterion("null6 like", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6NotLike(String value) {
            addCriterion("null6 not like", value, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6In(List<String> values) {
            addCriterion("null6 in", values, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6NotIn(List<String> values) {
            addCriterion("null6 not in", values, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6Between(String value1, String value2) {
            addCriterion("null6 between", value1, value2, "null6");
            return (Criteria) this;
        }

        public Criteria andNull6NotBetween(String value1, String value2) {
            addCriterion("null6 not between", value1, value2, "null6");
            return (Criteria) this;
        }

        public Criteria andNull7IsNull() {
            addCriterion("null7 is null");
            return (Criteria) this;
        }

        public Criteria andNull7IsNotNull() {
            addCriterion("null7 is not null");
            return (Criteria) this;
        }

        public Criteria andNull7EqualTo(String value) {
            addCriterion("null7 =", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7NotEqualTo(String value) {
            addCriterion("null7 <>", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7GreaterThan(String value) {
            addCriterion("null7 >", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7GreaterThanOrEqualTo(String value) {
            addCriterion("null7 >=", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7LessThan(String value) {
            addCriterion("null7 <", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7LessThanOrEqualTo(String value) {
            addCriterion("null7 <=", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7Like(String value) {
            addCriterion("null7 like", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7NotLike(String value) {
            addCriterion("null7 not like", value, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7In(List<String> values) {
            addCriterion("null7 in", values, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7NotIn(List<String> values) {
            addCriterion("null7 not in", values, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7Between(String value1, String value2) {
            addCriterion("null7 between", value1, value2, "null7");
            return (Criteria) this;
        }

        public Criteria andNull7NotBetween(String value1, String value2) {
            addCriterion("null7 not between", value1, value2, "null7");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}