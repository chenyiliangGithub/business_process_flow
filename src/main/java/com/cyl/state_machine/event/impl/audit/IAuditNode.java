package com.cyl.state_machine.event.impl.audit;

public interface IAuditNode {
    void doAudit();
    void getNextAuditNodeInfo(); // or getNextAuditNode?
}
