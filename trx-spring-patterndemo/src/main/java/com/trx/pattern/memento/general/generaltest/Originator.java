package com.trx.pattern.memento.general.generaltest;

public class Originator {

    private String state="1";

    private Memento memento;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento  createM(){

        return new Memento(this.state);
    }


    public void restore(Memento memento){

        this.setState(memento.getState());
    }
}
