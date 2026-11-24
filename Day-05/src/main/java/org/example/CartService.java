package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.HashMap;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware /*implements InitializingBean*, DisposableBean */ {

    Map<Integer, String> mp;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("Cart Service Constructor Called");
    }

    @Override
    public void setBeanName(String name){
        System.out.println("Bean Name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        System.out.println("Application Context Name is "+ applicationContext);
    }

    @PostConstruct
    public void start2(){

        System.out.println("Bean is Ready");
        mp.put(1, "Shahil");
        mp.put(2, "Neeraj");
        mp.put(3, "Jyoti");
    }


    public void addToCart(){

        System.out.println("Added to Cart");
    }
    public String getValue(int key){
        return mp.get(key);
    }

    @PreDestroy
    public void stop(){
        mp.clear();
        System.out.println("Bean is getting Destroyed");
    }

//    @Override
//    public void destroy() throws Exception{
//        mp.clear();
//        System.out.println("Bean is getting Destroyed");
//    }

//    public void stop(){
//        mp.clear();
//        System.out.println("Bean is getting Destroyed");
//    }

    //    @Override
//    public void afterPropertiesSet()
//            throws Exception{

//        System.out.println("Initilization Callback");
//        mp.put(1, "Shahil");
//        mp.put(2, "Neeraj");
//        mp.put(3, "Jyoti");
//    }

//    public void start(){
//
//        System.out.println("Bean is Ready");
//        mp.put(1, "Shahil");
//        mp.put(2, "Neeraj");
//        mp.put(3, "Jyoti");
//    }

}
