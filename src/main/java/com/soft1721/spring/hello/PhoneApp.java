package com.soft1721.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneApp {
    public static void main(String[] args) {
//        读入xml文件
        ApplicationContext context=new ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        Phone phone= (com.soft1721.spring.hello.Phone) context.getBean("phone");
//        运行helloworld方法
        System.out.println(phone);
    }
}
