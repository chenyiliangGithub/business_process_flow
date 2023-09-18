package com.cyl.state_machine.event.enums.audit;

// 业务数据来源
public enum CHANNEL {
    WEB("网页端", 0),
    MOBILE("移动端", 1);

    String name;
    Integer code;

    CHANNEL(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
