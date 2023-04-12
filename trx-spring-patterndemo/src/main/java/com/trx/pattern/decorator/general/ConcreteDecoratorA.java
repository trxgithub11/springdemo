package com.trx.pattern.decorator.general;

public class ConcreteDecoratorA  extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }


    private void operationFirst(){  System.out.println("ConcreteDecoratorAoperationFirst");}
    private void operationLast(){ System.out.println("ConcreteDecoratorAoperationLast");}

    public void operation() {

        operationFirst();
        super.operation();
        operationLast();
    }
}
