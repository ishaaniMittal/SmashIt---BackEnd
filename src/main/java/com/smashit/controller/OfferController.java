package com.smashit.controller;

import com.smashit.jsonPojo.JsonOffer;
import com.smashit.model.Offer;
import com.smashit.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 17/02/2016.
 */
@Controller
@RequestMapping("/offer")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @RequestMapping("/getOffersBySportsbarIdAndDate/{sbar_id}/{offer_date}")
    public @ResponseBody List<JsonOffer> getOffersBySportsbarIdAndDate(@PathVariable("sbar_id") int sportsbarId,@PathVariable("offer_date") Date offerDate)
    {
        return offerService.getOffersBySportsbarIdAndDate(sportsbarId,offerDate);
    }
}
