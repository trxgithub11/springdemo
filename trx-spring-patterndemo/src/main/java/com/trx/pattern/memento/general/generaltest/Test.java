package com.trx.pattern.memento.general.generaltest;

public class Test
{
    public static void main(String[] args) {

        Originator  originator = new Originator();
        Caretaker  caretaker = new Caretaker();
        caretaker.setMemento(originator.createM());
        originator.setState("2");
        originator.restore(caretaker.getMemento());

        System.out.println(originator.getState());
    }
}
