package com.highwebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TComInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TComInfoExample() {
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

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyIsNull() {
            addCriterion("industry_categroy is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyIsNotNull() {
            addCriterion("industry_categroy is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyEqualTo(String value) {
            addCriterion("industry_categroy =", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyNotEqualTo(String value) {
            addCriterion("industry_categroy <>", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyGreaterThan(String value) {
            addCriterion("industry_categroy >", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyGreaterThanOrEqualTo(String value) {
            addCriterion("industry_categroy >=", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyLessThan(String value) {
            addCriterion("industry_categroy <", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyLessThanOrEqualTo(String value) {
            addCriterion("industry_categroy <=", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyLike(String value) {
            addCriterion("industry_categroy like", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyNotLike(String value) {
            addCriterion("industry_categroy not like", value, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyIn(List<String> values) {
            addCriterion("industry_categroy in", values, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyNotIn(List<String> values) {
            addCriterion("industry_categroy not in", values, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyBetween(String value1, String value2) {
            addCriterion("industry_categroy between", value1, value2, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andIndustryCategroyNotBetween(String value1, String value2) {
            addCriterion("industry_categroy not between", value1, value2, "industryCategroy");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIsNull() {
            addCriterion("company_scale is null");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIsNotNull() {
            addCriterion("company_scale is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleEqualTo(String value) {
            addCriterion("company_scale =", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotEqualTo(String value) {
            addCriterion("company_scale <>", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleGreaterThan(String value) {
            addCriterion("company_scale >", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleGreaterThanOrEqualTo(String value) {
            addCriterion("company_scale >=", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLessThan(String value) {
            addCriterion("company_scale <", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLessThanOrEqualTo(String value) {
            addCriterion("company_scale <=", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLike(String value) {
            addCriterion("company_scale like", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotLike(String value) {
            addCriterion("company_scale not like", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIn(List<String> values) {
            addCriterion("company_scale in", values, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotIn(List<String> values) {
            addCriterion("company_scale not in", values, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleBetween(String value1, String value2) {
            addCriterion("company_scale between", value1, value2, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotBetween(String value1, String value2) {
            addCriterion("company_scale not between", value1, value2, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameIsNull() {
            addCriterion("company_representative_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameIsNotNull() {
            addCriterion("company_representative_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameEqualTo(String value) {
            addCriterion("company_representative_name =", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameNotEqualTo(String value) {
            addCriterion("company_representative_name <>", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameGreaterThan(String value) {
            addCriterion("company_representative_name >", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_representative_name >=", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameLessThan(String value) {
            addCriterion("company_representative_name <", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameLessThanOrEqualTo(String value) {
            addCriterion("company_representative_name <=", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameLike(String value) {
            addCriterion("company_representative_name like", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameNotLike(String value) {
            addCriterion("company_representative_name not like", value, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameIn(List<String> values) {
            addCriterion("company_representative_name in", values, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameNotIn(List<String> values) {
            addCriterion("company_representative_name not in", values, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameBetween(String value1, String value2) {
            addCriterion("company_representative_name between", value1, value2, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andCompanyRepresentativeNameNotBetween(String value1, String value2) {
            addCriterion("company_representative_name not between", value1, value2, "companyRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andContactPositionIsNull() {
            addCriterion("contact_position is null");
            return (Criteria) this;
        }

        public Criteria andContactPositionIsNotNull() {
            addCriterion("contact_position is not null");
            return (Criteria) this;
        }

        public Criteria andContactPositionEqualTo(String value) {
            addCriterion("contact_position =", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionNotEqualTo(String value) {
            addCriterion("contact_position <>", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionGreaterThan(String value) {
            addCriterion("contact_position >", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionGreaterThanOrEqualTo(String value) {
            addCriterion("contact_position >=", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionLessThan(String value) {
            addCriterion("contact_position <", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionLessThanOrEqualTo(String value) {
            addCriterion("contact_position <=", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionLike(String value) {
            addCriterion("contact_position like", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionNotLike(String value) {
            addCriterion("contact_position not like", value, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionIn(List<String> values) {
            addCriterion("contact_position in", values, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionNotIn(List<String> values) {
            addCriterion("contact_position not in", values, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionBetween(String value1, String value2) {
            addCriterion("contact_position between", value1, value2, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPositionNotBetween(String value1, String value2) {
            addCriterion("contact_position not between", value1, value2, "contactPosition");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNull() {
            addCriterion("company_profile is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNotNull() {
            addCriterion("company_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileEqualTo(String value) {
            addCriterion("company_profile =", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotEqualTo(String value) {
            addCriterion("company_profile <>", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThan(String value) {
            addCriterion("company_profile >", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThanOrEqualTo(String value) {
            addCriterion("company_profile >=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThan(String value) {
            addCriterion("company_profile <", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThanOrEqualTo(String value) {
            addCriterion("company_profile <=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLike(String value) {
            addCriterion("company_profile like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotLike(String value) {
            addCriterion("company_profile not like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIn(List<String> values) {
            addCriterion("company_profile in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotIn(List<String> values) {
            addCriterion("company_profile not in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileBetween(String value1, String value2) {
            addCriterion("company_profile between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotBetween(String value1, String value2) {
            addCriterion("company_profile not between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andProvenceIsNull() {
            addCriterion("provence is null");
            return (Criteria) this;
        }

        public Criteria andProvenceIsNotNull() {
            addCriterion("provence is not null");
            return (Criteria) this;
        }

        public Criteria andProvenceEqualTo(String value) {
            addCriterion("provence =", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotEqualTo(String value) {
            addCriterion("provence <>", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceGreaterThan(String value) {
            addCriterion("provence >", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceGreaterThanOrEqualTo(String value) {
            addCriterion("provence >=", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLessThan(String value) {
            addCriterion("provence <", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLessThanOrEqualTo(String value) {
            addCriterion("provence <=", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLike(String value) {
            addCriterion("provence like", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotLike(String value) {
            addCriterion("provence not like", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceIn(List<String> values) {
            addCriterion("provence in", values, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotIn(List<String> values) {
            addCriterion("provence not in", values, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceBetween(String value1, String value2) {
            addCriterion("provence between", value1, value2, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotBetween(String value1, String value2) {
            addCriterion("provence not between", value1, value2, "provence");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andCertificationIsNull() {
            addCriterion("certification is null");
            return (Criteria) this;
        }

        public Criteria andCertificationIsNotNull() {
            addCriterion("certification is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationEqualTo(String value) {
            addCriterion("certification =", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotEqualTo(String value) {
            addCriterion("certification <>", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationGreaterThan(String value) {
            addCriterion("certification >", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("certification >=", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLessThan(String value) {
            addCriterion("certification <", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLessThanOrEqualTo(String value) {
            addCriterion("certification <=", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLike(String value) {
            addCriterion("certification like", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotLike(String value) {
            addCriterion("certification not like", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationIn(List<String> values) {
            addCriterion("certification in", values, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotIn(List<String> values) {
            addCriterion("certification not in", values, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationBetween(String value1, String value2) {
            addCriterion("certification between", value1, value2, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotBetween(String value1, String value2) {
            addCriterion("certification not between", value1, value2, "certification");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(String value) {
            addCriterion("vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(String value) {
            addCriterion("vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(String value) {
            addCriterion("vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(String value) {
            addCriterion("vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(String value) {
            addCriterion("vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(String value) {
            addCriterion("vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLike(String value) {
            addCriterion("vip like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotLike(String value) {
            addCriterion("vip not like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<String> values) {
            addCriterion("vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<String> values) {
            addCriterion("vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(String value1, String value2) {
            addCriterion("vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(String value1, String value2) {
            addCriterion("vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andMd51IsNull() {
            addCriterion("md5_1 is null");
            return (Criteria) this;
        }

        public Criteria andMd51IsNotNull() {
            addCriterion("md5_1 is not null");
            return (Criteria) this;
        }

        public Criteria andMd51EqualTo(String value) {
            addCriterion("md5_1 =", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51NotEqualTo(String value) {
            addCriterion("md5_1 <>", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51GreaterThan(String value) {
            addCriterion("md5_1 >", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51GreaterThanOrEqualTo(String value) {
            addCriterion("md5_1 >=", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51LessThan(String value) {
            addCriterion("md5_1 <", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51LessThanOrEqualTo(String value) {
            addCriterion("md5_1 <=", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51Like(String value) {
            addCriterion("md5_1 like", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51NotLike(String value) {
            addCriterion("md5_1 not like", value, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51In(List<String> values) {
            addCriterion("md5_1 in", values, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51NotIn(List<String> values) {
            addCriterion("md5_1 not in", values, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51Between(String value1, String value2) {
            addCriterion("md5_1 between", value1, value2, "md51");
            return (Criteria) this;
        }

        public Criteria andMd51NotBetween(String value1, String value2) {
            addCriterion("md5_1 not between", value1, value2, "md51");
            return (Criteria) this;
        }

        public Criteria andMd52IsNull() {
            addCriterion("md5_2 is null");
            return (Criteria) this;
        }

        public Criteria andMd52IsNotNull() {
            addCriterion("md5_2 is not null");
            return (Criteria) this;
        }

        public Criteria andMd52EqualTo(String value) {
            addCriterion("md5_2 =", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52NotEqualTo(String value) {
            addCriterion("md5_2 <>", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52GreaterThan(String value) {
            addCriterion("md5_2 >", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52GreaterThanOrEqualTo(String value) {
            addCriterion("md5_2 >=", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52LessThan(String value) {
            addCriterion("md5_2 <", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52LessThanOrEqualTo(String value) {
            addCriterion("md5_2 <=", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52Like(String value) {
            addCriterion("md5_2 like", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52NotLike(String value) {
            addCriterion("md5_2 not like", value, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52In(List<String> values) {
            addCriterion("md5_2 in", values, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52NotIn(List<String> values) {
            addCriterion("md5_2 not in", values, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52Between(String value1, String value2) {
            addCriterion("md5_2 between", value1, value2, "md52");
            return (Criteria) this;
        }

        public Criteria andMd52NotBetween(String value1, String value2) {
            addCriterion("md5_2 not between", value1, value2, "md52");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(String value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(String value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(String value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(String value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLike(String value) {
            addCriterion("register_id like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotLike(String value) {
            addCriterion("register_id not like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<String> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<String> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(String value1, String value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(String value1, String value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andJobCountIsNull() {
            addCriterion("job_count is null");
            return (Criteria) this;
        }

        public Criteria andJobCountIsNotNull() {
            addCriterion("job_count is not null");
            return (Criteria) this;
        }

        public Criteria andJobCountEqualTo(String value) {
            addCriterion("job_count =", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountNotEqualTo(String value) {
            addCriterion("job_count <>", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountGreaterThan(String value) {
            addCriterion("job_count >", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountGreaterThanOrEqualTo(String value) {
            addCriterion("job_count >=", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountLessThan(String value) {
            addCriterion("job_count <", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountLessThanOrEqualTo(String value) {
            addCriterion("job_count <=", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountLike(String value) {
            addCriterion("job_count like", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountNotLike(String value) {
            addCriterion("job_count not like", value, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountIn(List<String> values) {
            addCriterion("job_count in", values, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountNotIn(List<String> values) {
            addCriterion("job_count not in", values, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountBetween(String value1, String value2) {
            addCriterion("job_count between", value1, value2, "jobCount");
            return (Criteria) this;
        }

        public Criteria andJobCountNotBetween(String value1, String value2) {
            addCriterion("job_count not between", value1, value2, "jobCount");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeIsNull() {
            addCriterion("activity_degree is null");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeIsNotNull() {
            addCriterion("activity_degree is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeEqualTo(String value) {
            addCriterion("activity_degree =", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeNotEqualTo(String value) {
            addCriterion("activity_degree <>", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeGreaterThan(String value) {
            addCriterion("activity_degree >", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_degree >=", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeLessThan(String value) {
            addCriterion("activity_degree <", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeLessThanOrEqualTo(String value) {
            addCriterion("activity_degree <=", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeLike(String value) {
            addCriterion("activity_degree like", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeNotLike(String value) {
            addCriterion("activity_degree not like", value, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeIn(List<String> values) {
            addCriterion("activity_degree in", values, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeNotIn(List<String> values) {
            addCriterion("activity_degree not in", values, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeBetween(String value1, String value2) {
            addCriterion("activity_degree between", value1, value2, "activityDegree");
            return (Criteria) this;
        }

        public Criteria andActivityDegreeNotBetween(String value1, String value2) {
            addCriterion("activity_degree not between", value1, value2, "activityDegree");
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