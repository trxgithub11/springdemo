package com.trx.pattern.proxy.dynamicproxy.jdkproxy;

public class Test {
    public static void main(String[] args) {
        JdkMeiPo jdkMeipo = new JdkMeiPo();
        IPerson zhangsan = jdkMeipo.getInstance(new ZhangSan());
        zhangsan.findLove();


        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();

    }
}
