package com.trx.pattern.facade.point;

public class FacadeService {

    private PaymentService  paymentService = new PaymentService();
    private QualifyService  qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

    public void exchange(GiftInfo giftInfo){

        qualifyService.qualifyService(giftInfo);
        paymentService.paymentService(giftInfo);
        shippingService.shippingService(giftInfo);

    }
}
