package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Validators {
    @Autowired
    List<Validator> validators;

    public Validators() {
    }

    public void traverseAll() {
        if (validators.size() != 0) {
            for (Validator validator : validators) {
                validator.validator();
            }
        }else {
            System.out.println("validators is empty");
        }
    }
}
