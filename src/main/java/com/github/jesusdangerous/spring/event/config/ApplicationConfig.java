package com.github.jesusdangerous.spring.event.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Component
@ComponentScan("com.github.jesusdangerous.spring.event")
public class ApplicationConfig {

    @Bean
    public BlockingQueue<String> orderQueue() {
        return new LinkedBlockingQueue<>();
    }

    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();

        SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
        executor.setTaskDecorator(runnable -> {
            System.out.println("Call task from executor");
            return runnable;
        });

        eventMulticaster.setTaskExecutor(executor);
        return eventMulticaster;
    }
}
