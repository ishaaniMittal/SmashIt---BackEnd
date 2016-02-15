package com.smashit.service;

import com.smashit.dao.EventDao;
import com.smashit.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vijay on 15/02/2016.
 */
@Service
public class EventService {

    @Autowired
    private EventDao eventDao;


    public Event getEventById(int eventId)
    {
        return eventDao.findOne(eventId);
    }
}
