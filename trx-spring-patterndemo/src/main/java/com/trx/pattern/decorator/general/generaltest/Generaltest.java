package com.trx.pattern.decorator.general.generaltest;

public class Generaltest {

    public static void main(String args[]){

        Component  c = new ConcreteComponent();

        Decorator  decoratorA = new ConcreteDecoratorA(c);
        decoratorA.add();


        Decorator  decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.add();
    }
}
