package com.smashit.service;

import com.smashit.dao.CityDao;
import com.smashit.dao.EventSportsbarSportMappingDao;
import com.smashit.dao.SportsbarDao;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.*;
import com.smashit.translator.SportsbarTranslator;
import com.smashit.util.ImageUrlFactory;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */
@Service
public class SportsbarService {

    @Autowired
    private SportsbarDao sportsbarDao;


    public JsonSportsbar getSportsbarBySportsbarId(int sportsbarId) {
        SportsBar sbar = sportsbarDao.getSportsbarById(sportsbarId);
        JsonSportsbar sportsBar = SportsbarTranslator.getJsonSportsbarByCity(sbar, sbar.getSportsbarCity());
        return sportsBar;
    }
/*
    public List<JsonSportsbar> getJsonSportsbarsByCityId(int cityId)
    {
        List<SportsBar> sportsBars=sportsbarDao.getSportsbarsByCityId(cityId);
        List<JsonSportsbar> jsonSportsbars=SportsbarTranslator.getJsonSportsbarsByCityId(sportsBars);
        return  jsonSportsbars;
    }*/

    public List<SportsBar> getSportsbarsByCityId(int cityId)
    {
        return sportsbarDao.getSportsbarsByCityId(cityId);
    }


    public List<String> getSportsbarImageUrls(int sportsbarId)
    {
        List<SportsbarImages> sportsbarImages=sportsbarDao.getSportsbarImageUrls(sportsbarId);
        List<String> sportsbarImageUrls=new ArrayList<>();
        for(SportsbarImages imgs: sportsbarImages)
        {
            int imgNo=imgs.getTotalImages();
            for(int i=1;i<=imgNo;i++)
            {
                sportsbarImageUrls.add(ImageUrlFactory.getSportsbarImageUrl(getSportsbarName(sportsbarId),"HIGH",i));
            }
        }
        return sportsbarImageUrls;
    }

    public List<String> getSportsbarMenuUrl(int sportsbarId)
    {
        List<Menu> menus=sportsbarDao.getSportsbarMenu(sportsbarId);
        List<String> sportsbarMenuUrls=new ArrayList<>();
        for(Menu menu:menus)
        {
            int imgNo=menu.getTotalPages();
            for(int i=1;i<=imgNo;i++)
            {
                sportsbarMenuUrls.add(ImageUrlFactory.getSportsbarMenuUrl(getSportsbarName(sportsbarId),"HIGH",i));
            }
        }
        return sportsbarMenuUrls;
    }


    public String getSportsbarName(int sportsbarId)
    {
        return sportsbarDao.getSportsbarName(sportsbarId);
    }


}






