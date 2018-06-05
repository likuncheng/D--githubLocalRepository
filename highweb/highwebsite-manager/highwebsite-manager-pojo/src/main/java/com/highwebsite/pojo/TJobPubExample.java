package com.highwebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TJobPubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TJobPubExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredIsNull() {
            addCriterion("experience_required is null");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredIsNotNull() {
            addCriterion("experience_required is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredEqualTo(String value) {
            addCriterion("experience_required =", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredNotEqualTo(String value) {
            addCriterion("experience_required <>", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredGreaterThan(String value) {
            addCriterion("experience_required >", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("experience_required >=", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredLessThan(String value) {
            addCriterion("experience_required <", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredLessThanOrEqualTo(String value) {
            addCriterion("experience_required <=", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredLike(String value) {
            addCriterion("experience_required like", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredNotLike(String value) {
            addCriterion("experience_required not like", value, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredIn(List<String> values) {
            addCriterion("experience_required in", values, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredNotIn(List<String> values) {
            addCriterion("experience_required not in", values, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredBetween(String value1, String value2) {
            addCriterion("experience_required between", value1, value2, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andExperienceRequiredNotBetween(String value1, String value2) {
            addCriterion("experience_required not between", value1, value2, "experienceRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredIsNull() {
            addCriterion("education_required is null");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredIsNotNull() {
            addCriterion("education_required is not null");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredEqualTo(String value) {
            addCriterion("education_required =", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredNotEqualTo(String value) {
            addCriterion("education_required <>", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredGreaterThan(String value) {
            addCriterion("education_required >", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("education_required >=", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredLessThan(String value) {
            addCriterion("education_required <", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredLessThanOrEqualTo(String value) {
            addCriterion("education_required <=", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredLike(String value) {
            addCriterion("education_required like", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredNotLike(String value) {
            addCriterion("education_required not like", value, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredIn(List<String> values) {
            addCriterion("education_required in", values, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredNotIn(List<String> values) {
            addCriterion("education_required not in", values, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredBetween(String value1, String value2) {
            addCriterion("education_required between", value1, value2, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andEducationRequiredNotBetween(String value1, String value2) {
            addCriterion("education_required not between", value1, value2, "educationRequired");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionIsNull() {
            addCriterion("job_description is null");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionIsNotNull() {
            addCriterion("job_description is not null");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionEqualTo(String value) {
            addCriterion("job_description =", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotEqualTo(String value) {
            addCriterion("job_description <>", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionGreaterThan(String value) {
            addCriterion("job_description >", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("job_description >=", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionLessThan(String value) {
            addCriterion("job_description <", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionLessThanOrEqualTo(String value) {
            addCriterion("job_description <=", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionLike(String value) {
            addCriterion("job_description like", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotLike(String value) {
            addCriterion("job_description not like", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionIn(List<String> values) {
            addCriterion("job_description in", values, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotIn(List<String> values) {
            addCriterion("job_description not in", values, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionBetween(String value1, String value2) {
            addCriterion("job_description between", value1, value2, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotBetween(String value1, String value2) {
            addCriterion("job_description not between", value1, value2, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobRequiredIsNull() {
            addCriterion("job_required is null");
            return (Criteria) this;
        }

        public Criteria andJobRequiredIsNotNull() {
            addCriterion("job_required is not null");
            return (Criteria) this;
        }

        public Criteria andJobRequiredEqualTo(String value) {
            addCriterion("job_required =", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredNotEqualTo(String value) {
            addCriterion("job_required <>", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredGreaterThan(String value) {
            addCriterion("job_required >", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("job_required >=", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredLessThan(String value) {
            addCriterion("job_required <", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredLessThanOrEqualTo(String value) {
            addCriterion("job_required <=", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredLike(String value) {
            addCriterion("job_required like", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredNotLike(String value) {
            addCriterion("job_required not like", value, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredIn(List<String> values) {
            addCriterion("job_required in", values, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredNotIn(List<String> values) {
            addCriterion("job_required not in", values, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredBetween(String value1, String value2) {
            addCriterion("job_required between", value1, value2, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobRequiredNotBetween(String value1, String value2) {
            addCriterion("job_required not between", value1, value2, "jobRequired");
            return (Criteria) this;
        }

        public Criteria andJobLabelIsNull() {
            addCriterion("job_label is null");
            return (Criteria) this;
        }

        public Criteria andJobLabelIsNotNull() {
            addCriterion("job_label is not null");
            return (Criteria) this;
        }

        public Criteria andJobLabelEqualTo(String value) {
            addCriterion("job_label =", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelNotEqualTo(String value) {
            addCriterion("job_label <>", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelGreaterThan(String value) {
            addCriterion("job_label >", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelGreaterThanOrEqualTo(String value) {
            addCriterion("job_label >=", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelLessThan(String value) {
            addCriterion("job_label <", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelLessThanOrEqualTo(String value) {
            addCriterion("job_label <=", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelLike(String value) {
            addCriterion("job_label like", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelNotLike(String value) {
            addCriterion("job_label not like", value, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelIn(List<String> values) {
            addCriterion("job_label in", values, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelNotIn(List<String> values) {
            addCriterion("job_label not in", values, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelBetween(String value1, String value2) {
            addCriterion("job_label between", value1, value2, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andJobLabelNotBetween(String value1, String value2) {
            addCriterion("job_label not between", value1, value2, "jobLabel");
            return (Criteria) this;
        }

        public Criteria andIsExigencyIsNull() {
            addCriterion("is_exigency is null");
            return (Criteria) this;
        }

        public Criteria andIsExigencyIsNotNull() {
            addCriterion("is_exigency is not null");
            return (Criteria) this;
        }

        public Criteria andIsExigencyEqualTo(String value) {
            addCriterion("is_exigency =", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyNotEqualTo(String value) {
            addCriterion("is_exigency <>", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyGreaterThan(String value) {
            addCriterion("is_exigency >", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyGreaterThanOrEqualTo(String value) {
            addCriterion("is_exigency >=", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyLessThan(String value) {
            addCriterion("is_exigency <", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyLessThanOrEqualTo(String value) {
            addCriterion("is_exigency <=", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyLike(String value) {
            addCriterion("is_exigency like", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyNotLike(String value) {
            addCriterion("is_exigency not like", value, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyIn(List<String> values) {
            addCriterion("is_exigency in", values, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyNotIn(List<String> values) {
            addCriterion("is_exigency not in", values, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyBetween(String value1, String value2) {
            addCriterion("is_exigency between", value1, value2, "isExigency");
            return (Criteria) this;
        }

        public Criteria andIsExigencyNotBetween(String value1, String value2) {
            addCriterion("is_exigency not between", value1, value2, "isExigency");
            return (Criteria) this;
        }

        public Criteria andJobCategoryIsNull() {
            addCriterion("job_category is null");
            return (Criteria) this;
        }

        public Criteria andJobCategoryIsNotNull() {
            addCriterion("job_category is not null");
            return (Criteria) this;
        }

        public Criteria andJobCategoryEqualTo(String value) {
            addCriterion("job_category =", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotEqualTo(String value) {
            addCriterion("job_category <>", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryGreaterThan(String value) {
            addCriterion("job_category >", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("job_category >=", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryLessThan(String value) {
            addCriterion("job_category <", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryLessThanOrEqualTo(String value) {
            addCriterion("job_category <=", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryLike(String value) {
            addCriterion("job_category like", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotLike(String value) {
            addCriterion("job_category not like", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryIn(List<String> values) {
            addCriterion("job_category in", values, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotIn(List<String> values) {
            addCriterion("job_category not in", values, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryBetween(String value1, String value2) {
            addCriterion("job_category between", value1, value2, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotBetween(String value1, String value2) {
            addCriterion("job_category not between", value1, value2, "jobCategory");
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