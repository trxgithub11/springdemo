package com.trx.pattern.observer.mouseevent.Testmouseevent;

public class MouseListener {


    private  Event  event;
    public void onClick(Event e){

        System.out.println("单击事件"+e);
    }

    public void onMove(Event e){

        System.out.println("移动事件"+e);
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
