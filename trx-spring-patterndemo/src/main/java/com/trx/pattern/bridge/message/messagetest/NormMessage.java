package com.trx.pattern.bridge.message.messagetest;

public class NormMessage extends  AbstractMessage{

    public NormMessage(IMessage message) {
        super(message);
    }

    public void send(String message,String toUser) {
         super.send(message,toUser);
        System.out.println("message:"+message +"toUser:"+toUser+"  AbstractMessage");
    }
}
