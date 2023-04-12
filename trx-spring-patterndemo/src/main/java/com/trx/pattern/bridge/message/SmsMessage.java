package com.trx.pattern.bridge.message;

public class SmsMessage implements IMessage {
    public void send(String message, String toUser) {

        System.out.println("使用短信消息发送" + message + "给" + toUser);
    }
}
