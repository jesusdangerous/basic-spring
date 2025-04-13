package com.github.jesusdangerous.spring.event.bean;

import com.github.jesusdangerous.spring.event.events.OrderEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {


    private final ApplicationEventPublisher eventPublisher;

    public Restaurant(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void placeOrder(String orderDetails) {
        eventPublisher.publishEvent(new OrderEvent(this, orderDetails));
    }
}
