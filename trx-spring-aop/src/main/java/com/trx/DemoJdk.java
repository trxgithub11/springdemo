package com.trx;

import com.trx.dao.AopDao;
import com.trx.dao.impl.AopDaoImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoJdk {

    public static void main(String[] args) {

        AopDaoImp aopDaoImp = new AopDaoImp();
        ClassLoader cl = DemoJdk.class.getClassLoader();
        Class<?>[] interfaces = AopDaoImp.class.getInterfaces();
         AopDao aopDao = (AopDao) Proxy.newProxyInstance(cl, interfaces, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//                if(method.getName().equals("getAnswer")){
                    System.out.println("增强");
//                }
                Object ret = method.invoke(aopDaoImp, args);
                System.out.println(ret);
                return ret;
            }
        });

        String answer = aopDao.getAnswer("三连了吗？");

//        System.out.println(aopDao.fortuneTelling("张三"));
    }
}
