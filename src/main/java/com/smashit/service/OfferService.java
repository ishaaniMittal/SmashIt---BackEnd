package com.smashit.service;

import com.smashit.dao.OfferDao;
import com.smashit.jsonPojo.JsonOffer;
import com.smashit.model.Offer;
import com.smashit.translator.OfferTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 17/02/2016.
 */
@Service
public class OfferService {

    @Autowired
    private OfferDao offerDao;

    public List<JsonOffer> getOffersBySportsbarIdAndDate(int sportsbarId,Date offerDate)
    {
        return OfferTranslator.getJsonOffersBySportsbarAndDate(offerDao.getOffersBySportsbarIdAndDate(sportsbarId, offerDate));
    }
}
