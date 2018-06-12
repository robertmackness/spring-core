package com.mackness.spring.core.service;

public class SimpleHelloBean implements HelloBean {
    @Override
    public void sayHello(){ System.out.println("Hello from " + getClass().getSimpleName());}

}
