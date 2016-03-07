package com.smashit.dao;

import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.City;
import com.smashit.model.Menu;
import com.smashit.model.SportsBar;
import com.smashit.model.SportsbarImages;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.NamedNativeQueries;
import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by Vijay on 24/01/2016.
 */

@Transactional
public interface SportsbarDao extends CrudRepository<SportsBar,Integer>{

    public SportsBar getSportsbarById(int sportsBarId);

    @Query("select s from SportsBar s where sportsbarCity.id = :cityId")
    public List<SportsBar> getSportsbarsByCityId(@Param("cityId")int cityId);


    @Query("select s.sportsbarImages from SportsBar s where s.id=?1")
    public List<SportsbarImages> getSportsbarImageUrls(int sportsbarId);

    @Query("select s.sportsbarName from SportsBar s where s.id=?1")
    public String getSportsbarName(int sportsbarId);

    @Query("select s.menus from SportsBar s where s.id=?1")
    public List<Menu> getSportsbarMenu(int sportsbarId);
}
