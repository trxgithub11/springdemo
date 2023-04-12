package com.trx.pattern.proxy.staticproxy;


public class ZhangLaoSan  implements  IPerson{

    private ZhangSan zhangsan;

    public ZhangLaoSan(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public void findLove() {
        System.out.println("张老三开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }
}
