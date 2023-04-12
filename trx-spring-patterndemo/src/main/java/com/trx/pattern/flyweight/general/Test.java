package com.trx.pattern.flyweight.general;

public class Test {

    public static void main(String args[]) {


        IFlyweight flyweight1 = FlyWeightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = FlyWeightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");

    }
}
