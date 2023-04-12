package com.trx;

import com.trx.dao.impl.AopDaoImp;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDemo {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(AopDaoImp.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("被增强了");
                Object ret = methodProxy.invokeSuper(o,objects);
                return ret;
            }
        });
        AopDaoImp  proxy = (AopDaoImp) enhancer.create();

        System.out.println(proxy.getAnswer("您好吗"));
    }
}
