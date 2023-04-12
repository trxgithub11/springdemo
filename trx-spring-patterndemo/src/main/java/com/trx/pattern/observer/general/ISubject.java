package com.trx.pattern.observer.general;

public interface ISubject<E> {


    boolean attach(IObserver<E> observer);
    boolean detch(IObserver<E> observer);
    void notify(E event);
}
