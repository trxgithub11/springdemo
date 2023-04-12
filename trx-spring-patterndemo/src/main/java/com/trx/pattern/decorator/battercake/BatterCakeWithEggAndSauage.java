package com.trx.pattern.decorator.battercake;

public class BatterCakeWithEggAndSauage extends BatterCakeWithEgg{

    public String getMsg(){

        return super.getMsg()+"香肠";
    }

    public int getPrice(){

        return super.getPrice()+2;
    }
}
