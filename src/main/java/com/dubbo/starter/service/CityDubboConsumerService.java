package com.dubbo.starter.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.starter.pojo.City;
import com.dubbo.starter.pojo.User;

@Component
public class CityDubboConsumerService {

	@Reference(check = false)
    CityDubboService cityDubboService;

	@Reference(check = false)
    UserService userService;

    public void printCity() {
        String cityName = "广州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }


    public User saveUser() {
        User user = new User();
        user.setUsername("jaycekon")
                .setPassword("jaycekong824");
        return userService.saveUser(user);
    }
}
