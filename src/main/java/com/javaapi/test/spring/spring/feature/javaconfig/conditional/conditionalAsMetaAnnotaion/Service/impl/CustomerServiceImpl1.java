package com.javaapi.test.spring.spring.feature.javaconfig.conditional.conditionalAsMetaAnnotaion.Service.impl;

import com.javaapi.test.spring.spring.feature.javaconfig.conditional.conditionalAsMetaAnnotaion.Service.CustomerService;

/**
 * Created by user on 16/6/5.
 */
public class CustomerServiceImpl1 implements CustomerService {
    @Override
    public void print() {
        System.out.println("1 = " + 1);
    }
}
