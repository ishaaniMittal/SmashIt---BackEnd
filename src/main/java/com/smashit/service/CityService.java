package com.smashit.service;

import com.smashit.dao.CityDao;
import com.smashit.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

/**
 * Created by Vijay on 24/01/2016.
 */
@Service
public class CityService {


    @Autowired
    private CityDao cityDao;

    public String addCity(String cityName)
    {
        City city=new City(cityName);
        try {
            cityDao.save(city);
        }catch (Exception e)
        {
            return "Could not add city in the database\n."+e.toString();

        }
        return "Successfully added "+city.getCityName()+" in the database.";
    }

}
