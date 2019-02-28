package com.spring.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 采用注解和Lombok开发的phone
 */
@Component
@Data
public class Phone {
    @Value("iphoneX")
    private String brand;

    @Value("6666.6")
    private double price;
}
