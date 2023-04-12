package com.trx.pattern.chain.genral;

public abstract class Handler {

    public Handler  nextHandler;
    public void request(String request){

        System.out.println("request"+request);
    }

    public void setNextHandler(Handler handler){

        this.nextHandler = handler;
    }
}
