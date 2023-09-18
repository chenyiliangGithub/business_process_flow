package com.cyl.state_machine.state.impl;

import com.cyl.state_machine.state.IState;
import com.cyl.state_machine.state.StateType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象池，避免生成大量 IState 临时对象
 */
@Component
public class StateFactory {
    private Map<StateType, IState> map;

    public StateFactory() {
        this.map = new HashMap<>();

        map.put(StateType.EDITTING, new StateEditting());
        map.put(StateType.AUDIT_PASS, new StateAuditPass());
        map.put(StateType.AUDITTING, new StateAuditting());
    }

    public IState getStateImpl(StateType stateType) {
        return map.get(stateType);
    }
}
