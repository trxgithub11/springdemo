package com.trx.pattern.bridge.message.messagetest;

public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

     public   void send(String message,String toUser){

        this.message.send(message,toUser);
    }
}
