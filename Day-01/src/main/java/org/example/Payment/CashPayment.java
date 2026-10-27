package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;

//@Component
//@Primary
@Qualifier("cp")
public class CashPayment implements Payment{
    @Override

    public void pay(){

        System.out.println("Payment Done By Cash Mode");
    }
}
