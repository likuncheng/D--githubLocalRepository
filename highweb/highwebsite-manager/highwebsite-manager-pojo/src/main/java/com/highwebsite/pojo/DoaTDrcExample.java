package com.highwebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoaTDrcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoaTDrcExample() {
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

        public Criteria andMd5IsNull() {
            addCriterion("md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNull() {
            addCriterion("data_name is null");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNotNull() {
            addCriterion("data_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataNameEqualTo(String value) {
            addCriterion("data_name =", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotEqualTo(String value) {
            addCriterion("data_name <>", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThan(String value) {
            addCriterion("data_name >", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_name >=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThan(String value) {
            addCriterion("data_name <", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThanOrEqualTo(String value) {
            addCriterion("data_name <=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLike(String value) {
            addCriterion("data_name like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotLike(String value) {
            addCriterion("data_name not like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameIn(List<String> values) {
            addCriterion("data_name in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotIn(List<String> values) {
            addCriterion("data_name not in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameBetween(String value1, String value2) {
            addCriterion("data_name between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotBetween(String value1, String value2) {
            addCriterion("data_name not between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelIsNull() {
            addCriterion("data_security_level is null");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelIsNotNull() {
            addCriterion("data_security_level is not null");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelEqualTo(String value) {
            addCriterion("data_security_level =", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelNotEqualTo(String value) {
            addCriterion("data_security_level <>", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelGreaterThan(String value) {
            addCriterion("data_security_level >", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("data_security_level >=", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelLessThan(String value) {
            addCriterion("data_security_level <", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelLessThanOrEqualTo(String value) {
            addCriterion("data_security_level <=", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelLike(String value) {
            addCriterion("data_security_level like", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelNotLike(String value) {
            addCriterion("data_security_level not like", value, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelIn(List<String> values) {
            addCriterion("data_security_level in", values, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelNotIn(List<String> values) {
            addCriterion("data_security_level not in", values, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelBetween(String value1, String value2) {
            addCriterion("data_security_level between", value1, value2, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSecurityLevelNotBetween(String value1, String value2) {
            addCriterion("data_security_level not between", value1, value2, "dataSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andDataSizeIsNull() {
            addCriterion("data_size is null");
            return (Criteria) this;
        }

        public Criteria andDataSizeIsNotNull() {
            addCriterion("data_size is not null");
            return (Criteria) this;
        }

        public Criteria andDataSizeEqualTo(Integer value) {
            addCriterion("data_size =", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeNotEqualTo(Integer value) {
            addCriterion("data_size <>", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeGreaterThan(Integer value) {
            addCriterion("data_size >", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_size >=", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeLessThan(Integer value) {
            addCriterion("data_size <", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeLessThanOrEqualTo(Integer value) {
            addCriterion("data_size <=", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeIn(List<Integer> values) {
            addCriterion("data_size in", values, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeNotIn(List<Integer> values) {
            addCriterion("data_size not in", values, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeBetween(Integer value1, Integer value2) {
            addCriterion("data_size between", value1, value2, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("data_size not between", value1, value2, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataFormatIsNull() {
            addCriterion("data_format is null");
            return (Criteria) this;
        }

        public Criteria andDataFormatIsNotNull() {
            addCriterion("data_format is not null");
            return (Criteria) this;
        }

        public Criteria andDataFormatEqualTo(String value) {
            addCriterion("data_format =", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotEqualTo(String value) {
            addCriterion("data_format <>", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatGreaterThan(String value) {
            addCriterion("data_format >", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatGreaterThanOrEqualTo(String value) {
            addCriterion("data_format >=", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatLessThan(String value) {
            addCriterion("data_format <", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatLessThanOrEqualTo(String value) {
            addCriterion("data_format <=", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatLike(String value) {
            addCriterion("data_format like", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotLike(String value) {
            addCriterion("data_format not like", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatIn(List<String> values) {
            addCriterion("data_format in", values, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotIn(List<String> values) {
            addCriterion("data_format not in", values, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatBetween(String value1, String value2) {
            addCriterion("data_format between", value1, value2, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotBetween(String value1, String value2) {
            addCriterion("data_format not between", value1, value2, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataOwnerIsNull() {
            addCriterion("data_owner is null");
            return (Criteria) this;
        }

        public Criteria andDataOwnerIsNotNull() {
            addCriterion("data_owner is not null");
            return (Criteria) this;
        }

        public Criteria andDataOwnerEqualTo(String value) {
            addCriterion("data_owner =", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerNotEqualTo(String value) {
            addCriterion("data_owner <>", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerGreaterThan(String value) {
            addCriterion("data_owner >", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("data_owner >=", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerLessThan(String value) {
            addCriterion("data_owner <", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerLessThanOrEqualTo(String value) {
            addCriterion("data_owner <=", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerLike(String value) {
            addCriterion("data_owner like", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerNotLike(String value) {
            addCriterion("data_owner not like", value, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerIn(List<String> values) {
            addCriterion("data_owner in", values, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerNotIn(List<String> values) {
            addCriterion("data_owner not in", values, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerBetween(String value1, String value2) {
            addCriterion("data_owner between", value1, value2, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataOwnerNotBetween(String value1, String value2) {
            addCriterion("data_owner not between", value1, value2, "dataOwner");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeIsNull() {
            addCriterion("data_registeration_time is null");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeIsNotNull() {
            addCriterion("data_registeration_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeEqualTo(Date value) {
            addCriterion("data_registeration_time =", value, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeNotEqualTo(Date value) {
            addCriterion("data_registeration_time <>", value, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeGreaterThan(Date value) {
            addCriterion("data_registeration_time >", value, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_registeration_time >=", value, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeLessThan(Date value) {
            addCriterion("data_registeration_time <", value, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_registeration_time <=", value, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeIn(List<Date> values) {
            addCriterion("data_registeration_time in", values, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeNotIn(List<Date> values) {
            addCriterion("data_registeration_time not in", values, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeBetween(Date value1, Date value2) {
            addCriterion("data_registeration_time between", value1, value2, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataRegisterationTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_registeration_time not between", value1, value2, "dataRegisterationTime");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataStorageIsNull() {
            addCriterion("data_storage is null");
            return (Criteria) this;
        }

        public Criteria andDataStorageIsNotNull() {
            addCriterion("data_storage is not null");
            return (Criteria) this;
        }

        public Criteria andDataStorageEqualTo(String value) {
            addCriterion("data_storage =", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageNotEqualTo(String value) {
            addCriterion("data_storage <>", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageGreaterThan(String value) {
            addCriterion("data_storage >", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageGreaterThanOrEqualTo(String value) {
            addCriterion("data_storage >=", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageLessThan(String value) {
            addCriterion("data_storage <", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageLessThanOrEqualTo(String value) {
            addCriterion("data_storage <=", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageLike(String value) {
            addCriterion("data_storage like", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageNotLike(String value) {
            addCriterion("data_storage not like", value, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageIn(List<String> values) {
            addCriterion("data_storage in", values, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageNotIn(List<String> values) {
            addCriterion("data_storage not in", values, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageBetween(String value1, String value2) {
            addCriterion("data_storage between", value1, value2, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataStorageNotBetween(String value1, String value2) {
            addCriterion("data_storage not between", value1, value2, "dataStorage");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressIsNull() {
            addCriterion("data_record_address is null");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressIsNotNull() {
            addCriterion("data_record_address is not null");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressEqualTo(String value) {
            addCriterion("data_record_address =", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressNotEqualTo(String value) {
            addCriterion("data_record_address <>", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressGreaterThan(String value) {
            addCriterion("data_record_address >", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressGreaterThanOrEqualTo(String value) {
            addCriterion("data_record_address >=", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressLessThan(String value) {
            addCriterion("data_record_address <", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressLessThanOrEqualTo(String value) {
            addCriterion("data_record_address <=", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressLike(String value) {
            addCriterion("data_record_address like", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressNotLike(String value) {
            addCriterion("data_record_address not like", value, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressIn(List<String> values) {
            addCriterion("data_record_address in", values, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressNotIn(List<String> values) {
            addCriterion("data_record_address not in", values, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressBetween(String value1, String value2) {
            addCriterion("data_record_address between", value1, value2, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andDataRecordAddressNotBetween(String value1, String value2) {
            addCriterion("data_record_address not between", value1, value2, "dataRecordAddress");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
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