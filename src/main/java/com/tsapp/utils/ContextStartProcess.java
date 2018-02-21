package com.tsapp.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextStartProcess {

    @EventListener(classes = {ContextStartedEvent.class, ContextRefreshedEvent.class})
    void f() {
        System.out.println("application context started");
    }


}
