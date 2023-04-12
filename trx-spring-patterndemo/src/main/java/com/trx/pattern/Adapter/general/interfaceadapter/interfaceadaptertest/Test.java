package com.trx.pattern.Adapter.general.interfaceadapter.interfaceadaptertest;

public class Test {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee()){

            @Override
            public int request1() {

                return adaptee.get()/10;
            }
        };

        int result = adapter.request1();
        System.out.println(result);
    }
}
