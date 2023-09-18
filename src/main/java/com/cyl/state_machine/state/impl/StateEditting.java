package com.cyl.state_machine.state.impl;


import com.cyl.state_machine.context.EventContext;
import com.cyl.state_machine.event.EventType;
import com.cyl.state_machine.state.StateType;

public class StateEditting extends AbstractStateImpl {
    @Override
    public void update(EventContext ctx) {
        if (ctx.getEventType().equals(EventType.SUBMIT)) {
            ctx.getStateObj().setState(stateFactory.getStateImpl(StateType.EDITTING));
        } else if (ctx.getEventType().equals(EventType.SUBMIT)) {
            ctx.getStateObj().setState(stateFactory.getStateImpl(StateType.AUDITTING));
        }
    }
}
