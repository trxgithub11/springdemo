package com.trx.pattern.observer.general;

public class ConcreateObserver<E> implements IObserver<E> {


    @Override
    public void update(E event) {

        System.out.println("receive event:"+event);
    }
}
