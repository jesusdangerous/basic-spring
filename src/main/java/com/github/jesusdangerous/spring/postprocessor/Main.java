package com.github.jesusdangerous.spring.postprocessor;

import com.github.jesusdangerous.spring.postprocessor.bean.Restaurant;
import com.github.jesusdangerous.spring.postprocessor.bean.Waiter;
import com.github.jesusdangerous.spring.postprocessor.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Waiter waiter = context.getBean(Waiter.class);
        waiter.takeOrder();

        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.printInfo();
    }
}
