package com.github.jesusdangerous.spring.lifecycle.config;

import com.github.jesusdangerous.spring.lifecycle.bean.CoffeeShop;
import com.github.jesusdangerous.spring.lifecycle.bean.IngredientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.jesusdangerous.spring.lifecycle")
public class LifecycleConfiguration {

//    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
//    public CoffeeShop coffeeShop() {
//        return new CoffeeShop();
//    }

    @Bean
    public IngredientFactoryBean sugar() {
        return new IngredientFactoryBean("sugar");
    }

    @Bean
    public IngredientFactoryBean milk() {
        return new IngredientFactoryBean("milk");
    }
}
