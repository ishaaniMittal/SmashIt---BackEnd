package com.smashit.jsonPojo;

import com.smashit.model.Offer;

import java.util.List;
import java.util.Set;

/**
 * Created by Vijay on 28/01/2016.
 */
public class JsonSportsbar {

    private int id;
    private String sportsbarName;
    private double costFor2;
    private String sportsbarArea;
    private String sportsbarLandmark;
    private int cityId;
    private String cityName;
    private int sportsbarPintBeer;

    public JsonSportsbar(){}


    public int getSportsbarPintBeer() {
        return sportsbarPintBeer;
    }

    public void setSportsbarPintBeer(int sportsbarPintBeer) {
        this.sportsbarPintBeer = sportsbarPintBeer;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSportsbarName() {
        return sportsbarName;
    }

    public void setSportsbarName(String sportsbarName) {
        this.sportsbarName = sportsbarName;
    }


    public double getCostFor2() {
        return costFor2;
    }

    public void setCostFor2(double costFor2) {
        this.costFor2 = costFor2;
    }

    public String getSportsbarArea() {
        return sportsbarArea;
    }

    public void setSportsbarArea(String sportsbarArea) {
        this.sportsbarArea = sportsbarArea;
    }



    public String getSportsbarLandmark() {
        return sportsbarLandmark;
    }

    public void setSportsbarLandmark(String sportsbarLandmark) {
        this.sportsbarLandmark = sportsbarLandmark;
    }


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
