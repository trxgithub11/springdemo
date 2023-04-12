package com.trx.pattern.chain.genral;

public class ConcreteHandlerB extends Handler{

    @Override
    public void request(String request) {
        System.out.println(request);

        if(nextHandler!=null){

            nextHandler.request("ConcreteHandlerB");
        }
    }
}
