package com.trx.pattern.observer.general.testobserver;

public interface ISubject {

    void register(IObserver observer);
    void notify(String event);
}
