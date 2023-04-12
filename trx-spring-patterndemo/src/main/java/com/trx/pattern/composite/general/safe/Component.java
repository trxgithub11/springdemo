package com.trx.pattern.composite.general.safe;

public abstract  class Component {

    protected String name;
    public Component(String name){

        this.name = name;
    }
    public abstract  String operation();
}
