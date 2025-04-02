package com.github.jesusdangerous.spring.aware;

import com.github.jesusdangerous.spring.aware.bean.Menu;
import com.github.jesusdangerous.spring.aware.bean.Waiter;
import com.github.jesusdangerous.spring.aware.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Waiter waiter = context.getBean(Waiter.class);
        waiter.takeOrder("Salad");

        waiter.greedCustomer();

        context.getBean(Menu.class).printMenu();
    }
}
