package com.spring.annotation;
/**
 * 用于寻找@component注解标注bean
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class HelloApp {
    public static void main(String[] args) {
        //通过注解创建上下文对象
        ApplicationContext context=new AnnotationConfigApplicationContext(HelloApp.class);
        //2.读取bean
        Hello hello=context.getBean(Hello.class);
        //3.运行
        System.out.println(hello.getHello());
    }
}
