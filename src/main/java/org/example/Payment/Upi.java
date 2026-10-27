package org.example.Payment;

import org.springframework.stereotype.Component;

@Component
public class Upi implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment Done By UPI Mode");
    }
}
