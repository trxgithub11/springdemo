package com.trx.pattern.decorator.general;

public class client {

    public static void main(String args[]){

        Component c1 = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();

//        Decorator decoratorB = new ConcreteDecoratorB(c1);
//        decoratorB.operation();
        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
