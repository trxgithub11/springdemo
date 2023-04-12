package com.trx.pattern.singleton.lazy;

public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){

        if(LazyHolder.instance!=null){

            throw new RuntimeException("不允许非法访问");
        }
    }

    private  static LazyStaticInnerClassSingleton  getInstance(){


        return LazyHolder.instance;
    }
    private static class LazyHolder {


        private static final LazyStaticInnerClassSingleton instance = new LazyStaticInnerClassSingleton();
    }
}

