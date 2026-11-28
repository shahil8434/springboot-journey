package org.example;

import org.example.Payment.PaymentService;

public class OrederService {

    private PaymentService paymentService;

    public OrederService(PaymentService paymentService){
        this.paymentService = paymentService;
    }


//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void Order(){

        paymentService.pay();
        System.out.println("Order has been Delevired");
    }
}
