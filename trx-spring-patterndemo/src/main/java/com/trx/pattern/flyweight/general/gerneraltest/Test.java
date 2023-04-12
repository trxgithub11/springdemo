package com.trx.pattern.flyweight.general.gerneraltest;

public class Test {

    public static void main(String args[]){

        IFllyweight   fllyweight1 = FlyWeightFactory.getIntance("aa");
        IFllyweight   fllyweight2 = FlyWeightFactory.getIntance("bb");
        IFllyweight   fllyweight3 = FlyWeightFactory.getIntance("cc");

        fllyweight1.operation("a");
        fllyweight2.operation("b");
        fllyweight3.operation("c");
        fllyweight3.operation("d");

    }
}
