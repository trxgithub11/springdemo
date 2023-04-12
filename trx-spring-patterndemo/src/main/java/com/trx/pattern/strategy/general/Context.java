package com.trx.pattern.strategy.general;

public class Context {

    private IStrategy  strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void get(){

        this.strategy.get();
    }
}
