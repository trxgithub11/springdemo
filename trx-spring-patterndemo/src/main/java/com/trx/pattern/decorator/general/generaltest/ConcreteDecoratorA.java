package com.trx.pattern.decorator.general.generaltest;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void first(){System.out.println("ConcreteDecoratorAfirst");}
    private void last(){System.out.println("ConcreteDecoratorAlast");}

    public  void add(){

        first();
        super.add();
        last();
    }
}
