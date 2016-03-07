package com.smashit.translator;

import com.smashit.jsonPojo.JsonOffer;
import com.smashit.model.Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vijay on 17/02/2016.
 */
public class OfferTranslator {

    public static List<JsonOffer> getJsonOffersBySportsbarAndDate(List<Offer> offers)
    {
        List<JsonOffer> jsonOfferList=new ArrayList<>();
        for(Offer offer:offers)
        {
            JsonOffer jsonOffer=new JsonOffer();
            jsonOffer.setId(offer.getId());
            jsonOffer.setOfferDate(offer.getOfferDate());
            jsonOffer.setOfferStartTime(offer.getOfferStartTime());
            jsonOffer.setOfferEndTime(offer.getOfferEndTime());
            jsonOffer.setOfferDescription(offer.getOfferDescription());
            jsonOffer.setSportsbarId(offer.getOfferingSportsBar().getId());
            jsonOfferList.add(jsonOffer);
        }
        return jsonOfferList;
    }


}
