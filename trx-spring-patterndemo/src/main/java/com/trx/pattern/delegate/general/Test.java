package com.trx.pattern.delegate.general;

public class Test {

    public static void main(String[] args) {
        Task  task = new Delegate();

        task.doit();
    }
}
