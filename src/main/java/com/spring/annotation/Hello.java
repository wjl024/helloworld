package com.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * 采用注解开发的bean
 * @component用于类级别注解,标注类为一个可被spring容器配置的bean
 */
@Component
public class Hello {
    public String getHello(){
        return "Hello World";
    }
}
