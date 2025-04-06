package com.github.jesusdangerous.spring.spel.bean;

import com.github.jesusdangerous.spring.spel.annotation.Sentence;
import org.springframework.stereotype.Component;

@Component
public class Waiter {

    @Sentence(expression = "setGreetingMessage(#bean)")
    //@Sentence(expression = "#root.setGreetingMessage(#bean)")
    private String greeting;

    public void printGreetings() {
        System.out.println("Waiter greet: " + greeting);
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
