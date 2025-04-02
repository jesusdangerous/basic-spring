package com.github.jesusdangerous.spring.aware.bean;

import org.springframework.beans.factory.BeanNameAware;

public class Chef implements BeanNameAware {

    private String chefName;

    public void cook(String dish) {
        System.out.println("Cooking " + dish + ". Name is " + chefName);
    }

    @Override
    public void setBeanName(String name) {
        chefName = name;
    }
}
