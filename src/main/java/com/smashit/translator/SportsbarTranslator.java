package com.smashit.translator;

import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.City;
import com.smashit.model.SportsBar;

/**
 * Created by Vijay on 28/01/2016.
 */
public class SportsbarTranslator {
    public static JsonSportsbar getJsonSportsbarByCity(SportsBar sportsbar,City city)
    {
        JsonSportsbar jsonSportsbar=new JsonSportsbar();

        jsonSportsbar.setCityId(city.getId());
        jsonSportsbar.setCityName(city.getCityName());
        jsonSportsbar.setCostFor2(sportsbar.getCostFor2());
        jsonSportsbar.setId(sportsbar.getId());
        jsonSportsbar.setSportsbarArea(sportsbar.getSportsbarArea());
        jsonSportsbar.setSportsbarLandmark(sportsbar.getSportsbarLandmark());
        jsonSportsbar.setSportsbarPhoneNo(sportsbar.getSportsbarPhoneNo());
        jsonSportsbar.setSportsbarPicUrl(sportsbar.getSportsbarPicUrl());
        jsonSportsbar.setSportsbarPincode(sportsbar.getSportsbarPincode());
        jsonSportsbar.setSportsbarName(sportsbar.getSportsbarName());

        return jsonSportsbar;
    }
}
