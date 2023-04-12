package com.trx.pattern.observer.mouseevent.Testmouseevent;

public class TestMouseEvent {

    public static void main(String args[]){

        MouseListener  mouseListener = new MouseListener();
        Mouse  mouse = new Mouse();

        mouse.addListener(MouseEventType.ON_CLICK,mouseListener);
        mouse.addListener(MouseEventType.ON_MOVE,mouseListener);

        mouse.click(MouseEventType.ON_CLICK);

        mouse.move(MouseEventType.ON_MOVE);
    }
}
