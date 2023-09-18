package com.cyl.state_machine.context;


import com.cyl.state_machine.event.EventType;
import com.cyl.state_machine.state.IStateData;

public class EventContext {
    IStateData stateObj;
    EventType eventType;

    public EventContext(IStateData stateObj, EventType eventType) {
        this.stateObj = stateObj;
        this.eventType = eventType;
    }

    public IStateData getStateObj() {
        return stateObj;
    }

    public void setStateObj(IStateData stateObj) {
        this.stateObj = stateObj;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
