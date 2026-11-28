package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

//        OrederService orederService = (OrederService) context.getBean("OrderService", OrederService.class);
//
//        orederService.Order();

        UsreService user = context.getBean(UsreService.class);
//        System.out.println(user.getUserData());

        context.close();
    }
}