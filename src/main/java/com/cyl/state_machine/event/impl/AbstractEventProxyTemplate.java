package com.cyl.state_machine.event.impl;


import com.cyl.state_machine.state.IStateData;

public abstract class AbstractEventProxyTemplate {

    protected void beforeEvent(IStateData stateObj) {}

    /**
     * 抽象方法，由子类具体实现
     */
    protected abstract void onEvent(IStateData stateObj);

    protected void afterEvent(IStateData stateObj) {
        // 记录操作日志
    }

    /**
     * 模板方法
     */
    public void execute(IStateData stateObj) {
        beforeEvent(stateObj);
        onEvent(stateObj);
        afterEvent(stateObj);
    }
}
