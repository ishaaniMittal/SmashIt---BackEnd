package com.smashit.controller;

import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.Sport;
import com.smashit.model.SportsBar;

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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */
@RequestMapping("/sportsbar")
@Controller
public class SportsbarController {


    @PersistenceContext
    EntityManager entityManager;

    public Session openSession() {
        return entityManager.unwrap(Session.class);
    }


    @Autowired
    private SportsbarService sportsbarService;

    @RequestMapping(value = "/findSportsBar", produces = "application/json")
    public @ResponseBody
    JsonSportsbar getSportsbarBySportsbarId(int sportsbarId)
    {

        JsonSportsbar sportsBar= sportsbarService.getSportsbarBySportsbarId(sportsbarId);
        System.out.println("CONTROLLER :" + sportsBar);

        return sportsBar;
    }

    @RequestMapping(value = "/findSportsbarByCityId",produces = "application/json")
    public @ResponseBody
    List<JsonSportsbar> getJsonSportsbarByCityId(int cityId)
    {
        Session session=openSession();
        Criteria criteria=session.createCriteria(SportsBar.class);
        Criteria auxCriteria=criteria.createCriteria("sportsbarCity");
        auxCriteria.add(Restrictions.eq("id", cityId));
        return SportsbarTranslator.getJsonSportsbarsByCityId(criteria.list());
    }

}
