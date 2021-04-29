package com.dubbo.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.starter.service.CityDubboConsumerService;

@RestController
public class UserController {

    @Autowired
    private CityDubboConsumerService service;


    @RequestMapping("/save")
    public Object saveUser() {

        return service.saveUser();
    }
}