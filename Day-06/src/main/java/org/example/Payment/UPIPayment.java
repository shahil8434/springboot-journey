package org.example.Payment;

import org.springframework.beans.factory.annotation.Autowired;

public class UPIPayment implements PaymentService{

    @Autowired
    public void pay(){
        System.out.println("Paying via UPI");
    }
}
