package com.trx.pattern.bridge.message.messagetest;

public class SmsMessage implements IMessage{
    private String message;
    private String toUser;

    public SmsMessage(String message, String toUser) {
        this.message = message;
        this.toUser = toUser;
    }

    public void send(String message, String toUser) {

        System.out.println("message:"+message +"toUser:"+toUser +"  SmsMessage");
    }
}
