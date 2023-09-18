package com.cyl.state_machine.event.enums.audit;

public enum CORPORATION_LEVEL {
    FIRST("一级（集团）", 1),
    SECOND("二级（企业）", 2),
    THIRD("三级（公司）", 3);

    String name;
    Integer code;

    CORPORATION_LEVEL(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
