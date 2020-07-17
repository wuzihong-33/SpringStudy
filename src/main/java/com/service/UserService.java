package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.time.ZoneId;

@Component
@PropertySource("app.properties")
public class UserService {
    @Autowired()
    MailService mailService;
//    @Value("src/main/resources/login.txt")
//    private Resource resource;


    private int record;
//    String loginTxt;

    public UserService() {
        System.out.println("construct initial");
    }

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }
    public boolean login(String user,String password) {
        return mailService.login(user,password);
    }

    public int getRecord() {
        return record;
    }

    @Value("${app.zone:Z}")
    String zoneId;
    @Bean
    public ZoneId createZoneId() {
        return ZoneId.of(zoneId);
    }

    public void sayYes() {
        System.out.println("UserService yes");
    }


}
