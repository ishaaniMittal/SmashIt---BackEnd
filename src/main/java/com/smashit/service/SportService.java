package com.smashit.service;

import com.smashit.dao.SportDao;
import com.smashit.model.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */

@Service
public class SportService {

    @Autowired
    private SportDao sportDao;

    public String addSport(String sportName)
    {
        Sport sport=new Sport(sportName);

        try {
            sportDao.save(sport);
        }catch (Exception e)
        {
            return "Could not add sport in the database\n"+e.toString();
        }
        return "Successfully added "+sportName+" in the database";
    }

    public Sport getSportById(int sportId)
    {
        return sportDao.findOne(sportId);
    }

    public List<Sport> getAllSports()
    {
        return (List<Sport>) sportDao.findAll();
    }

}
