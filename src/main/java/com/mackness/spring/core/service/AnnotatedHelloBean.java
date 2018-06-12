package com.mackness.spring.core.service;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedHelloBean implements HelloBean {
    public AnnotatedHelloBean(){}

    @Override
    public void sayHello() {
        System.out.println("Hello from AnnotatedBean");
    }
}
