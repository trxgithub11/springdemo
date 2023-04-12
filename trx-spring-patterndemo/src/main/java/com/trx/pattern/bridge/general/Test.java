package com.trx.pattern.bridge.general;

public class Test {

    public static void main(String[] args) {

        IImplementor imp = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.operation();
    }
}
