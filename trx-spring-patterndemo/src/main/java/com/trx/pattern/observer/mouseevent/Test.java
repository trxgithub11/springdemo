package com.trx.pattern.observer.mouseevent;


import com.trx.pattern.observer.mouseevent.handler.Mouse;
import com.trx.pattern.observer.mouseevent.handler.MouseEventLisenter;
import com.trx.pattern.observer.mouseevent.handler.MouseEventType;

public class Test {

    public static void main(String args[]){

        MouseEventLisenter lisenter = new MouseEventLisenter();
        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK,lisenter);
        mouse.addLisenter(MouseEventType.ON_MOVE,lisenter);

        mouse.click();
        mouse.move();
    }
}
