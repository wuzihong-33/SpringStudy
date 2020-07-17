package com.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UserValidator implements Validator{
    private String name = "user";

    public String getName() {
        return name;
    }

    public UserValidator() {
    }

    @Override
    public void validator() {
        System.out.println(this.getName());
    }
}
