package com.trx.pattern.observer.general;

public interface IObserver<E> {

    void update(E event);
}
