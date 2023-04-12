package com.trx.pattern.flyweight.general;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static Map<String, IFlyweight> pool = new HashMap<String, IFlyweight>();

    public static IFlyweight getFlyweight(String intrinsicState) {

        if (!pool.containsKey(intrinsicState)) {

            IFlyweight flyweight = new ConcreteFlyWeight(intrinsicState);
            pool.put(intrinsicState,flyweight);
        }
        return pool.get(intrinsicState);
    }

}
