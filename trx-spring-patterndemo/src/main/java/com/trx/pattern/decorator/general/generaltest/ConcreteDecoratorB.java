package com.trx.pattern.decorator.general.generaltest;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void first(){System.out.println("ConcreteDecoratorB");}
    private void last(){System.out.println("ConcreteDecoratorB");}

    public  void add(){

        first();
        super.add();
        last();
    }
}
