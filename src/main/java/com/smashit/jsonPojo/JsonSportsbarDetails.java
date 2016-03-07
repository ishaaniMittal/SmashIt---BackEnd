package com.smashit.jsonPojo;

import com.smashit.model.Offer;

import java.util.List;

/**
 * Created by Vijay on 07/03/2016.
 */
public class JsonSportsbarDetails {
    private String sportsbarPhoneNo;
    private int sportsbarPincode;
    private List<JsonOffer> offers;

    public String getSportsbarPhoneNo() {
        return sportsbarPhoneNo;
    }

    public void setSportsbarPhoneNo(String sportsbarPhoneNo) {
        this.sportsbarPhoneNo = sportsbarPhoneNo;
    }

    public int getSportsbarPincode() {
        return sportsbarPincode;
    }

    public void setSportsbarPincode(int sportsbarPincode) {
        this.sportsbarPincode = sportsbarPincode;
    }

    public List<JsonOffer> getOffers() {
        return offers;
    }

    public void setOffers(List<JsonOffer> offers) {
        this.offers = offers;
    }
}
