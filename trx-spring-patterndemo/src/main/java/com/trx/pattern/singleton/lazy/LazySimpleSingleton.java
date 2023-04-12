package com.trx.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    private synchronized static LazySimpleSingleton getInstance(){

        if(instance==null) {
            instance = new LazySimpleSingleton();
        }
        return  instance;
    }
    ;

}
