package com.cyl.state_machine.state;

public interface IStateData {
    IState getState();
    void setState(IState state);
}
