package com.github.jesusdangerous.spring.spel;

import com.github.jesusdangerous.spring.spel.bean.*;
import com.github.jesusdangerous.spring.spel.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        SimpleSpelExamples simpleSpelExamples = context.getBean(SimpleSpelExamples.class);
        simpleSpelExamples.simpleEval();

        Shop shop = context.getBean(Shop.class);
        shop.printAllProducts();
        System.out.println("-----------------------");
        shop.printSuitableProducts();
        System.out.println("-----------------------");
        shop.printEndingProducts();
        System.out.println("-----------------------");
        shop.printVegetablesInfo();
        System.out.println("-----------------------");
        shop.printOpenTime();

        simpleSpelExamples.simpleEvaluateContextExample();

        Waiter waiter = context.getBean(Waiter.class);
        Customer customer = context.getBean(Customer.class);
        waiter.printGreetings();
        customer.printGreetings();
        System.out.println("------------------------");

        BeanExpressionParser parser = context.getBean(BeanExpressionParser.class);
        System.out.println("Evaluate open time: " + parser.evaluate("shop.getOpenTime()", LocalTime.class));
        System.out.println("Valuate customer: " + parser.evaluate("customer.getGreeting()", String.class));
        System.out.println("Evaluate waiter greeting: " + parser.evaluate("waiter.getGreeting()", String.class));
    }
}
