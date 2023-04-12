package com.trx.pattern.facade.point;

public class Test {

    public static void main(String args[]){

        GiftInfo  giftInfo = new GiftInfo("笔记本电脑");
        FacadeService  facadeService = new FacadeService();
        facadeService.exchange(giftInfo);
    }
}
