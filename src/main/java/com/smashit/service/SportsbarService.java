package com.smashit.service;

import com.smashit.dao.SportsbarDao;
import com.smashit.model.SportsBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vijay on 24/01/2016.
 */
@Service
public class SportsbarService {

    @Autowired
    private SportsbarDao sportsbarDao;

    public SportsBar getSportsbarBySportsbarId(int sportsbarId)
    {
        return sportsbarDao.findOne(sportsbarId);
    }
}
