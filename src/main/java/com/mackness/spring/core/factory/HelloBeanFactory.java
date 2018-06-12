package com.mackness.spring.core.factory;

import com.mackness.spring.core.service.SimpleHelloBean;
import com.mackness.spring.core.service.ConfigurableHelloBean;

public class HelloBeanFactory {
    private SimpleHelloBean simpleHelloBean = new SimpleHelloBean();
    private ConfigurableHelloBean configurableHelloBean;

    public SimpleHelloBean getSimpleHelloBean() {
        return simpleHelloBean;
    }

    public ConfigurableHelloBean getConfigurableHelloBean(String message) {
        if(configurableHelloBean == null){
            configurableHelloBean = new ConfigurableHelloBean(message);
        }
        return configurableHelloBean;
    }
}
