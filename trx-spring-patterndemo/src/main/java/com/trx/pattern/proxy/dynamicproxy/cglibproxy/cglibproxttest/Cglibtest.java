package com.trx.pattern.proxy.dynamicproxy.cglibproxy.cglibproxttest;

import net.sf.cglib.proxy.Enhancer;

public class Cglibtest {

    public static void main(String args[]){
//       Customer customer= new Customer();
//        CGlibProxy  cGlibProxy = new CGlibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Customer.class);
        enhancer.setCallback(new CGlibProxy());
        Object o =  enhancer.create();

        ((Customer)o).add();

    }
}
