package com.trx.pattern.proxy.dynamicproxy.cglibproxy.cglibproxttest;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibProxy implements MethodInterceptor {



    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {




        before();
        methodProxy.invokeSuper(o,objects);
        after();

        return null;
    }


    private void before() {
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("OK的话，准备办事");
    }
}
