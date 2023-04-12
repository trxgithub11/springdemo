package com.trx.pattern.observer.mouseevent.Testmouseevent;

import java.lang.reflect.Method;

public class Event {

    private  String eventType;
    private MouseListener target;
    private Method fallback;

    public Event(MouseListener target, Method fallback) {
        this.target = target;
        this.fallback = fallback;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public MouseListener getTarget() {
        return target;
    }

    public void setTarget(MouseListener target) {
        this.target = target;
    }

    public Method getFallback() {
        return fallback;
    }

    public void setFallback(Method fallback) {
        this.fallback = fallback;
    }
}
