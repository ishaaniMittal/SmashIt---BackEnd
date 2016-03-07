package com.smashit.service;

import com.smashit.dao.EventCityMappingDao;
import com.smashit.jsonPojo.JsonEvent;
import com.smashit.model.Event;
import com.smashit.model.EventStats;
import com.smashit.translator.EventTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 05/03/2016.
 */
@Service
public class EventCityMappingService {

    @Autowired
    private EventCityMappingDao eventCityMappingDao;

    public List<JsonEvent> getEventsByCity(int cityId,Date currentDate,String density)
    {
        List<Event> events=eventCityMappingDao.getEventsByCity(cityId,currentDate);
        List<JsonEvent> jsonEvents= EventTranslator.getJsonEvents(events,density);
        return jsonEvents;
    }

    public EventStats getEventStats(int eventId,String density)
    {
        Event event= eventCityMappingDao.getEvent(eventId);
        return EventTranslator.getEventStats(event,density);
    }

}
