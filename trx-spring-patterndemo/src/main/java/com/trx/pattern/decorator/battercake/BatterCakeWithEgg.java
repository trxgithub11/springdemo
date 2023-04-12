package com.trx.pattern.decorator.battercake;

public class BatterCakeWithEgg extends  BatterCake{


    public String getMsg(){

        return super.getMsg()+"鸡蛋";
    }

    public int getPrice(){

        return super.getPrice()+1;
    }
}
