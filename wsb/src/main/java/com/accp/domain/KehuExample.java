package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KehuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNull() {
            addCriterion("lianxiren is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNotNull() {
            addCriterion("lianxiren is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenEqualTo(String value) {
            addCriterion("lianxiren =", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotEqualTo(String value) {
            addCriterion("lianxiren <>", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThan(String value) {
            addCriterion("lianxiren >", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiren >=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThan(String value) {
            addCriterion("lianxiren <", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThanOrEqualTo(String value) {
            addCriterion("lianxiren <=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLike(String value) {
            addCriterion("lianxiren like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotLike(String value) {
            addCriterion("lianxiren not like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenIn(List<String> values) {
            addCriterion("lianxiren in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotIn(List<String> values) {
            addCriterion("lianxiren not in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenBetween(String value1, String value2) {
            addCriterion("lianxiren between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotBetween(String value1, String value2) {
            addCriterion("lianxiren not between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("data like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("data not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNull() {
            addCriterion("dianhua is null");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNotNull() {
            addCriterion("dianhua is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuaEqualTo(String value) {
            addCriterion("dianhua =", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotEqualTo(String value) {
            addCriterion("dianhua <>", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThan(String value) {
            addCriterion("dianhua >", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("dianhua >=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThan(String value) {
            addCriterion("dianhua <", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThanOrEqualTo(String value) {
            addCriterion("dianhua <=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLike(String value) {
            addCriterion("dianhua like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotLike(String value) {
            addCriterion("dianhua not like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaIn(List<String> values) {
            addCriterion("dianhua in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotIn(List<String> values) {
            addCriterion("dianhua not in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaBetween(String value1, String value2) {
            addCriterion("dianhua between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotBetween(String value1, String value2) {
            addCriterion("dianhua not between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDazhiidIsNull() {
            addCriterion("dazhiid is null");
            return (Criteria) this;
        }

        public Criteria andDazhiidIsNotNull() {
            addCriterion("dazhiid is not null");
            return (Criteria) this;
        }

        public Criteria andDazhiidEqualTo(Integer value) {
            addCriterion("dazhiid =", value, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidNotEqualTo(Integer value) {
            addCriterion("dazhiid <>", value, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidGreaterThan(Integer value) {
            addCriterion("dazhiid >", value, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dazhiid >=", value, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidLessThan(Integer value) {
            addCriterion("dazhiid <", value, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidLessThanOrEqualTo(Integer value) {
            addCriterion("dazhiid <=", value, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidIn(List<Integer> values) {
            addCriterion("dazhiid in", values, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidNotIn(List<Integer> values) {
            addCriterion("dazhiid not in", values, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidBetween(Integer value1, Integer value2) {
            addCriterion("dazhiid between", value1, value2, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andDazhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("dazhiid not between", value1, value2, "dazhiid");
            return (Criteria) this;
        }

        public Criteria andFzrIsNull() {
            addCriterion("fzr is null");
            return (Criteria) this;
        }

        public Criteria andFzrIsNotNull() {
            addCriterion("fzr is not null");
            return (Criteria) this;
        }

        public Criteria andFzrEqualTo(String value) {
            addCriterion("fzr =", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotEqualTo(String value) {
            addCriterion("fzr <>", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThan(String value) {
            addCriterion("fzr >", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThanOrEqualTo(String value) {
            addCriterion("fzr >=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThan(String value) {
            addCriterion("fzr <", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThanOrEqualTo(String value) {
            addCriterion("fzr <=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLike(String value) {
            addCriterion("fzr like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotLike(String value) {
            addCriterion("fzr not like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrIn(List<String> values) {
            addCriterion("fzr in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotIn(List<String> values) {
            addCriterion("fzr not in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrBetween(String value1, String value2) {
            addCriterion("fzr between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotBetween(String value1, String value2) {
            addCriterion("fzr not between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andDjhIsNull() {
            addCriterion("djh is null");
            return (Criteria) this;
        }

        public Criteria andDjhIsNotNull() {
            addCriterion("djh is not null");
            return (Criteria) this;
        }

        public Criteria andDjhEqualTo(String value) {
            addCriterion("djh =", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotEqualTo(String value) {
            addCriterion("djh <>", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhGreaterThan(String value) {
            addCriterion("djh >", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhGreaterThanOrEqualTo(String value) {
            addCriterion("djh >=", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLessThan(String value) {
            addCriterion("djh <", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLessThanOrEqualTo(String value) {
            addCriterion("djh <=", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLike(String value) {
            addCriterion("djh like", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotLike(String value) {
            addCriterion("djh not like", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhIn(List<String> values) {
            addCriterion("djh in", values, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotIn(List<String> values) {
            addCriterion("djh not in", values, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhBetween(String value1, String value2) {
            addCriterion("djh between", value1, value2, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotBetween(String value1, String value2) {
            addCriterion("djh not between", value1, value2, "djh");
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