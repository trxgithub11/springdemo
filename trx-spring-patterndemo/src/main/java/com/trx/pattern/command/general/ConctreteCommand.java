package com.trx.pattern.command.general;

public class ConctreteCommand implements  ICommand{
    Reciver   reciver = new Reciver();

    public void execute() {

        reciver.reciver();
    }
}
