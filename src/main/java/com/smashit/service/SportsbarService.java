package com.smashit.service;

import com.smashit.dao.CityDao;
import com.smashit.dao.SportsbarDao;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.City;
import com.smashit.model.SportsBar;
import com.smashit.translator.SportsbarTranslator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Query;
import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */
@Service
public class SportsbarService {

    @Autowired
    private SportsbarDao sportsbarDaoImpl;

    public JsonSportsbar getSportsbarBySportsbarId(int sportsbarId) {
        SportsBar sbar = sportsbarDaoImpl.getSportsbarById(sportsbarId);
        JsonSportsbar sportsBar = SportsbarTranslator.getJsonSportsbarByCity(sbar, sbar.getSportsbarCity());
        return sportsBar;
    }

    public List<JsonSportsbar> getJsonSportsbarByCityId(int cityId)
    {
        List<SportsBar> sportsBars=sportsbarDaoImpl.getJsonSportsbarByCityId(cityId);
        List<JsonSportsbar> jsonSportsbars=SportsbarTranslator.getJsonSportsbarsByCityId(sportsBars);
        return  jsonSportsbars;
    }

}






