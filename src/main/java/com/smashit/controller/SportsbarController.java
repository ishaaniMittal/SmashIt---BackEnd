package com.smashit.controller;

import com.smashit.dao.SportsbarDao;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.Sport;
import com.smashit.model.SportsBar;

import com.smashit.service.EventSportsbarSportMappingService;
import com.smashit.service.JsonSportsbarService;
import com.smashit.service.SportsbarService;
import com.smashit.translator.SportsbarTranslator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */
@RequestMapping("/sportsbar")
@Controller
public class SportsbarController {


    @Autowired
    private SportsbarService sportsbarService;

    @Autowired
    private JsonSportsbarService jsonSportsbarService;

    @RequestMapping(value = "/findSportsBar/{sbar_id}", produces = "application/json")
    public @ResponseBody
    JsonSportsbar getSportsbarBySportsbarId(@PathVariable("sbar_id")int sportsbarId)
    {
        return sportsbarService.getSportsbarBySportsbarId(sportsbarId);
    }

    @RequestMapping(value = "/findSportsbarByCityId/{city_id}/{curr_date}",produces = "application/json")
    public @ResponseBody
    List<JsonSportsbar> getJsonSportsbarByCityId(@PathVariable("city_id")int cityId,@PathVariable("curr_date")Date currentDate)
    {
        return jsonSportsbarService.getJsonSportsbarByCityId(cityId, currentDate);
    }

    @RequestMapping("/getSportsbarName/{sbar_name}")
    public @ResponseBody String getSportsbarName(@PathVariable("sbar_name") int sportsbarId)
    {
        return sportsbarService.getSportsbarName(sportsbarId);
    }


    @RequestMapping(value = "/getSportsbarImageUrls/{sbar_id}")
    public @ResponseBody List<String> getSportsbarImageUrls(@PathVariable("sbar_id")int sportsbarId)
    {
        return sportsbarService.getSportsbarImageUrls(sportsbarId);
    }

    @RequestMapping(value = "/getSportsbarMenuUrls/{sbar_id}")
    public @ResponseBody List<String> getSportsbarMenuUrls(@PathVariable("sbar_id")int sportsbarId)
    {
        return sportsbarService.getSportsbarMenuUrl(sportsbarId);
    }

}
