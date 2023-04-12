package com.trx.pattern.observer.general;

import java.util.ArrayList;
import java.util.List;

public class CreateSubject<E> implements ISubject<E> {

    private List<IObserver<E>> observers = new ArrayList<IObserver<E>>();
    @Override
    public boolean attach(IObserver<E> observer) {
        return !this.observers.contains(observer)&&this.observers.add(observer);
    }

    @Override
    public boolean detch(IObserver<E> observer) {
        return this.observers.remove(observer);
    }

    @Override
    public void notify(E event) {

        for(IObserver<E> observer : this.observers){

                observer.update(event);
        }
    }
}
