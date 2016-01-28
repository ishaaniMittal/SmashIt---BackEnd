package com.smashit.dao;

import com.smashit.model.SportsBar;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Vijay on 24/01/2016.
 */
public interface SportsbarDao extends CrudRepository<SportsBar,Integer> {

    public SportsBar getSportsbarById(int sportsBarId);
}
