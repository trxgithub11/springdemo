package com.trx.pattern.bridge.message.messagetest;

public class Test {

    public static void main(String[] args) {
        IMessage message = new SmsMessage("短信","王总");
        AbstractMessage abstractMessage = new NormMessage(message);
        abstractMessage.send("短信","王总");
    }
}
