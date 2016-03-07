package com.smashit.translator;

import com.smashit.jsonPojo.JsonEvent;
import com.smashit.model.Event;
import com.smashit.model.EventStats;
import com.smashit.util.ImageUrlFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vijay on 20/02/2016.
 */
public class EventTranslator {

    public static List<JsonEvent> getJsonEvents(List<Event> events,String density) {
        List<JsonEvent> jsonEvents = new ArrayList<>();
        for (Event event : events) {
            JsonEvent jsonEvent = new JsonEvent();
            jsonEvent.setId(event.getId());
            jsonEvent.setEvenDate(event.getEventDate());
            jsonEvent.setEventStartTimestap(event.getEventStartTimestap());
            jsonEvent.setTeamImageUrl(ImageUrlFactory.getTeamImageUrl(event.getTeamImageUrl(),density));
            jsonEvent.setTeam1(event.getTeam1());
            jsonEvent.setTeam2(event.getTeam2());
            jsonEvent.setSport(event.getEventSport().getSportName());
            jsonEvent.setEventDesc(event.getEventDesc());
            jsonEvents.add(jsonEvent);
        }
        return jsonEvents;
    }


    public static EventStats getEventStats(Event event,String density)
    {
        EventStats eventStats=new EventStats();
        eventStats.setVenue(event.getVenue());
        eventStats.setTeam1(event.getTeam1());
        eventStats.setTeam2(event.getTeam2());
        eventStats.setTeamImageUrl(event.getTeamImageUrl());
        eventStats.setEventSportName(event.getEventSport().getSportName());
        eventStats.setTeam1WorldRanking(event.getTeam1WorldRanking());
        eventStats.setTeam2WorldRanking(event.getTeam2WorldRanking());
        eventStats.setTrnTeam1Wins(event.getTrnTeam1Wins());
        eventStats.setTrnTeam2Wins(event.getTrnTeam2Wins());
        eventStats.setT1GrpStanding(event.getT1GrpStanding());
        eventStats.setT2GrpStanding(event.getT2GrpStanding());
        eventStats.setTeamImageUrl(ImageUrlFactory.getTeamImageUrl(event.getTeamImageUrl(),density));
        return eventStats;
    }

}
