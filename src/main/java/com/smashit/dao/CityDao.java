package com.smashit.dao;

import com.smashit.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by Vijay on 24/01/2016.
 */
@Transactional
public interface CityDao extends CrudRepository<City,Integer> {

    public City findByCityName(String cityName);
}
