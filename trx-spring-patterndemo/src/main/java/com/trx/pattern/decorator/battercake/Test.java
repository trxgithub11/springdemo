package com.trx.pattern.decorator.battercake;


public class Test {


    public static void main(String args[]){

        BatterCake battercake = new BatterCake();
        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());

        BatterCakeWithEgg battercakeWithEgg = new BatterCakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价：" + battercakeWithEgg.getPrice());

        BatterCakeWithEggAndSauage battercakeWithEggAndSauage = new BatterCakeWithEggAndSauage();
        System.out.println(battercakeWithEggAndSauage.getMsg() + ",总价：" + battercakeWithEggAndSauage.getPrice());
    }

}

