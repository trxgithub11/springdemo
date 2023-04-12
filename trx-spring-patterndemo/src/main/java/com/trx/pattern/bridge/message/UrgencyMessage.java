package com.trx.pattern.bridge.message;

public class UrgencyMessage extends AbstactMessage{


    public UrgencyMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message,String toUser){

        message = "[�Ӽ�]"+message;
        super.sendMessage(message,toUser);
    }

    public Object watch(String messageId){return null;}
}
