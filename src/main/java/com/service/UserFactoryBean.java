package com.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class UserFactoryBean implements FactoryBean {
    @Override
    public User getObject() throws Exception {
        return new User(11);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
