package com.trx.pattern.flyweight.general.gerneraltest;

public class ConcreteFlyWeight implements IFllyweight{

    private String str;

    public ConcreteFlyWeight(String str) {
        this.str = str;
    }

    public void operation(String operstr) {
        System.out.println("str="+str);
        System.out.println("str="+str.hashCode());
        System.out.println("operstr="+operstr);

        System.out.println("operstr="+operstr.hashCode());
    }
}
