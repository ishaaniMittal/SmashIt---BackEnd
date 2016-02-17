package com.smashit.service;

import com.smashit.dao.EventSportsbarSportMappingDao;
import com.smashit.model.EventSportsbarSportMapping;
import com.smashit.model.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 15/02/2016.
 */
@Service
public class EventSportsbarSportMappingService {

    @Autowired
    private EventSportsbarSportMappingDao eventSportsbarSportMappingDao;

    public List<Sport> getEventSportBySportsbarId(int sportsbarId, Date currentDate)
    {
        return eventSportsbarSportMappingDao.getEventSportBySportsbarId(sportsbarId, currentDate);
    }

    public EventSportsbarSportMapping getESSMappingById(int id)
    {
        return eventSportsbarSportMappingDao.findOne(id);
    }
}
