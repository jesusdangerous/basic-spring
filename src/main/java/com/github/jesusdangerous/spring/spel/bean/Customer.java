package com.github.jesusdangerous.spring.spel.bean;

import com.github.jesusdangerous.spring.spel.annotation.Sentence;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Sentence(expression = "setStaticGreetingMessage(#bean)")
    private String greeting;

    public void printGreetings() {
        System.out.println("Customer greet: " + greeting);
    }
}
