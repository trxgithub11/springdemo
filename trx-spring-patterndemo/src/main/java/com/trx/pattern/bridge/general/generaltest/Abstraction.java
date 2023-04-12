package com.trx.pattern.bridge.general.generaltest;

public abstract class Abstraction {

    private Implementor  implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

//    public abstract  void add();

    public void add(){


    }
}
