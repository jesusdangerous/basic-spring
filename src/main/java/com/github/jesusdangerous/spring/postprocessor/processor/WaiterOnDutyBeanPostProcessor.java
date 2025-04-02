package com.github.jesusdangerous.spring.postprocessor.processor;

import com.github.jesusdangerous.spring.postprocessor.bean.Waiter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class WaiterOnDutyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Waiter) {
            ((Waiter) bean).setOnDuty(false);
        }

        return bean;
    }
}
