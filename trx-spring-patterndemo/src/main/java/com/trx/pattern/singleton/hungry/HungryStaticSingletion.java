package com.trx.pattern.singleton.hungry;

public class HungryStaticSingletion {
    private static final HungryStaticSingletion hungryStaticSingleton;

    static{

        hungryStaticSingleton = new HungryStaticSingletion();

    }

    private HungryStaticSingletion(){

    }

    public static HungryStaticSingletion  getInstance(){

        return hungryStaticSingleton;
    }

}
