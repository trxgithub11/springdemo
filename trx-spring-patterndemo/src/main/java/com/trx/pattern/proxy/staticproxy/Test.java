package com.trx.pattern.proxy.staticproxy;

public class Test {

    public static  void main(String args[]){

        ZhangLaoSan  zhangLaoSan  = new ZhangLaoSan(new ZhangSan());

        zhangLaoSan.findLove();
    }
}
