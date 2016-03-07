package com.smashit.service;

import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.model.Sport;
import com.smashit.model.SportsBar;
import com.smashit.translator.SportsbarTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vijay on 20/02/2016.
 */
@Service
public class JsonSportsbarService {

    @Autowired
    private EventSportsbarSportMappingService eventSportsbarSportMappingService;

    @Autowired
    private SportsbarService sportsbarService;


    public List<JsonSportsbar> getJsonSportsbarByCityId(int cityId,Date currentDate)
    {
        List<SportsBar> sportsBars=sportsbarService.getSportsbarsByCityId(cityId);

        List<JsonSportsbar> jsonSportsbars= SportsbarTranslator.getJsonSportsbarsByCityId(sportsBars);

/*        for(JsonSportsbar jsonSportsbar:jsonSportsbars) {
            List<Sport> sports = eventSportsbarSportMappingService.getEventSportBySportsbarId(jsonSportsbar.getId(), currentDate);
            Set<String> sportNames= new HashSet<>();
            for(Sport sport:sports)
            {
                sportNames.add(sport.getSportName());
            }
            jsonSportsbar.setSportsbarScreenings(sportNames);
        }*/
        return jsonSportsbars;
    }
}
