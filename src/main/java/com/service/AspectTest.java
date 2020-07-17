package com.service;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {
    @Before("execution(public * com.service.UserService.*(..))")
    public void aspectSay() {
        System.out.println("i'm aspect");
    }

}
