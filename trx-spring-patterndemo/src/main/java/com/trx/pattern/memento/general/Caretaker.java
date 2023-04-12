package com.trx.pattern.memento.general;

public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }
    public void storeMemento(Memento memento){

        this.memento = memento;
    }
}
