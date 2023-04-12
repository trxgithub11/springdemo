package com.trx.pattern.delegate.general;

import java.util.Random;

public class Delegate implements Task {
    public void doit() {

        if(new Random().nextBoolean()){
            new ConcreteA().doit();
        }else{
            new ConcreteB().doit();
        }


    }
}
