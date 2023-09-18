package com.cyl.state_machine.state;


import com.cyl.state_machine.context.EventContext;

public interface IState {
    /**
     *
     */
    void update(EventContext ctx);
}
