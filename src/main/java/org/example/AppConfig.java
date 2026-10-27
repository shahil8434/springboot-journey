package org.example;

import org.example.Payment.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Shahil", 22);
    }

    @Bean
    @Primary
    public Payment payByCash() {
        return new CashPayment();
    }

    @Bean
    public Payment payByCard() {
        return new CardPayment();
    }

    @Bean
    public Payment upiByCard() {
        return new Upi();
    }


    @Bean
    public OrderService createOrderService(Payment payment) {
        return new OrderService(payment);
    }
}