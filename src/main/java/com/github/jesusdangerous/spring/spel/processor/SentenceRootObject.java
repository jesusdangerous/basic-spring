package com.github.jesusdangerous.spring.spel.processor;

import com.github.jesusdangerous.spring.spel.bean.Customer;
import com.github.jesusdangerous.spring.spel.bean.Waiter;

import java.util.HashMap;
import java.util.Map;

public class SentenceRootObject {

    private static final Map<Class<?>, String> GREETING_MASSAGES = new HashMap<>();

    static {
        GREETING_MASSAGES.put(Waiter.class, "Hello! I'm your waiter today!");
        GREETING_MASSAGES.put(Customer.class, "Hello! Can I place an order?");
    }

    public void setGreetingMessage(Object bean) {
        setMessageFor(bean);
    }

    public static void setStaticGreetingMessage(Object bean) {
        setMessageFor(bean);
    }

    private static void setMessageFor(Object bean) {
        if (!GREETING_MASSAGES.containsKey(bean.getClass())) {
            return;
        }

        if (Waiter.class.equals(bean.getClass())) {
            ((Waiter) bean).setGreeting(GREETING_MASSAGES.get(bean.getClass()));
        } else {
            ((Customer) bean).setGreeting(GREETING_MASSAGES.get(bean.getClass()));
        }
    }
}
