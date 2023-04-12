package com.trx.pattern.decorator.general;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }


    private void operationFirst(){  System.out.println("ConcreteDecoratorBoperationFirst");}
    private void operationLast(){ System.out.println("ConcreteDecoratorBoperationLast");}

    public void operation() {

        operationFirst();
        super.operation();
        operationLast();
    }
}
