package com.smashit.controller;

import com.smashit.dao.CityDao;
import com.smashit.model.City;
import com.smashit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/addCity")
    @ResponseBody
    public String addCity(String cityName) {
        return cityService.addCity(cityName);
    }

    @RequestMapping("/findCity")
    public @ResponseBody City getCityById(int cityId)
    {
        return cityService.getCityById(cityId);
    }

    @RequestMapping("/getCities")
    public @ResponseBody
    List<City> getAllCities()
    {
        return cityService.getAllCities();
    }


}
