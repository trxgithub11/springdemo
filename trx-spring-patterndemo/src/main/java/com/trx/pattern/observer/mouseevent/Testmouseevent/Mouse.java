package com.trx.pattern.observer.mouseevent.Testmouseevent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Mouse {

    Map<String,Event> map = new HashMap<String,Event>();


    public void addListener(String eventType, MouseListener Listener,Method  fallback){


        map.put(eventType,new Event(Listener,fallback));
    }

    public  void addListener(String eventType,MouseListener Listener){


        try {
            this.addListener(eventType,Listener,Listener.getClass().getMethod("on"+toUpperFirstCase(eventType),Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }


    public String toUpperFirstCase(String methodstr){

        char [] ch = methodstr.toCharArray();
        ch[0] -=32;

        return  String.valueOf(ch);
    }
    public void click(String eventType){


        Event event = map.get(eventType);


        try {
            event.getFallback().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    public void move(String eventType){


        Event event = map.get(eventType);


        try {
            event.getFallback().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
