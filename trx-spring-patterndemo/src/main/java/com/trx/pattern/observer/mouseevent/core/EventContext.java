package com.trx.pattern.observer.mouseevent.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventContext {

    protected Map<String,Event> events = new HashMap<String,Event>();
    public void addLisenter(String eventType, EventListener target, Method callback){

        events.put(eventType,new Event(target,callback));

    }
    public void addLisenter(String eventType,EventListener target){

        try {
            this.addLisenter(eventType,target,target.getClass().getMethod("on"+toUpperFirstCase(eventType),Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


    public String toUpperFirstCase(String methodstr){

        char []  ch = methodstr.toCharArray();
        ch[0] -= 32 ;
        return String.valueOf(ch);

    }



    private void trigger(Event event){

        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        if(event.getCallback()!=null){

            try {
                event.getCallback().invoke(event.getTarget(),event);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }



    protected void trigger(String trigger){

        if(!this.events.containsKey(trigger)){return;}
        trigger(this.events.get(trigger).setTrigger(trigger));
    }





















}
