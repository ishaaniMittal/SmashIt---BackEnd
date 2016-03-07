package com.smashit.controller;

import com.smashit.jsonPojo.JsonEvent;
import com.smashit.model.Event;
import com.smashit.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Vijay on 15/02/2016.
 */
@Controller
@RequestMapping("/event")
public class EventController {


    @Autowired
    private EventService eventService;


    @RequestMapping(value = "/getEventById/{event_id}",produces = "application/json")
    public @ResponseBody Event getEventById(@PathVariable("event_id")int eventId)
    {
        return eventService.getEventById(eventId);
    }



}
