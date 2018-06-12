package com.mackness.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mackness.spring.core.factory.HelloBeanFactory;
import com.mackness.spring.core.service.ConfigurableHelloBean;
import com.mackness.spring.core.service.SimpleHelloBean;

@Configuration
@ComponentScan("com.mackness.spring.core")
public class CoreConfiguration {
    private HelloBeanFactory helloBeanFactory = new HelloBeanFactory();

    @Bean
    public SimpleHelloBean getSimpleHelloBean() {
        return helloBeanFactory.getSimpleHelloBean();
    }

    @Bean
    public ConfigurableHelloBean getConfigurableHelloBean(){
        return helloBeanFactory.getConfigurableHelloBean("configured bean");
    }

}
