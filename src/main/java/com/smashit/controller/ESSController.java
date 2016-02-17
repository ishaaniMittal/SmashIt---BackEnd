package com.smashit.controller;

import com.smashit.model.EventSportsbarSportMapping;
import com.smashit.model.Sport;
import com.smashit.service.EventSportsbarSportMappingService;
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
}
