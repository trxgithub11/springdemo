package com.trx.pattern.observer.mouseevent.core;

import java.lang.reflect.Method;

public class Event {

    private Object source;

    private EventListener target;

    private Method callback;

    private String trigger;

    private long time;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }


    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public EventListener getTarget() {
        return target;
    }

    public void setTarget(EventListener target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;

        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
