package org.example;

import org.example.Payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

     private Payment payment;

//   @Autowired
    public OrderService(Payment payment){

        this.payment = payment;
    }


    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void placeOrder(){

        payment.pay();
        System.out.println("Order has been Placed");

    }
}
