package yt.parent.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageExample() {
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

        public Criteria andPageNameIsNull() {
            addCriterion("page_name is null");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNotNull() {
            addCriterion("page_name is not null");
            return (Criteria) this;
        }

        public Criteria andPageNameEqualTo(String value) {
            addCriterion("page_name =", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotEqualTo(String value) {
            addCriterion("page_name <>", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThan(String value) {
            addCriterion("page_name >", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("page_name >=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThan(String value) {
            addCriterion("page_name <", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThanOrEqualTo(String value) {
            addCriterion("page_name <=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLike(String value) {
            addCriterion("page_name like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotLike(String value) {
            addCriterion("page_name not like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameIn(List<String> values) {
            addCriterion("page_name in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotIn(List<String> values) {
            addCriterion("page_name not in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameBetween(String value1, String value2) {
            addCriterion("page_name between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotBetween(String value1, String value2) {
            addCriterion("page_name not between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageFidIsNull() {
            addCriterion("page_fid is null");
            return (Criteria) this;
        }

        public Criteria andPageFidIsNotNull() {
            addCriterion("page_fid is not null");
            return (Criteria) this;
        }

        public Criteria andPageFidEqualTo(Integer value) {
            addCriterion("page_fid =", value, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidNotEqualTo(Integer value) {
            addCriterion("page_fid <>", value, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidGreaterThan(Integer value) {
            addCriterion("page_fid >", value, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_fid >=", value, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidLessThan(Integer value) {
            addCriterion("page_fid <", value, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidLessThanOrEqualTo(Integer value) {
            addCriterion("page_fid <=", value, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidIn(List<Integer> values) {
            addCriterion("page_fid in", values, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidNotIn(List<Integer> values) {
            addCriterion("page_fid not in", values, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidBetween(Integer value1, Integer value2) {
            addCriterion("page_fid between", value1, value2, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageFidNotBetween(Integer value1, Integer value2) {
            addCriterion("page_fid not between", value1, value2, "pageFid");
            return (Criteria) this;
        }

        public Criteria andPageStatusIsNull() {
            addCriterion("page_status is null");
            return (Criteria) this;
        }

        public Criteria andPageStatusIsNotNull() {
            addCriterion("page_status is not null");
            return (Criteria) this;
        }

        public Criteria andPageStatusEqualTo(Integer value) {
            addCriterion("page_status =", value, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusNotEqualTo(Integer value) {
            addCriterion("page_status <>", value, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusGreaterThan(Integer value) {
            addCriterion("page_status >", value, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_status >=", value, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusLessThan(Integer value) {
            addCriterion("page_status <", value, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("page_status <=", value, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusIn(List<Integer> values) {
            addCriterion("page_status in", values, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusNotIn(List<Integer> values) {
            addCriterion("page_status not in", values, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusBetween(Integer value1, Integer value2) {
            addCriterion("page_status between", value1, value2, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andPageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("page_status not between", value1, value2, "pageStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateGuidIsNull() {
            addCriterion("create_guid is null");
            return (Criteria) this;
        }

        public Criteria andCreateGuidIsNotNull() {
            addCriterion("create_guid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateGuidEqualTo(String value) {
            addCriterion("create_guid =", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidNotEqualTo(String value) {
            addCriterion("create_guid <>", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidGreaterThan(String value) {
            addCriterion("create_guid >", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidGreaterThanOrEqualTo(String value) {
            addCriterion("create_guid >=", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidLessThan(String value) {
            addCriterion("create_guid <", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidLessThanOrEqualTo(String value) {
            addCriterion("create_guid <=", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidLike(String value) {
            addCriterion("create_guid like", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidNotLike(String value) {
            addCriterion("create_guid not like", value, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidIn(List<String> values) {
            addCriterion("create_guid in", values, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidNotIn(List<String> values) {
            addCriterion("create_guid not in", values, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidBetween(String value1, String value2) {
            addCriterion("create_guid between", value1, value2, "createGuid");
            return (Criteria) this;
        }

        public Criteria andCreateGuidNotBetween(String value1, String value2) {
            addCriterion("create_guid not between", value1, value2, "createGuid");
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