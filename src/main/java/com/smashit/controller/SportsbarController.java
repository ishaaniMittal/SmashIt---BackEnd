package com.smashit.controller;

import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.Sport;
import com.smashit.model.SportsBar;

import com.smashit.service.SportsbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vijay on 24/01/2016.
 */
@Controller
public class SportsbarController {

    @Autowired
    private SportsbarService sportsbarService;

    @RequestMapping(value = "/findSportsBar", produces = "application/json")

    public @ResponseBody
    JsonSportsbar getSportsbarBySportsbarId(int sportsbarId)
    {

        JsonSportsbar sportsBar= sportsbarService.getSportsbarBySportsbarId(sportsbarId);
        System.out.println("CONTROLLER :"+sportsBar);

        return sportsBar;
    }
}
