package com.trx.pattern.observer.gper.testgper;

import java.util.Observable;

public class Gper extends Observable {

    private  String name;

    public Gper(String name) {
        this.name = name;
    }

    public void publish(Question  question){

        setChanged();
        notifyObservers(question);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
