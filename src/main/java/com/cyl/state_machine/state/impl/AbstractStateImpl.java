package com.cyl.state_machine.state.impl;

import com.cyl.state_machine.context.EventContext;
import com.cyl.state_machine.state.IState;

public abstract class AbstractStateImpl implements IState {
    protected StateFactory stateFactory;

    @Override
    public abstract void update(EventContext ctx);
}
