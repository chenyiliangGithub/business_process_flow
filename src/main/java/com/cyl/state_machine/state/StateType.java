package com.cyl.state_machine.state;

public enum StateType {
    EDITTING("编辑中"),
    AUDITTING("审核中"),
    AUDIT_PASS("审核通过");

    String name;

    StateType(String name) {
        this.name = name;
    }
}
