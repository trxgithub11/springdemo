package com.trx.pattern.chain.genral;

public class Test {

    public static void main(String[] args) {

        Handler  handler = new ConcreteHandlerA();
        Handler  handlerB = new ConcreteHandlerB();
        handler.setNextHandler(handlerB);
        handler.request("requestA");


    }

}
