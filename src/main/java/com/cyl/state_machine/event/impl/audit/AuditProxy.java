package com.cyl.state_machine.event.impl.audit;

import com.cyl.state_machine.event.impl.AbstractEventProxyTemplate;
import com.cyl.state_machine.state.IStateData;
import com.cyl.state_machine.state.StateType;
import org.springframework.stereotype.Component;

@Component
public class AuditProxy extends AbstractEventProxyTemplate {

    @Override
    protected void beforeEvent(IStateData stateObj) {
        super.beforeEvent(stateObj);
        if (!stateObj.getState().equals(StateType.AUDITTING)) {
            throw new IllegalArgumentException("数据状态错误，无法进行审核");
        }

        // 鉴权
        if (!(stateObj instanceof IAuditNode)) {
            throw new IllegalArgumentException("缺乏审核节点相关信息");
        }
        // 需要传参 request、session 可以用 threadlocal
        // 或者令 AuditProxy 也作为 bean 注入，则可以访问 bean 的 request、session。可否移到 AbstractEventProxyTemplate 中，因为多个实现类可能都要用
    }

    @Override
    protected void onEvent(IStateData stateObj) {
        IAuditNode auditNode = (IAuditNode) stateObj;
        auditNode.getNextAuditNodeInfo();
        auditNode.doAudit();
    }

    @Override
    protected void afterEvent(IStateData stateObj) {
        super.afterEvent(stateObj);
    }
}
