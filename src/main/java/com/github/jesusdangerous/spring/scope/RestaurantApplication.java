package com.github.jesusdangerous.spring.scope;

import com.github.jesusdangerous.spring.scope.bean.OrderProcessor;
import com.github.jesusdangerous.spring.scope.config.RestaurantConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RestaurantApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RestaurantConfig.class);

        OrderProcessor orderProcessor = context.getBean(OrderProcessor.class);
        orderProcessor.processOrder("Coffee", 9);
    }
}
