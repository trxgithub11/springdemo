package com.trx.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class PojoEvent {

    @Subscribe
    public void observer1(Pojo pojo){

        System.out.println("执行PojoEvent方法，参数为："+pojo);
    }
}
