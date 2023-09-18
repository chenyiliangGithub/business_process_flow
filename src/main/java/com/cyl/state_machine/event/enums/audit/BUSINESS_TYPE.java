package com.cyl.state_machine.event.enums.audit;

// 业务类型
public enum BUSINESS_TYPE {
    PERSON_INFO_CHANGE("个人信息变更", 200);

    String name;
    Integer code;

    BUSINESS_TYPE(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
