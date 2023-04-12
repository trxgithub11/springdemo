package com.trx.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

public class TestGuava {

    public static void main(String args[]){

        EventBus eventBus = new EventBus();

        PojoEvent pojoEvent = new PojoEvent();
        VoEnvent voEnvent = new VoEnvent();
        eventBus.register(pojoEvent);
        eventBus.register(voEnvent);
        eventBus.post(new Pojo("tom"));
        eventBus.post(new Vo("vo"));
    }
}
