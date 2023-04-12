package com.trx.pattern.Adapter.general.classadapter;

public class Test {

    public static void main(String[] args) {
        Target target = new Adapter();
        int result = target.request();
        System.out.println(result);
    }
}
