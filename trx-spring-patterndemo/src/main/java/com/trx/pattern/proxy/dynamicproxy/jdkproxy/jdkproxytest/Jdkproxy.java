package com.trx.pattern.proxy.dynamicproxy.jdkproxy.jdkproxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Jdkproxy implements InvocationHandler {


    private IPerson  target;
    public Jdkproxy(IPerson  target) {

        this.target = target;
    }

    public IPerson getInstance(){


        return (IPerson)Proxy.newProxyInstance(this.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        method.invoke(this.target,args);
        after();
        return method.invoke(this.target,args);
    }

    private void before(){

        System.out.println("========��ʼ=======");
    }

    private void after(){

        System.out.println("========����=======");
    }
}
