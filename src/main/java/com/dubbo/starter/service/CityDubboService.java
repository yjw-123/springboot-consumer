package com.dubbo.starter.service;

import com.dubbo.starter.pojo.City;

public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
