package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ManValidator implements Validator {
    private String name = "man";

    public String getName() {
        return name;
    }

    public ManValidator() {
    }

    @Value("#{smtpConfig.host}")
    private String smtpHost;


    public String getSmtpHost() {
        return smtpHost;
    }

    @Override
    public void validator() {
        System.out.println(this.getName());
    }
}
