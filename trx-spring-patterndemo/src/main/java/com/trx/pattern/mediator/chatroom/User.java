package com.trx.pattern.mediator.chatroom;

public class User
{
    private String  name ;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {

        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String msg){
        this.chatRoom.showMsg(this,msg);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }
}
