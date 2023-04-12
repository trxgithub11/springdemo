package com.trx.pattern.flyweight.general;

public class ConcreteFlyWeight implements IFlyweight{

    private String intrinsicState;
    public ConcreteFlyWeight(String intrinsicState){this.intrinsicState = intrinsicState;}

    public void operation(String extrinsicState) {
        System.out.println("Object address:"+System.identityHashCode(this));
        System.out.println("IntrinsicState:"+this.intrinsicState);
        System.out.println("ExtrinsState:"+extrinsicState);
    }
}
