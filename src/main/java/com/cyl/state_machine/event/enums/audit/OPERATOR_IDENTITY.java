package com.cyl.state_machine.event.enums.audit;

public enum OPERATOR_IDENTITY {
    OPERATE("操作岗", 0),
    AUDIT("审核岗", 1);

    String name;
    Integer code;

    OPERATOR_IDENTITY(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
