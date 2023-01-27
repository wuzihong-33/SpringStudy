package com.I.service.controller;


import com.I.service.entity.IPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestApi {
    private static final Logger logger = LoggerFactory.getLogger(TestApi.class);
    
//    public String name = "testApi";
//    @Autowired
//    public IPojo iPojo;

    
    
    public static void main(String[] args) {
        logger.debug("hello");
        logger.trace("hello");
        logger.error("hello");
        logger.warn("hello");

    }
    
    
}
