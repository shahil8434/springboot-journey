package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Dictionary;

@Configuration
@ComponentScan
public class AppCofig {

//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public CartService getCartBean(){
//        return new CartService();
//    }
}
