package com.smashit.service;

import com.smashit.dao.CityDao;
import com.smashit.dao.SportsbarDao;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.City;
import com.smashit.model.SportsBar;
import com.smashit.translator.SportsbarTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Vijay on 24/01/2016.
 */
@Service
public class SportsbarService {

    @Autowired
    private SportsbarDao sportsbarDao;


    public JsonSportsbar getSportsbarBySportsbarId(int sportsbarId)
    {
        //return sportsbarDao.findOne(sportsbarId);
        SportsBar sportsBar= sportsbarDao.getSportsbarById(sportsbarId);

        //System.out.println(sportsBar);
        return SportsbarTranslator.getJsonSportsbarByCity(sportsBar,sportsBar.getSportsbarCity());
    }
}
