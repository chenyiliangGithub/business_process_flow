package com.cyl.state_machine.event;

public enum EventType {
    EDIT("编辑"),
    SUBMIT("提交"),
    AUDIT_PASS("审核通过"),
    AUDIT_REJECTED("审核未通过"),
    RET_BACK("退回");

    String name;

    EventType(String name) {
        this.name = name;
    }
}
