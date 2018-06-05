package com.highwebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCandIn1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCandIn1Example() {
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
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andPositionAppliedIsNull() {
            addCriterion("position_applied is null");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedIsNotNull() {
            addCriterion("position_applied is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedEqualTo(String value) {
            addCriterion("position_applied =", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotEqualTo(String value) {
            addCriterion("position_applied <>", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedGreaterThan(String value) {
            addCriterion("position_applied >", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedGreaterThanOrEqualTo(String value) {
            addCriterion("position_applied >=", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedLessThan(String value) {
            addCriterion("position_applied <", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedLessThanOrEqualTo(String value) {
            addCriterion("position_applied <=", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedLike(String value) {
            addCriterion("position_applied like", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotLike(String value) {
            addCriterion("position_applied not like", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedIn(List<String> values) {
            addCriterion("position_applied in", values, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotIn(List<String> values) {
            addCriterion("position_applied not in", values, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedBetween(String value1, String value2) {
            addCriterion("position_applied between", value1, value2, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotBetween(String value1, String value2) {
            addCriterion("position_applied not between", value1, value2, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNull() {
            addCriterion("resume_name is null");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNotNull() {
            addCriterion("resume_name is not null");
            return (Criteria) this;
        }

        public Criteria andResumeNameEqualTo(String value) {
            addCriterion("resume_name =", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotEqualTo(String value) {
            addCriterion("resume_name <>", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThan(String value) {
            addCriterion("resume_name >", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThanOrEqualTo(String value) {
            addCriterion("resume_name >=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThan(String value) {
            addCriterion("resume_name <", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThanOrEqualTo(String value) {
            addCriterion("resume_name <=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLike(String value) {
            addCriterion("resume_name like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotLike(String value) {
            addCriterion("resume_name not like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameIn(List<String> values) {
            addCriterion("resume_name in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotIn(List<String> values) {
            addCriterion("resume_name not in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameBetween(String value1, String value2) {
            addCriterion("resume_name between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotBetween(String value1, String value2) {
            addCriterion("resume_name not between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1IsNull() {
            addCriterion("previous_company_1 is null");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1IsNotNull() {
            addCriterion("previous_company_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1EqualTo(String value) {
            addCriterion("previous_company_1 =", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1NotEqualTo(String value) {
            addCriterion("previous_company_1 <>", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1GreaterThan(String value) {
            addCriterion("previous_company_1 >", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1GreaterThanOrEqualTo(String value) {
            addCriterion("previous_company_1 >=", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1LessThan(String value) {
            addCriterion("previous_company_1 <", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1LessThanOrEqualTo(String value) {
            addCriterion("previous_company_1 <=", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1Like(String value) {
            addCriterion("previous_company_1 like", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1NotLike(String value) {
            addCriterion("previous_company_1 not like", value, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1In(List<String> values) {
            addCriterion("previous_company_1 in", values, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1NotIn(List<String> values) {
            addCriterion("previous_company_1 not in", values, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1Between(String value1, String value2) {
            addCriterion("previous_company_1 between", value1, value2, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany1NotBetween(String value1, String value2) {
            addCriterion("previous_company_1 not between", value1, value2, "previousCompany1");
            return (Criteria) this;
        }

        public Criteria andSchool1IsNull() {
            addCriterion("school_1 is null");
            return (Criteria) this;
        }

        public Criteria andSchool1IsNotNull() {
            addCriterion("school_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSchool1EqualTo(String value) {
            addCriterion("school_1 =", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1NotEqualTo(String value) {
            addCriterion("school_1 <>", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1GreaterThan(String value) {
            addCriterion("school_1 >", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1GreaterThanOrEqualTo(String value) {
            addCriterion("school_1 >=", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1LessThan(String value) {
            addCriterion("school_1 <", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1LessThanOrEqualTo(String value) {
            addCriterion("school_1 <=", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1Like(String value) {
            addCriterion("school_1 like", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1NotLike(String value) {
            addCriterion("school_1 not like", value, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1In(List<String> values) {
            addCriterion("school_1 in", values, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1NotIn(List<String> values) {
            addCriterion("school_1 not in", values, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1Between(String value1, String value2) {
            addCriterion("school_1 between", value1, value2, "school1");
            return (Criteria) this;
        }

        public Criteria andSchool1NotBetween(String value1, String value2) {
            addCriterion("school_1 not between", value1, value2, "school1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1IsNull() {
            addCriterion("specialty_1 is null");
            return (Criteria) this;
        }

        public Criteria andSpecialty1IsNotNull() {
            addCriterion("specialty_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialty1EqualTo(String value) {
            addCriterion("specialty_1 =", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1NotEqualTo(String value) {
            addCriterion("specialty_1 <>", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1GreaterThan(String value) {
            addCriterion("specialty_1 >", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1GreaterThanOrEqualTo(String value) {
            addCriterion("specialty_1 >=", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1LessThan(String value) {
            addCriterion("specialty_1 <", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1LessThanOrEqualTo(String value) {
            addCriterion("specialty_1 <=", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1Like(String value) {
            addCriterion("specialty_1 like", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1NotLike(String value) {
            addCriterion("specialty_1 not like", value, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1In(List<String> values) {
            addCriterion("specialty_1 in", values, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1NotIn(List<String> values) {
            addCriterion("specialty_1 not in", values, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1Between(String value1, String value2) {
            addCriterion("specialty_1 between", value1, value2, "specialty1");
            return (Criteria) this;
        }

        public Criteria andSpecialty1NotBetween(String value1, String value2) {
            addCriterion("specialty_1 not between", value1, value2, "specialty1");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateIsNull() {
            addCriterion("work_experience_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateIsNotNull() {
            addCriterion("work_experience_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateEqualTo(Double value) {
            addCriterion("work_experience_date =", value, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateNotEqualTo(Double value) {
            addCriterion("work_experience_date <>", value, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateGreaterThan(Double value) {
            addCriterion("work_experience_date >", value, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateGreaterThanOrEqualTo(Double value) {
            addCriterion("work_experience_date >=", value, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateLessThan(Double value) {
            addCriterion("work_experience_date <", value, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateLessThanOrEqualTo(Double value) {
            addCriterion("work_experience_date <=", value, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateIn(List<Double> values) {
            addCriterion("work_experience_date in", values, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateNotIn(List<Double> values) {
            addCriterion("work_experience_date not in", values, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateBetween(Double value1, Double value2) {
            addCriterion("work_experience_date between", value1, value2, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDateNotBetween(Double value1, Double value2) {
            addCriterion("work_experience_date not between", value1, value2, "workExperienceDate");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryIsNull() {
            addCriterion("expected_salary is null");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryIsNotNull() {
            addCriterion("expected_salary is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryEqualTo(String value) {
            addCriterion("expected_salary =", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryNotEqualTo(String value) {
            addCriterion("expected_salary <>", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryGreaterThan(String value) {
            addCriterion("expected_salary >", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("expected_salary >=", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryLessThan(String value) {
            addCriterion("expected_salary <", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryLessThanOrEqualTo(String value) {
            addCriterion("expected_salary <=", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryLike(String value) {
            addCriterion("expected_salary like", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryNotLike(String value) {
            addCriterion("expected_salary not like", value, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryIn(List<String> values) {
            addCriterion("expected_salary in", values, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryNotIn(List<String> values) {
            addCriterion("expected_salary not in", values, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryBetween(String value1, String value2) {
            addCriterion("expected_salary between", value1, value2, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andExpectedSalaryNotBetween(String value1, String value2) {
            addCriterion("expected_salary not between", value1, value2, "expectedSalary");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNull() {
            addCriterion("position_type is null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNotNull() {
            addCriterion("position_type is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeEqualTo(String value) {
            addCriterion("position_type =", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotEqualTo(String value) {
            addCriterion("position_type <>", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThan(String value) {
            addCriterion("position_type >", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("position_type >=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThan(String value) {
            addCriterion("position_type <", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThanOrEqualTo(String value) {
            addCriterion("position_type <=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLike(String value) {
            addCriterion("position_type like", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotLike(String value) {
            addCriterion("position_type not like", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIn(List<String> values) {
            addCriterion("position_type in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotIn(List<String> values) {
            addCriterion("position_type not in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeBetween(String value1, String value2) {
            addCriterion("position_type between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotBetween(String value1, String value2) {
            addCriterion("position_type not between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2IsNull() {
            addCriterion("previous_company_2 is null");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2IsNotNull() {
            addCriterion("previous_company_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2EqualTo(String value) {
            addCriterion("previous_company_2 =", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2NotEqualTo(String value) {
            addCriterion("previous_company_2 <>", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2GreaterThan(String value) {
            addCriterion("previous_company_2 >", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2GreaterThanOrEqualTo(String value) {
            addCriterion("previous_company_2 >=", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2LessThan(String value) {
            addCriterion("previous_company_2 <", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2LessThanOrEqualTo(String value) {
            addCriterion("previous_company_2 <=", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2Like(String value) {
            addCriterion("previous_company_2 like", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2NotLike(String value) {
            addCriterion("previous_company_2 not like", value, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2In(List<String> values) {
            addCriterion("previous_company_2 in", values, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2NotIn(List<String> values) {
            addCriterion("previous_company_2 not in", values, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2Between(String value1, String value2) {
            addCriterion("previous_company_2 between", value1, value2, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andPreviousCompany2NotBetween(String value1, String value2) {
            addCriterion("previous_company_2 not between", value1, value2, "previousCompany2");
            return (Criteria) this;
        }

        public Criteria andHiredate2IsNull() {
            addCriterion("hiredate_2 is null");
            return (Criteria) this;
        }

        public Criteria andHiredate2IsNotNull() {
            addCriterion("hiredate_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHiredate2EqualTo(Date value) {
            addCriterion("hiredate_2 =", value, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2NotEqualTo(Date value) {
            addCriterion("hiredate_2 <>", value, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2GreaterThan(Date value) {
            addCriterion("hiredate_2 >", value, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2GreaterThanOrEqualTo(Date value) {
            addCriterion("hiredate_2 >=", value, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2LessThan(Date value) {
            addCriterion("hiredate_2 <", value, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2LessThanOrEqualTo(Date value) {
            addCriterion("hiredate_2 <=", value, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2In(List<Date> values) {
            addCriterion("hiredate_2 in", values, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2NotIn(List<Date> values) {
            addCriterion("hiredate_2 not in", values, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2Between(Date value1, Date value2) {
            addCriterion("hiredate_2 between", value1, value2, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andHiredate2NotBetween(Date value1, Date value2) {
            addCriterion("hiredate_2 not between", value1, value2, "hiredate2");
            return (Criteria) this;
        }

        public Criteria andDeparture2IsNull() {
            addCriterion("departure_2 is null");
            return (Criteria) this;
        }

        public Criteria andDeparture2IsNotNull() {
            addCriterion("departure_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeparture2EqualTo(Date value) {
            addCriterion("departure_2 =", value, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2NotEqualTo(Date value) {
            addCriterion("departure_2 <>", value, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2GreaterThan(Date value) {
            addCriterion("departure_2 >", value, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2GreaterThanOrEqualTo(Date value) {
            addCriterion("departure_2 >=", value, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2LessThan(Date value) {
            addCriterion("departure_2 <", value, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2LessThanOrEqualTo(Date value) {
            addCriterion("departure_2 <=", value, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2In(List<Date> values) {
            addCriterion("departure_2 in", values, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2NotIn(List<Date> values) {
            addCriterion("departure_2 not in", values, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2Between(Date value1, Date value2) {
            addCriterion("departure_2 between", value1, value2, "departure2");
            return (Criteria) this;
        }

        public Criteria andDeparture2NotBetween(Date value1, Date value2) {
            addCriterion("departure_2 not between", value1, value2, "departure2");
            return (Criteria) this;
        }

        public Criteria andHiredate1IsNull() {
            addCriterion("hiredate_1 is null");
            return (Criteria) this;
        }

        public Criteria andHiredate1IsNotNull() {
            addCriterion("hiredate_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHiredate1EqualTo(Date value) {
            addCriterion("hiredate_1 =", value, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1NotEqualTo(Date value) {
            addCriterion("hiredate_1 <>", value, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1GreaterThan(Date value) {
            addCriterion("hiredate_1 >", value, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1GreaterThanOrEqualTo(Date value) {
            addCriterion("hiredate_1 >=", value, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1LessThan(Date value) {
            addCriterion("hiredate_1 <", value, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1LessThanOrEqualTo(Date value) {
            addCriterion("hiredate_1 <=", value, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1In(List<Date> values) {
            addCriterion("hiredate_1 in", values, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1NotIn(List<Date> values) {
            addCriterion("hiredate_1 not in", values, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1Between(Date value1, Date value2) {
            addCriterion("hiredate_1 between", value1, value2, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andHiredate1NotBetween(Date value1, Date value2) {
            addCriterion("hiredate_1 not between", value1, value2, "hiredate1");
            return (Criteria) this;
        }

        public Criteria andDeparture1IsNull() {
            addCriterion("departure_1 is null");
            return (Criteria) this;
        }

        public Criteria andDeparture1IsNotNull() {
            addCriterion("departure_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDeparture1EqualTo(Date value) {
            addCriterion("departure_1 =", value, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1NotEqualTo(Date value) {
            addCriterion("departure_1 <>", value, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1GreaterThan(Date value) {
            addCriterion("departure_1 >", value, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1GreaterThanOrEqualTo(Date value) {
            addCriterion("departure_1 >=", value, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1LessThan(Date value) {
            addCriterion("departure_1 <", value, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1LessThanOrEqualTo(Date value) {
            addCriterion("departure_1 <=", value, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1In(List<Date> values) {
            addCriterion("departure_1 in", values, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1NotIn(List<Date> values) {
            addCriterion("departure_1 not in", values, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1Between(Date value1, Date value2) {
            addCriterion("departure_1 between", value1, value2, "departure1");
            return (Criteria) this;
        }

        public Criteria andDeparture1NotBetween(Date value1, Date value2) {
            addCriterion("departure_1 not between", value1, value2, "departure1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1IsNull() {
            addCriterion("previous_position_1 is null");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1IsNotNull() {
            addCriterion("previous_position_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1EqualTo(String value) {
            addCriterion("previous_position_1 =", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1NotEqualTo(String value) {
            addCriterion("previous_position_1 <>", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1GreaterThan(String value) {
            addCriterion("previous_position_1 >", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1GreaterThanOrEqualTo(String value) {
            addCriterion("previous_position_1 >=", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1LessThan(String value) {
            addCriterion("previous_position_1 <", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1LessThanOrEqualTo(String value) {
            addCriterion("previous_position_1 <=", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1Like(String value) {
            addCriterion("previous_position_1 like", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1NotLike(String value) {
            addCriterion("previous_position_1 not like", value, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1In(List<String> values) {
            addCriterion("previous_position_1 in", values, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1NotIn(List<String> values) {
            addCriterion("previous_position_1 not in", values, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1Between(String value1, String value2) {
            addCriterion("previous_position_1 between", value1, value2, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition1NotBetween(String value1, String value2) {
            addCriterion("previous_position_1 not between", value1, value2, "previousPosition1");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2IsNull() {
            addCriterion("previous_position_2 is null");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2IsNotNull() {
            addCriterion("previous_position_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2EqualTo(String value) {
            addCriterion("previous_position_2 =", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2NotEqualTo(String value) {
            addCriterion("previous_position_2 <>", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2GreaterThan(String value) {
            addCriterion("previous_position_2 >", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2GreaterThanOrEqualTo(String value) {
            addCriterion("previous_position_2 >=", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2LessThan(String value) {
            addCriterion("previous_position_2 <", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2LessThanOrEqualTo(String value) {
            addCriterion("previous_position_2 <=", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2Like(String value) {
            addCriterion("previous_position_2 like", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2NotLike(String value) {
            addCriterion("previous_position_2 not like", value, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2In(List<String> values) {
            addCriterion("previous_position_2 in", values, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2NotIn(List<String> values) {
            addCriterion("previous_position_2 not in", values, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2Between(String value1, String value2) {
            addCriterion("previous_position_2 between", value1, value2, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andPreviousPosition2NotBetween(String value1, String value2) {
            addCriterion("previous_position_2 not between", value1, value2, "previousPosition2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1IsNull() {
            addCriterion("graduation_date_1 is null");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1IsNotNull() {
            addCriterion("graduation_date_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1EqualTo(Date value) {
            addCriterion("graduation_date_1 =", value, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1NotEqualTo(Date value) {
            addCriterion("graduation_date_1 <>", value, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1GreaterThan(Date value) {
            addCriterion("graduation_date_1 >", value, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1GreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_date_1 >=", value, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1LessThan(Date value) {
            addCriterion("graduation_date_1 <", value, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1LessThanOrEqualTo(Date value) {
            addCriterion("graduation_date_1 <=", value, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1In(List<Date> values) {
            addCriterion("graduation_date_1 in", values, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1NotIn(List<Date> values) {
            addCriterion("graduation_date_1 not in", values, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1Between(Date value1, Date value2) {
            addCriterion("graduation_date_1 between", value1, value2, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andGraduationDate1NotBetween(Date value1, Date value2) {
            addCriterion("graduation_date_1 not between", value1, value2, "graduationDate1");
            return (Criteria) this;
        }

        public Criteria andSchool2IsNull() {
            addCriterion("school_2 is null");
            return (Criteria) this;
        }

        public Criteria andSchool2IsNotNull() {
            addCriterion("school_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSchool2EqualTo(String value) {
            addCriterion("school_2 =", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotEqualTo(String value) {
            addCriterion("school_2 <>", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2GreaterThan(String value) {
            addCriterion("school_2 >", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2GreaterThanOrEqualTo(String value) {
            addCriterion("school_2 >=", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2LessThan(String value) {
            addCriterion("school_2 <", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2LessThanOrEqualTo(String value) {
            addCriterion("school_2 <=", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2Like(String value) {
            addCriterion("school_2 like", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotLike(String value) {
            addCriterion("school_2 not like", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2In(List<String> values) {
            addCriterion("school_2 in", values, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotIn(List<String> values) {
            addCriterion("school_2 not in", values, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2Between(String value1, String value2) {
            addCriterion("school_2 between", value1, value2, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotBetween(String value1, String value2) {
            addCriterion("school_2 not between", value1, value2, "school2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2IsNull() {
            addCriterion("specialty_2 is null");
            return (Criteria) this;
        }

        public Criteria andSpecialty2IsNotNull() {
            addCriterion("specialty_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialty2EqualTo(String value) {
            addCriterion("specialty_2 =", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2NotEqualTo(String value) {
            addCriterion("specialty_2 <>", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2GreaterThan(String value) {
            addCriterion("specialty_2 >", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2GreaterThanOrEqualTo(String value) {
            addCriterion("specialty_2 >=", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2LessThan(String value) {
            addCriterion("specialty_2 <", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2LessThanOrEqualTo(String value) {
            addCriterion("specialty_2 <=", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2Like(String value) {
            addCriterion("specialty_2 like", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2NotLike(String value) {
            addCriterion("specialty_2 not like", value, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2In(List<String> values) {
            addCriterion("specialty_2 in", values, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2NotIn(List<String> values) {
            addCriterion("specialty_2 not in", values, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2Between(String value1, String value2) {
            addCriterion("specialty_2 between", value1, value2, "specialty2");
            return (Criteria) this;
        }

        public Criteria andSpecialty2NotBetween(String value1, String value2) {
            addCriterion("specialty_2 not between", value1, value2, "specialty2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2IsNull() {
            addCriterion("graduation_date_2 is null");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2IsNotNull() {
            addCriterion("graduation_date_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2EqualTo(Date value) {
            addCriterion("graduation_date_2 =", value, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2NotEqualTo(Date value) {
            addCriterion("graduation_date_2 <>", value, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2GreaterThan(Date value) {
            addCriterion("graduation_date_2 >", value, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2GreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_date_2 >=", value, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2LessThan(Date value) {
            addCriterion("graduation_date_2 <", value, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2LessThanOrEqualTo(Date value) {
            addCriterion("graduation_date_2 <=", value, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2In(List<Date> values) {
            addCriterion("graduation_date_2 in", values, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2NotIn(List<Date> values) {
            addCriterion("graduation_date_2 not in", values, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2Between(Date value1, Date value2) {
            addCriterion("graduation_date_2 between", value1, value2, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andGraduationDate2NotBetween(Date value1, Date value2) {
            addCriterion("graduation_date_2 not between", value1, value2, "graduationDate2");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionIsNull() {
            addCriterion("self-description is null");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionIsNotNull() {
            addCriterion("self-description is not null");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionEqualTo(String value) {
            addCriterion("self-description =", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotEqualTo(String value) {
            addCriterion("self-description <>", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionGreaterThan(String value) {
            addCriterion("self-description >", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("self-description >=", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionLessThan(String value) {
            addCriterion("self-description <", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionLessThanOrEqualTo(String value) {
            addCriterion("self-description <=", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionLike(String value) {
            addCriterion("self-description like", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotLike(String value) {
            addCriterion("self-description not like", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionIn(List<String> values) {
            addCriterion("self-description in", values, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotIn(List<String> values) {
            addCriterion("self-description not in", values, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionBetween(String value1, String value2) {
            addCriterion("self-description between", value1, value2, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotBetween(String value1, String value2) {
            addCriterion("self-description not between", value1, value2, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSupplementIsNull() {
            addCriterion("supplement is null");
            return (Criteria) this;
        }

        public Criteria andSupplementIsNotNull() {
            addCriterion("supplement is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementEqualTo(String value) {
            addCriterion("supplement =", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementNotEqualTo(String value) {
            addCriterion("supplement <>", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementGreaterThan(String value) {
            addCriterion("supplement >", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementGreaterThanOrEqualTo(String value) {
            addCriterion("supplement >=", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementLessThan(String value) {
            addCriterion("supplement <", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementLessThanOrEqualTo(String value) {
            addCriterion("supplement <=", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementLike(String value) {
            addCriterion("supplement like", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementNotLike(String value) {
            addCriterion("supplement not like", value, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementIn(List<String> values) {
            addCriterion("supplement in", values, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementNotIn(List<String> values) {
            addCriterion("supplement not in", values, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementBetween(String value1, String value2) {
            addCriterion("supplement between", value1, value2, "supplement");
            return (Criteria) this;
        }

        public Criteria andSupplementNotBetween(String value1, String value2) {
            addCriterion("supplement not between", value1, value2, "supplement");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNull() {
            addCriterion("data_date is null");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNotNull() {
            addCriterion("data_date is not null");
            return (Criteria) this;
        }

        public Criteria andDataDateEqualTo(Date value) {
            addCriterion("data_date =", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotEqualTo(Date value) {
            addCriterion("data_date <>", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThan(Date value) {
            addCriterion("data_date >", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThanOrEqualTo(Date value) {
            addCriterion("data_date >=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThan(Date value) {
            addCriterion("data_date <", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThanOrEqualTo(Date value) {
            addCriterion("data_date <=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIn(List<Date> values) {
            addCriterion("data_date in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotIn(List<Date> values) {
            addCriterion("data_date not in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateBetween(Date value1, Date value2) {
            addCriterion("data_date between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotBetween(Date value1, Date value2) {
            addCriterion("data_date not between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andNull1IsNull() {
            addCriterion("null1 is null");
            return (Criteria) this;
        }

        public Criteria andNull1IsNotNull() {
            addCriterion("null1 is not null");
            return (Criteria) this;
        }

        public Criteria andNull1EqualTo(String value) {
            addCriterion("null1 =", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1NotEqualTo(String value) {
            addCriterion("null1 <>", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1GreaterThan(String value) {
            addCriterion("null1 >", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1GreaterThanOrEqualTo(String value) {
            addCriterion("null1 >=", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1LessThan(String value) {
            addCriterion("null1 <", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1LessThanOrEqualTo(String value) {
            addCriterion("null1 <=", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1Like(String value) {
            addCriterion("null1 like", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1NotLike(String value) {
            addCriterion("null1 not like", value, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1In(List<String> values) {
            addCriterion("null1 in", values, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1NotIn(List<String> values) {
            addCriterion("null1 not in", values, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1Between(String value1, String value2) {
            addCriterion("null1 between", value1, value2, "null1");
            return (Criteria) this;
        }

        public Criteria andNull1NotBetween(String value1, String value2) {
            addCriterion("null1 not between", value1, value2, "null1");
            return (Criteria) this;
        }

        public Criteria andNull2IsNull() {
            addCriterion("null2 is null");
            return (Criteria) this;
        }

        public Criteria andNull2IsNotNull() {
            addCriterion("null2 is not null");
            return (Criteria) this;
        }

        public Criteria andNull2EqualTo(String value) {
            addCriterion("null2 =", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2NotEqualTo(String value) {
            addCriterion("null2 <>", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2GreaterThan(String value) {
            addCriterion("null2 >", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2GreaterThanOrEqualTo(String value) {
            addCriterion("null2 >=", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2LessThan(String value) {
            addCriterion("null2 <", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2LessThanOrEqualTo(String value) {
            addCriterion("null2 <=", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2Like(String value) {
            addCriterion("null2 like", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2NotLike(String value) {
            addCriterion("null2 not like", value, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2In(List<String> values) {
            addCriterion("null2 in", values, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2NotIn(List<String> values) {
            addCriterion("null2 not in", values, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2Between(String value1, String value2) {
            addCriterion("null2 between", value1, value2, "null2");
            return (Criteria) this;
        }

        public Criteria andNull2NotBetween(String value1, String value2) {
            addCriterion("null2 not between", value1, value2, "null2");
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

        public Criteria andComAppIdIsNull() {
            addCriterion("com_app_id is null");
            return (Criteria) this;
        }

        public Criteria andComAppIdIsNotNull() {
            addCriterion("com_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andComAppIdEqualTo(String value) {
            addCriterion("com_app_id =", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdNotEqualTo(String value) {
            addCriterion("com_app_id <>", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdGreaterThan(String value) {
            addCriterion("com_app_id >", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("com_app_id >=", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdLessThan(String value) {
            addCriterion("com_app_id <", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdLessThanOrEqualTo(String value) {
            addCriterion("com_app_id <=", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdLike(String value) {
            addCriterion("com_app_id like", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdNotLike(String value) {
            addCriterion("com_app_id not like", value, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdIn(List<String> values) {
            addCriterion("com_app_id in", values, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdNotIn(List<String> values) {
            addCriterion("com_app_id not in", values, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdBetween(String value1, String value2) {
            addCriterion("com_app_id between", value1, value2, "comAppId");
            return (Criteria) this;
        }

        public Criteria andComAppIdNotBetween(String value1, String value2) {
            addCriterion("com_app_id not between", value1, value2, "comAppId");
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