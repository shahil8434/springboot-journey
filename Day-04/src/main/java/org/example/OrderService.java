package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService){

        this.paymentService = paymentService;

        System.out.println("OrderService Created");
    }

    public void PlaceOrder(){

        paymentService.pay();
        System.out.println("Order Placed");
    }
}
