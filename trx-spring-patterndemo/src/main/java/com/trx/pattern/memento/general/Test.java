package com.trx.pattern.memento.general;

public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.storeMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
