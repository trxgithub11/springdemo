package com.trx.pattern.command.general;

public class Invoker {

    private ICommand  command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action(){

        this.command.execute();
    }
}
