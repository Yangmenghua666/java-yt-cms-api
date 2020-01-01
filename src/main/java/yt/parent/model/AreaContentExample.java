package yt.parent.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaContentExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelIsNull() {
            addCriterion("area_basemodel is null");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelIsNotNull() {
            addCriterion("area_basemodel is not null");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelEqualTo(String value) {
            addCriterion("area_basemodel =", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelNotEqualTo(String value) {
            addCriterion("area_basemodel <>", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelGreaterThan(String value) {
            addCriterion("area_basemodel >", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelGreaterThanOrEqualTo(String value) {
            addCriterion("area_basemodel >=", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelLessThan(String value) {
            addCriterion("area_basemodel <", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelLessThanOrEqualTo(String value) {
            addCriterion("area_basemodel <=", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelLike(String value) {
            addCriterion("area_basemodel like", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelNotLike(String value) {
            addCriterion("area_basemodel not like", value, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelIn(List<String> values) {
            addCriterion("area_basemodel in", values, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelNotIn(List<String> values) {
            addCriterion("area_basemodel not in", values, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelBetween(String value1, String value2) {
            addCriterion("area_basemodel between", value1, value2, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasemodelNotBetween(String value1, String value2) {
            addCriterion("area_basemodel not between", value1, value2, "areaBasemodel");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataIsNull() {
            addCriterion("area_basedata is null");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataIsNotNull() {
            addCriterion("area_basedata is not null");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataEqualTo(String value) {
            addCriterion("area_basedata =", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataNotEqualTo(String value) {
            addCriterion("area_basedata <>", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataGreaterThan(String value) {
            addCriterion("area_basedata >", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataGreaterThanOrEqualTo(String value) {
            addCriterion("area_basedata >=", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataLessThan(String value) {
            addCriterion("area_basedata <", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataLessThanOrEqualTo(String value) {
            addCriterion("area_basedata <=", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataLike(String value) {
            addCriterion("area_basedata like", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataNotLike(String value) {
            addCriterion("area_basedata not like", value, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataIn(List<String> values) {
            addCriterion("area_basedata in", values, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataNotIn(List<String> values) {
            addCriterion("area_basedata not in", values, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataBetween(String value1, String value2) {
            addCriterion("area_basedata between", value1, value2, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaBasedataNotBetween(String value1, String value2) {
            addCriterion("area_basedata not between", value1, value2, "areaBasedata");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelIsNull() {
            addCriterion("area_listmodel is null");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelIsNotNull() {
            addCriterion("area_listmodel is not null");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelEqualTo(String value) {
            addCriterion("area_listmodel =", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelNotEqualTo(String value) {
            addCriterion("area_listmodel <>", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelGreaterThan(String value) {
            addCriterion("area_listmodel >", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelGreaterThanOrEqualTo(String value) {
            addCriterion("area_listmodel >=", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelLessThan(String value) {
            addCriterion("area_listmodel <", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelLessThanOrEqualTo(String value) {
            addCriterion("area_listmodel <=", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelLike(String value) {
            addCriterion("area_listmodel like", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelNotLike(String value) {
            addCriterion("area_listmodel not like", value, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelIn(List<String> values) {
            addCriterion("area_listmodel in", values, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelNotIn(List<String> values) {
            addCriterion("area_listmodel not in", values, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelBetween(String value1, String value2) {
            addCriterion("area_listmodel between", value1, value2, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListmodelNotBetween(String value1, String value2) {
            addCriterion("area_listmodel not between", value1, value2, "areaListmodel");
            return (Criteria) this;
        }

        public Criteria andAreaListdataIsNull() {
            addCriterion("area_listdata is null");
            return (Criteria) this;
        }

        public Criteria andAreaListdataIsNotNull() {
            addCriterion("area_listdata is not null");
            return (Criteria) this;
        }

        public Criteria andAreaListdataEqualTo(String value) {
            addCriterion("area_listdata =", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataNotEqualTo(String value) {
            addCriterion("area_listdata <>", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataGreaterThan(String value) {
            addCriterion("area_listdata >", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataGreaterThanOrEqualTo(String value) {
            addCriterion("area_listdata >=", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataLessThan(String value) {
            addCriterion("area_listdata <", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataLessThanOrEqualTo(String value) {
            addCriterion("area_listdata <=", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataLike(String value) {
            addCriterion("area_listdata like", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataNotLike(String value) {
            addCriterion("area_listdata not like", value, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataIn(List<String> values) {
            addCriterion("area_listdata in", values, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataNotIn(List<String> values) {
            addCriterion("area_listdata not in", values, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataBetween(String value1, String value2) {
            addCriterion("area_listdata between", value1, value2, "areaListdata");
            return (Criteria) this;
        }

        public Criteria andAreaListdataNotBetween(String value1, String value2) {
            addCriterion("area_listdata not between", value1, value2, "areaListdata");
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