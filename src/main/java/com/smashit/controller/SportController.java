package com.smashit.controller;

import com.smashit.model.Sport;
import com.smashit.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */

@Controller
public class SportController {

    @Autowired
    private SportService sportService;

    @RequestMapping("/addSport")

    public  @ResponseBody String addSport(String sportName)
    {
        return sportService.addSport(sportName);
    }

    @RequestMapping("/findSport")
    public @ResponseBody Sport getSportById(int sportId)
    {
        return sportService.getSportById(sportId);
    }

    @RequestMapping("/getSports")
    public @ResponseBody List<Sport> getAllSports()
    {
        return sportService.getAllSports();
    }


}
