package com.github.jesusdangerous.spring.lifecycle;

import com.github.jesusdangerous.spring.lifecycle.bean.CoffeeShop;
import com.github.jesusdangerous.spring.lifecycle.config.LifecycleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
        CoffeeShop coffeeShop = context.getBean(CoffeeShop.class);
        // coffeeShop.makeCoffee();
//        coffeeShop.makeCoffee("Latte");

        coffeeShop.makeCoffee("Latte", "sugar");
        coffeeShop.makeCoffee("Latte", "milk");

        context.close();
    }
}
