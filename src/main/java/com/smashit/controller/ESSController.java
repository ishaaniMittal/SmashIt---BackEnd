package com.smashit.controller;

import com.smashit.jsonPojo.JsonEvent;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.jsonPojo.JsonSportsbarDetails;
import com.smashit.model.Event;
import com.smashit.model.EventSportsbarSportMapping;
import com.smashit.model.Offer;
import com.smashit.model.Sport;
import com.smashit.service.EventSportsbarSportMappingService;
import com.smashit.translator.EventTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 15/02/2016.
 */
@Controller
@RequestMapping("/ess")
public class ESSController {

    @Autowired
    private EventSportsbarSportMappingService eventSportsbarSportMappingService;

    @RequestMapping("/getEventSportBySportsbarId/{sbar_id}/{curr_date}")
    public @ResponseBody
    List<Sport> getEventSportBySportsbarId(@PathVariable("sbar_id")int sportsbarId,@PathVariable("curr_date") Date currentDate)
    {
        return eventSportsbarSportMappingService.getEventSportBySportsbarId(sportsbarId, currentDate);
    }

    @RequestMapping("/getESSMappingById/{id}")
    public @ResponseBody EventSportsbarSportMapping getESSMappingById(@PathVariable("id")int essId)
    {
        return eventSportsbarSportMappingService.getESSMappingById(essId);
    }

/*    @RequestMapping("/getEventsBySportsbarId/{sbar_id}/{curr_date}")
    public @ResponseBody List<JsonEvent> getEventsBySportsbarId(@PathVariable("sbar_id")int sportsbarId,@PathVariable("curr_date")Date currentDate)
    {
        return eventSportsbarSportMappingService.getJsonEventsBySportsbarId(sportsbarId, currentDate);
    }

    @RequestMapping("/getEventsByCity/{city_id}")
    public @ResponseBody List<JsonEvent> getJsonEventsByCityId(@PathVariable("city_id")int cityId)
    {
        return eventSportsbarSportMappingService.getJsonEventsByCityId(cityId);
    }*/

    @RequestMapping("/events/{sbar_id}/{current_date}/{density}")
    public @ResponseBody List<JsonEvent> getEventsBySportsbarId(@PathVariable("sbar_id")int sportsbarId,@PathVariable("current_date")Date currentDate,@PathVariable("density")String density)
    {
        List<Event> events=eventSportsbarSportMappingService.getEventsBySportsbarId(sportsbarId,currentDate);
        return EventTranslator.getJsonEvents(events,density);
    }

    @RequestMapping("/sportsbars/{event_id}/{city_id}/{event_date}")
    public @ResponseBody List<JsonSportsbar> getSportsbarsByEventAndCity(@PathVariable("event_id")int eventId,@PathVariable("city_id")int cityId,@PathVariable("event_date")Date eventDate)
    {
        return eventSportsbarSportMappingService.getSportsbarsByEventAndCity(eventId, cityId, eventDate);
    }


    @RequestMapping("/sportsbars/detail/{sbar_id}/{curr_date}")
    public @ResponseBody JsonSportsbarDetails getSportsbarDetails(@PathVariable("sbar_id")int sportsbarId,@PathVariable("curr_date")Date currentDate)
    {
        return eventSportsbarSportMappingService.getSportsbarDetails(sportsbarId,currentDate);
    }

}
