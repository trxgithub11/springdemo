package com.trx.pattern.proxy.dynamicproxy.cglibproxy;

public class CglibTest {

    public static void main(String args[]) {

        Customer obj = (Customer) new CGlibMeiPo().getInstance(Customer.class);
        System.out.println(obj);
        obj.findAll();
    }
}
