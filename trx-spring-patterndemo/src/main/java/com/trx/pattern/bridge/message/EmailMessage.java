package com.trx.pattern.bridge.message;

public class EmailMessage implements IMessage{
    public void send(String message, String toUser) {
        System.out.println("ʹ���ʼ���Ϣ����" + message + "��" + toUser);
    }
}
