package com.smashit.dao;

import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.City;
import com.smashit.model.SportsBar;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Created by Vijay on 24/01/2016.
 */
public interface SportsbarDao extends CrudRepository<SportsBar,Integer> {

    public SportsBar getSportsbarById(int sportsBarId);

}
