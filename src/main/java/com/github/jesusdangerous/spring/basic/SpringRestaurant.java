package com.github.jesusdangerous.spring.basic;

import com.github.jesusdangerous.spring.basic.config.RestaurantConfiguration;
import com.github.jesusdangerous.spring.basic.staff.Barista;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRestaurant {
    public static void main(String[] args) {
        ApplicationContext manager = new AnnotationConfigApplicationContext(RestaurantConfiguration.class);
        Barista barista = manager.getBean("barista", Barista.class);
        barista.makeCoffee();
    }
}
