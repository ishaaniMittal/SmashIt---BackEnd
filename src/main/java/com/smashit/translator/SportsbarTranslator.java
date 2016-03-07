package com.smashit.translator;

import com.smashit.jsonPojo.JsonOffer;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.jsonPojo.JsonSportsbarDetails;
import com.smashit.model.City;
import com.smashit.model.Offer;
import com.smashit.model.SportsBar;

import java.util.ArrayList;
import java.util.List;

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
        jsonSportsbar.setSportsbarName(sportsbar.getSportsbarName());
        jsonSportsbar.setSportsbarPintBeer(sportsbar.getSportsbarPintBeer());
        return jsonSportsbar;
    }

    public static List<JsonSportsbar> getJsonSportsbarsByCityId(List<SportsBar> sportsBars)
    {
        List<JsonSportsbar> jsonSportsbars=new ArrayList<>();
        for(SportsBar sportsBar:sportsBars)
        {
            jsonSportsbars.add(getJsonSportsbarByCity(sportsBar,sportsBar.getSportsbarCity()));
        }
        return jsonSportsbars;
    }


    public static JsonSportsbarDetails getJsonSportsbarDetails(SportsBar sportsBar,List<JsonOffer> offers)
    {
        JsonSportsbarDetails jsonSportsbarDetails=new JsonSportsbarDetails();
        jsonSportsbarDetails.setSportsbarPhoneNo(sportsBar.getSportsbarPhoneNo());
        jsonSportsbarDetails.setSportsbarPincode(sportsBar.getSportsbarPincode());
        jsonSportsbarDetails.setOffers(offers);
        return jsonSportsbarDetails;
    }
}
