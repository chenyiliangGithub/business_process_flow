package com.cyl.state_machine.state.impl;

import com.cyl.state_machine.context.EventContext;
import com.cyl.state_machine.event.EventType;
import com.cyl.state_machine.state.StateType;

public class StateAuditting extends AbstractStateImpl {
    @Override
    public void update(EventContext ctx) {
        if (ctx.getEventType().equals(EventType.AUDIT_PASS)) {
            ctx.getStateObj().setState(stateFactory.getStateImpl(StateType.AUDIT_PASS));
        } else if (ctx.getEventType().equals(EventType.AUDIT_REJECTED)) {
            ctx.getStateObj().setState(stateFactory.getStateImpl(StateType.EDITTING));
        } else if (ctx.getEventType().equals(EventType.RET_BACK)) {
            ctx.getStateObj().setState(stateFactory.getStateImpl(StateType.EDITTING));
        }
    }
}
