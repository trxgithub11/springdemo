package com.trx.pattern.observer.mouseevent.handler;


import com.trx.pattern.observer.mouseevent.core.Event;
import com.trx.pattern.observer.mouseevent.core.EventListener;

public class MouseEventLisenter implements EventListener {


    public void onClick(Event e){

        System.out.println("触发鼠标单击事件"+e);
    }

    public void onMove(Event e){

        System.out.println("触发鼠标移动事件"+e);
    }
}
