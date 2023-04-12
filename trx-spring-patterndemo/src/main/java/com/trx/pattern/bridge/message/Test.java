package com.trx.pattern.bridge.message;

public class Test {
    public static void main(String[] args) {

        IMessage message = new SmsMessage();
        AbstactMessage abstactMessage = new NormalMessage(message);
        abstactMessage.sendMessage("加班申请","王总");
        message = new EmailMessage();
        abstactMessage = new UrgencyMessage(message);
        abstactMessage.sendMessage("加班申请","王总");
    }
}
