package com.smashit.service;

import com.smashit.dao.EventSportsbarSportMappingDao;
import com.smashit.dao.OfferDao;
import com.smashit.dao.SportsbarDao;
import com.smashit.jsonPojo.JsonOffer;
import com.smashit.jsonPojo.JsonSportsbar;
import com.smashit.jsonPojo.JsonSportsbarDetails;
import com.smashit.model.*;
import com.smashit.translator.OfferTranslator;
import com.smashit.translator.SportsbarTranslator;
import com.smashit.util.ImageUrlFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vijay on 15/02/2016.
 */
@Service
public class EventSportsbarSportMappingService {

    @Autowired
    private EventSportsbarSportMappingDao eventSportsbarSportMappingDao;

    @Autowired
    private OfferDao offerDao;

    @Autowired
    private SportsbarDao sportsbarDao;

    public List<Sport> getEventSportBySportsbarId(int sportsbarId, Date currentDate)
    {
        return eventSportsbarSportMappingDao.getEventSportBySportsbarId(sportsbarId, currentDate);
    }

    public EventSportsbarSportMapping getESSMappingById(int id)
    {
        return eventSportsbarSportMappingDao.findOne(id);
    }

    public List<Event> getEventsBySportsbarId(int sportsbarId,Date currentDate)
    {
        List<Event> events=eventSportsbarSportMappingDao.getEventsBySportsbarId(sportsbarId, currentDate);
        return events;
    }

    public List<Offer> getOffersForEvent(int sportsbarId,Date currentDate,Timestamp eventStartTime,Timestamp eventEndTime)
    {
        List<Offer> eventOffers=new ArrayList<>();
        List<Offer> offers=offerDao.getOffersBySportsbarIdAndDate(sportsbarId, currentDate);
        for(Offer offer:offers)
        {
            if(eventEndTime.getTime()<offer.getOfferStartTime().getTime()||eventStartTime.getTime()>offer.getOfferEndTime().getTime()) {
                System.out.println("***E END***"+eventEndTime.getHours()+"*** O START***"+offer.getOfferEndTime().getHours());
                System.out.println("***E START***"+eventStartTime.getHours()+"***O END***"+offer.getOfferEndTime().getHours());
                continue;
            }
            else
                eventOffers.add(offer);
        }
        return eventOffers;
    }

    public List<JsonSportsbar> getSportsbarsByEventAndCity(int eventId,int cityId,Date eventDate)
    {
        List<SportsBar> sportsBars=eventSportsbarSportMappingDao.getSportsbarsByEventAndCity(eventId, cityId, eventDate);

        return SportsbarTranslator.getJsonSportsbarsByCityId(sportsBars);
    }


    public JsonSportsbarDetails getSportsbarDetails(int sportsbarId,Date currentDate)
    {
        SportsBar sportsBar=sportsbarDao.findOne(sportsbarId);
        List<Offer> offers=offerDao.getOffersBySportsbarIdAndDate(sportsbarId, currentDate);
        List<JsonOffer> jsonOffers= OfferTranslator.getJsonOffersBySportsbarAndDate(offers);
        return SportsbarTranslator.getJsonSportsbarDetails(sportsBar,jsonOffers);
    }



}
