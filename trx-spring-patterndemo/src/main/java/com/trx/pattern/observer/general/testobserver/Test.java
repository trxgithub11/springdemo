package com.trx.pattern.observer.general.testobserver;

public class Test {

    public  static void main(String args[]){

        IObserver  observer  = new CreateObserver();
        ISubject   subject = new CreateSubject();

        subject.register(observer);

        subject.notify("hello1");
    }


}
