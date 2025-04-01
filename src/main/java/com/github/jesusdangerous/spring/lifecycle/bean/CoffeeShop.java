package com.github.jesusdangerous.spring.lifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Component
public class CoffeeShop { // implements InitializingBean, DisposableBean

    private final ObjectProvider<Coffee> coffeeShopObjectProvider;
    private final Map<String, Ingredient> ingredients;

    public CoffeeShop(ObjectProvider<Coffee> coffeeShopObjectProvider, Map<String, Ingredient> ingredients) {
        this.coffeeShopObjectProvider = coffeeShopObjectProvider;
        this.ingredients = ingredients;
    }

    @PostConstruct
    public void openShop() {
        System.out.println("Shop is opened");
    }

    public void makeCoffee() {
        System.out.println("Making coffee");
    }

    public void makeCoffee(String type) {
        Coffee coffee= coffeeShopObjectProvider.getObject(type);
        System.out.println("Making coffee " + coffee);
    }

    @PreDestroy
    public void closeShop() {
        System.out.println("Shop is closing");
    }

    public void makeCoffee(String type, String ingredient) {
        Coffee coffee = coffeeShopObjectProvider.getObject(type);
        System.out.println("Making coffee with ingredients " + ingredients.get(ingredient) + ". Coffee: " + coffee);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Shop is opened");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Shop is closing");
//    }
}
