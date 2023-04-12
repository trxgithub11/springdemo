package com.trx.pattern.observer.general.testobserver;

import java.util.ArrayList;
import java.util.List;

public class CreateSubject implements ISubject{

    List<IObserver> observers = new ArrayList<IObserver>();
    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notify(String event) {

        for(IObserver observer : this.observers){

            observer.update(event);
        }
    }
}
