package com.cyl.controller;

import com.cyl.state_machine.event.impl.audit.AuditProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl {
    @Autowired
    AuditProxy auditProxy;

    public void test() {
        auditProxy.execute(auditNode); // auditNode implements IStateData、IAuditNode
    }
}
