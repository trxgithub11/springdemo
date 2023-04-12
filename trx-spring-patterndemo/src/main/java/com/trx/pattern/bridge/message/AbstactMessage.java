package com.trx.pattern.bridge.message;

public abstract class AbstactMessage {
    private IMessage message;

    public AbstactMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
