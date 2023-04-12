package com.trx.pattern.flyweight.general.gerneraltest;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory{

    private static Map<String,IFllyweight> pool = new HashMap<String,IFllyweight>();

    public static IFllyweight  getIntance(String str){

        if(!pool.containsKey(str)){

            IFllyweight  fllyweight = new ConcreteFlyWeight(str);
            pool.put(str,fllyweight);
        }
        return pool.get(str);
    }
}
