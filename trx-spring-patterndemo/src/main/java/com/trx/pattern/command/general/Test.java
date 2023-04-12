package com.trx.pattern.command.general;

public class Test {

    public static void main(String[] args) {
        ICommand  command = new ConctreteCommand();
        Invoker  invoker = new Invoker(command);
        invoker.action();
    }
}
