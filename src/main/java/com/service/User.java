package com.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }
    public void sayHello(){
        System.out.println("hello");
    }
}
