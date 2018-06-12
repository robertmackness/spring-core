package com.mackness.spring.core;


import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mackness.spring.core.configuration.CoreConfiguration;
import com.mackness.spring.core.service.HelloBean;

public class ApplicationLoader {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(CoreConfiguration.class);

        Map<String, HelloBean> beans = context.getBeansOfType(HelloBean.class);

        for(HelloBean helloBean : beans.values() ){
            helloBean.sayHello();
        }

    }

}
