package com.smashit.controller;

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

    @RequestMapping("/findSportsBar")
    public @ResponseBody SportsBar getSportsbarBySportsbarId(int sportsbarId)
    {
        return sportsbarService.getSportsbarBySportsbarId(sportsbarId);
    }
}
