package com.cyl.state_machine.state.impl;

import com.cyl.state_machine.context.EventContext;
import com.cyl.state_machine.event.EventType;
import com.cyl.state_machine.state.StateType;

public class StateAuditPass extends AbstractStateImpl {
    @Override
    public void update(EventContext ctx) {
        if (ctx.getEventType().equals(EventType.RET_BACK)) {
            ctx.getStateObj().setState(stateFactory.getStateImpl(StateType.AUDITTING));
        }
    }
}
