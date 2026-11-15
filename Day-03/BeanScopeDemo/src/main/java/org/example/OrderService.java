package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope("prototype")
public class OrderService {

    public OrderService(){

        System.out.println("OrderService Created");
    }

    public void PlacedOrder(){

        System.out.println("Order has been Placed");
    }
}
