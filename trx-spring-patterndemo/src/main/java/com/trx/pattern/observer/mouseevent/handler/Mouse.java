package com.trx.pattern.observer.mouseevent.handler;

import com.trx.pattern.observer.mouseevent.core.EventContext;

public class Mouse extends EventContext {

    public void click(){

        System.out.println("调用单击方法");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void move(){

        System.out.println("调用移动方法");

        this.trigger(MouseEventType.ON_MOVE);
    }
}
