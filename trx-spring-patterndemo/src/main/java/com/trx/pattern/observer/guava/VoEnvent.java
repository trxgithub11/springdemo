package com.trx.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class VoEnvent {


    @Subscribe
    public void observer1(Vo pojo){

        System.out.println("VoEnvent，参数为："+pojo);
    }
}
