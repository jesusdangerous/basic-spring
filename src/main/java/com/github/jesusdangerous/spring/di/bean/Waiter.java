package com.github.jesusdangerous.spring.di.bean;

import org.springframework.stereotype.Component;


public class Waiter {

    private final Kitchen kitchen;

    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void takeOrder(String order) {
        System.out.println("Waiter takes order " + order);
        kitchen.cook(order);
    }
}
