package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.transform.Source;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService order = context.getBean(OrderService.class);
        System.out.println("PaymentService not Started yet ");

        order.PlaceOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
    }
}