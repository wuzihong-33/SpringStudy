package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SmtpConfig {
    @Value("${smtp.host}")
    private String host = "hello world";

    @Value("${smtp.port:25}")
    private int port = 10;

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

}
