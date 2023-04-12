package com.trx.pattern.facade;

public class Facade {

    SystemA  systemA = new SystemA();
    SystemB  systemB = new SystemB();
    SystemC  systemC = new SystemC();

    public  void  systemA(){

        systemA.systemA();
    }

    public void systemB(){

        systemB.systemB();
    }


    public void systemC(){

        systemC.systemC();
    }

    private void setSystemA(){

    }
}
