package com.smashit.jsonPojo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Vijay on 17/02/2016.
 */
public class JsonOffer {

    private int id;
    private String offerDescription;
    private Timestamp offerStartTime;
    private Timestamp offerEndTime;
    private Date offerDate;
    private int sportsbarId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public Timestamp getOfferStartTime() {
        return offerStartTime;
    }

    public void setOfferStartTime(Timestamp offerStartTime) {
        this.offerStartTime = offerStartTime;
    }

    public Timestamp getOfferEndTime() {
        return offerEndTime;
    }

    public void setOfferEndTime(Timestamp offerEndTime) {
        this.offerEndTime = offerEndTime;
    }

    public Date getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(Date offerDate) {
        this.offerDate = offerDate;
    }

    public int getSportsbarId() {
        return sportsbarId;
    }

    public void setSportsbarId(int sportsbarId) {
        this.sportsbarId = sportsbarId;
    }
}
