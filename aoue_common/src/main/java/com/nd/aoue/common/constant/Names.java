package com.nd.aoue.common.constant;

import com.nd.aoue.common.bean.Val;

/**
 * 枚举类型常量
 */

public enum Names implements Val {
    TOPIC("ct"),  // 主题
    NAMESPACE("ct"),//命名空间
    TABLE("ct:calllog"),//通话的日志
    CF_CALLER("caller"),//列族，主叫
    CF_CALLEE("callee"),//列族，被叫
    CF_INFO("info"),//列族
    ;


    private String name;

    Names(String name) {
        this.name = name;
    }

    @Override
    public void setValue(Object val) {
        this.name = (String) val;
    }

    @Override
    public String getValue() {
        return name;
    }
}
