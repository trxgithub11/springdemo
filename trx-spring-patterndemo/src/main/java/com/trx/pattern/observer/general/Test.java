package com.trx.pattern.observer.general;

public class Test {


    public static void main(String args[]) {

        ISubject<String> observable = new CreateSubject<String>();
        IObserver<String> observer = new ConcreateObserver<String>();

        observable.attach(observer);
        observable.notify("hello");
    }



}
