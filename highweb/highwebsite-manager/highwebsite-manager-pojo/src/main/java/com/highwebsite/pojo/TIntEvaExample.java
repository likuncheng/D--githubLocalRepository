package com.highwebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TIntEvaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIntEvaExample() {
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

        public Criteria andApplicationIsNull() {
            addCriterion("application is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("application is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("application =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("application <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("application >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("application >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("application <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("application <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("application like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("application not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("application in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("application not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("application between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("application not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andInterviewJobIsNull() {
            addCriterion("interview_job is null");
            return (Criteria) this;
        }

        public Criteria andInterviewJobIsNotNull() {
            addCriterion("interview_job is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewJobEqualTo(String value) {
            addCriterion("interview_job =", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobNotEqualTo(String value) {
            addCriterion("interview_job <>", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobGreaterThan(String value) {
            addCriterion("interview_job >", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobGreaterThanOrEqualTo(String value) {
            addCriterion("interview_job >=", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobLessThan(String value) {
            addCriterion("interview_job <", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobLessThanOrEqualTo(String value) {
            addCriterion("interview_job <=", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobLike(String value) {
            addCriterion("interview_job like", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobNotLike(String value) {
            addCriterion("interview_job not like", value, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobIn(List<String> values) {
            addCriterion("interview_job in", values, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobNotIn(List<String> values) {
            addCriterion("interview_job not in", values, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobBetween(String value1, String value2) {
            addCriterion("interview_job between", value1, value2, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andInterviewJobNotBetween(String value1, String value2) {
            addCriterion("interview_job not between", value1, value2, "interviewJob");
            return (Criteria) this;
        }

        public Criteria andDotIsNull() {
            addCriterion("dot is null");
            return (Criteria) this;
        }

        public Criteria andDotIsNotNull() {
            addCriterion("dot is not null");
            return (Criteria) this;
        }

        public Criteria andDotEqualTo(Integer value) {
            addCriterion("dot =", value, "dot");
            return (Criteria) this;
        }

        public Criteria andDotNotEqualTo(Integer value) {
            addCriterion("dot <>", value, "dot");
            return (Criteria) this;
        }

        public Criteria andDotGreaterThan(Integer value) {
            addCriterion("dot >", value, "dot");
            return (Criteria) this;
        }

        public Criteria andDotGreaterThanOrEqualTo(Integer value) {
            addCriterion("dot >=", value, "dot");
            return (Criteria) this;
        }

        public Criteria andDotLessThan(Integer value) {
            addCriterion("dot <", value, "dot");
            return (Criteria) this;
        }

        public Criteria andDotLessThanOrEqualTo(Integer value) {
            addCriterion("dot <=", value, "dot");
            return (Criteria) this;
        }

        public Criteria andDotIn(List<Integer> values) {
            addCriterion("dot in", values, "dot");
            return (Criteria) this;
        }

        public Criteria andDotNotIn(List<Integer> values) {
            addCriterion("dot not in", values, "dot");
            return (Criteria) this;
        }

        public Criteria andDotBetween(Integer value1, Integer value2) {
            addCriterion("dot between", value1, value2, "dot");
            return (Criteria) this;
        }

        public Criteria andDotNotBetween(Integer value1, Integer value2) {
            addCriterion("dot not between", value1, value2, "dot");
            return (Criteria) this;
        }

        public Criteria andOverallIsNull() {
            addCriterion("overall is null");
            return (Criteria) this;
        }

        public Criteria andOverallIsNotNull() {
            addCriterion("overall is not null");
            return (Criteria) this;
        }

        public Criteria andOverallEqualTo(String value) {
            addCriterion("overall =", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallNotEqualTo(String value) {
            addCriterion("overall <>", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallGreaterThan(String value) {
            addCriterion("overall >", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallGreaterThanOrEqualTo(String value) {
            addCriterion("overall >=", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallLessThan(String value) {
            addCriterion("overall <", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallLessThanOrEqualTo(String value) {
            addCriterion("overall <=", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallLike(String value) {
            addCriterion("overall like", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallNotLike(String value) {
            addCriterion("overall not like", value, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallIn(List<String> values) {
            addCriterion("overall in", values, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallNotIn(List<String> values) {
            addCriterion("overall not in", values, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallBetween(String value1, String value2) {
            addCriterion("overall between", value1, value2, "overall");
            return (Criteria) this;
        }

        public Criteria andOverallNotBetween(String value1, String value2) {
            addCriterion("overall not between", value1, value2, "overall");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessIsNull() {
            addCriterion("interview_process is null");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessIsNotNull() {
            addCriterion("interview_process is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessEqualTo(String value) {
            addCriterion("interview_process =", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessNotEqualTo(String value) {
            addCriterion("interview_process <>", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessGreaterThan(String value) {
            addCriterion("interview_process >", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessGreaterThanOrEqualTo(String value) {
            addCriterion("interview_process >=", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessLessThan(String value) {
            addCriterion("interview_process <", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessLessThanOrEqualTo(String value) {
            addCriterion("interview_process <=", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessLike(String value) {
            addCriterion("interview_process like", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessNotLike(String value) {
            addCriterion("interview_process not like", value, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessIn(List<String> values) {
            addCriterion("interview_process in", values, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessNotIn(List<String> values) {
            addCriterion("interview_process not in", values, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessBetween(String value1, String value2) {
            addCriterion("interview_process between", value1, value2, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andInterviewProcessNotBetween(String value1, String value2) {
            addCriterion("interview_process not between", value1, value2, "interviewProcess");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOverallScoreIsNull() {
            addCriterion("overall_score is null");
            return (Criteria) this;
        }

        public Criteria andOverallScoreIsNotNull() {
            addCriterion("overall_score is not null");
            return (Criteria) this;
        }

        public Criteria andOverallScoreEqualTo(Integer value) {
            addCriterion("overall_score =", value, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreNotEqualTo(Integer value) {
            addCriterion("overall_score <>", value, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreGreaterThan(Integer value) {
            addCriterion("overall_score >", value, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("overall_score >=", value, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreLessThan(Integer value) {
            addCriterion("overall_score <", value, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreLessThanOrEqualTo(Integer value) {
            addCriterion("overall_score <=", value, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreIn(List<Integer> values) {
            addCriterion("overall_score in", values, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreNotIn(List<Integer> values) {
            addCriterion("overall_score not in", values, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreBetween(Integer value1, Integer value2) {
            addCriterion("overall_score between", value1, value2, "overallScore");
            return (Criteria) this;
        }

        public Criteria andOverallScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("overall_score not between", value1, value2, "overallScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreIsNull() {
            addCriterion("description_score is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreIsNotNull() {
            addCriterion("description_score is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreEqualTo(Integer value) {
            addCriterion("description_score =", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreNotEqualTo(Integer value) {
            addCriterion("description_score <>", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreGreaterThan(Integer value) {
            addCriterion("description_score >", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("description_score >=", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreLessThan(Integer value) {
            addCriterion("description_score <", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("description_score <=", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreIn(List<Integer> values) {
            addCriterion("description_score in", values, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreNotIn(List<Integer> values) {
            addCriterion("description_score not in", values, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreBetween(Integer value1, Integer value2) {
            addCriterion("description_score between", value1, value2, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("description_score not between", value1, value2, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreIsNull() {
            addCriterion("interviewer_score is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreIsNotNull() {
            addCriterion("interviewer_score is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreEqualTo(Integer value) {
            addCriterion("interviewer_score =", value, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreNotEqualTo(Integer value) {
            addCriterion("interviewer_score <>", value, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreGreaterThan(Integer value) {
            addCriterion("interviewer_score >", value, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("interviewer_score >=", value, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreLessThan(Integer value) {
            addCriterion("interviewer_score <", value, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreLessThanOrEqualTo(Integer value) {
            addCriterion("interviewer_score <=", value, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreIn(List<Integer> values) {
            addCriterion("interviewer_score in", values, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreNotIn(List<Integer> values) {
            addCriterion("interviewer_score not in", values, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreBetween(Integer value1, Integer value2) {
            addCriterion("interviewer_score between", value1, value2, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andInterviewerScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("interviewer_score not between", value1, value2, "interviewerScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreIsNull() {
            addCriterion("environment_score is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreIsNotNull() {
            addCriterion("environment_score is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreEqualTo(Integer value) {
            addCriterion("environment_score =", value, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreNotEqualTo(Integer value) {
            addCriterion("environment_score <>", value, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreGreaterThan(Integer value) {
            addCriterion("environment_score >", value, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("environment_score >=", value, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreLessThan(Integer value) {
            addCriterion("environment_score <", value, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreLessThanOrEqualTo(Integer value) {
            addCriterion("environment_score <=", value, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreIn(List<Integer> values) {
            addCriterion("environment_score in", values, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreNotIn(List<Integer> values) {
            addCriterion("environment_score not in", values, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreBetween(Integer value1, Integer value2) {
            addCriterion("environment_score between", value1, value2, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andEnvironmentScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("environment_score not between", value1, value2, "environmentScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreIsNull() {
            addCriterion("p_overall_score is null");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreIsNotNull() {
            addCriterion("p_overall_score is not null");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreEqualTo(Integer value) {
            addCriterion("p_overall_score =", value, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreNotEqualTo(Integer value) {
            addCriterion("p_overall_score <>", value, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreGreaterThan(Integer value) {
            addCriterion("p_overall_score >", value, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_overall_score >=", value, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreLessThan(Integer value) {
            addCriterion("p_overall_score <", value, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreLessThanOrEqualTo(Integer value) {
            addCriterion("p_overall_score <=", value, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreIn(List<Integer> values) {
            addCriterion("p_overall_score in", values, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreNotIn(List<Integer> values) {
            addCriterion("p_overall_score not in", values, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreBetween(Integer value1, Integer value2) {
            addCriterion("p_overall_score between", value1, value2, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andPOverallScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("p_overall_score not between", value1, value2, "pOverallScore");
            return (Criteria) this;
        }

        public Criteria andOfflineIsNull() {
            addCriterion("offline is null");
            return (Criteria) this;
        }

        public Criteria andOfflineIsNotNull() {
            addCriterion("offline is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineEqualTo(Boolean value) {
            addCriterion("offline =", value, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineNotEqualTo(Boolean value) {
            addCriterion("offline <>", value, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineGreaterThan(Boolean value) {
            addCriterion("offline >", value, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("offline >=", value, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineLessThan(Boolean value) {
            addCriterion("offline <", value, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineLessThanOrEqualTo(Boolean value) {
            addCriterion("offline <=", value, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineIn(List<Boolean> values) {
            addCriterion("offline in", values, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineNotIn(List<Boolean> values) {
            addCriterion("offline not in", values, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineBetween(Boolean value1, Boolean value2) {
            addCriterion("offline between", value1, value2, "offline");
            return (Criteria) this;
        }

        public Criteria andOfflineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("offline not between", value1, value2, "offline");
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