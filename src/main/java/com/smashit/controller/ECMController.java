package com.smashit.controller;

import com.smashit.jsonPojo.JsonEvent;
import com.smashit.model.EventStats;
import com.smashit.service.EventCityMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 05/03/2016.
 */
@Controller
@RequestMapping("/ecm")
public class ECMController {

    @Autowired
    private EventCityMappingService eventCityMappingService;

    @RequestMapping("/events/{city_id}/{curr_date}/{density}")
    public @ResponseBody List<JsonEvent> getEventsByCity(@PathVariable("city_id") int cityId,@PathVariable("curr_date")Date currentDate,@PathVariable("density")String density)
    {
        return eventCityMappingService.getEventsByCity(cityId,currentDate,density);
    }

    @RequestMapping("/events/get/{event_id}/{density}")
    public @ResponseBody
    EventStats getEventStats(@PathVariable("event_id")int eventId,@PathVariable("density")String density)
    {
        return eventCityMappingService.getEventStats(eventId,density);
    }


}
