package com.mackness.spring.core.service;

public class ConfigurableHelloBean implements HelloBean {
    private String message = "ConfigurableHelloBean not instantiated with message";

    public ConfigurableHelloBean(){}

    public ConfigurableHelloBean(String message){
        this.message = message;
    }

    @Override
    public void sayHello(){
        System.out.println("Hello from " + message);
    }
}
