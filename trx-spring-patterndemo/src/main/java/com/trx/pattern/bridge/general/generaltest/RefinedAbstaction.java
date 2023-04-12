package com.trx.pattern.bridge.general.generaltest;

public class RefinedAbstaction extends Abstraction{
    private Implementor  implementor;
    public RefinedAbstaction(Implementor implementor) {
        super(implementor);
        this.implementor = implementor;
    }

    public void add() {
        implementor.add();
        System.out.println("RefinedAbstaction");
    }
}
