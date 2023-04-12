package com.trx.pattern.proxy.dynamicproxy.jdkproxy.jdkproxytest;

public class TestJdkProxydemo {

    public static void  main(String args[]){

        Jdkproxy  jdkproxy  = new Jdkproxy(new ZhangSan());
//        Jdkproxy jdkproxy  = new Jdkproxy(new ZhaoLiu());
        IPerson  person =  jdkproxy.getInstance();
        person.add();
    }
}
