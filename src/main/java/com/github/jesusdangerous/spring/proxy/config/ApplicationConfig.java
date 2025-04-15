package com.github.jesusdangerous.spring.proxy.config;

import com.github.jesusdangerous.spring.proxy.bean.Customer;
import com.github.jesusdangerous.spring.proxy.bean.IWaiter;
import com.github.jesusdangerous.spring.proxy.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.jesusdangerous.spring.proxy")
public class ApplicationConfig {

    @Bean
    public IWaiter john() {
        return new Waiter("John");
    }

    @Bean
    public Customer andrew() {
        return new Customer("Andrew");
    }

    @Bean
    public Customer julia() {
        return new Customer("Julia");
    }

    @Bean
    public Customer nina() {
        return new Customer("Nina");
    }
}
