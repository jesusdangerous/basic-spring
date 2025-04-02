package com.github.jesusdangerous.spring.aware.config;

import com.github.jesusdangerous.spring.aware.bean.Chef;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.jesusdangerous.spring.aware")
public class ApplicationConfiguration {

    @Bean
    public Chef restaurantChef() {
        return new Chef();
    }
}
