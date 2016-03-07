package com.smashit.service;

import com.smashit.dao.EventDao;
import com.smashit.jsonPojo.JsonEvent;
import com.smashit.model.Event;
import com.smashit.model.Offer;
import com.smashit.translator.EventTranslator;
import com.smashit.util.ImageUrlFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
