package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cp")
public class CardPayment implements Payment{

    @Override
    public void pay(){
        System.out.println("Payment Done By Card Mode");
    }
}
