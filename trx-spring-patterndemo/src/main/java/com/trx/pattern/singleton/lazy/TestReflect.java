package com.trx.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

public class TestReflect {

    public static void main(String args[]){
        try{

//            Class<?> clazz =  Class.forName("com.trx.example.singleton.lazy.LazyStaticInnerClassSingleton");
            Class<?> clazz =  LazyStaticInnerClassSingleton.class;

            Constructor c= clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1==o2);

        }catch(Exception e){

            e.printStackTrace();
        }

    }
}
