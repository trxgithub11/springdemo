package com.trx.pattern.singleton.hungry;

public class TestStatic {

    private static String ss ="11";
    private static  final  TestStatic  testStatic;
    static{
        testStatic = new TestStatic();
        System.out.println("静态块");
        System.out.println(ss);



    }

    private TestStatic(){

        System.out.println("构造方法初始化");
    }

    public static void main(String args[]){

        System.out.println("main");
        new TestStatic();
    }
}

