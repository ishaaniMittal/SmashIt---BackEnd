package com.smashit.jsonPojo;

/**
 * Created by Vijay on 28/01/2016.
 */
public class JsonSportsbar {

    private int id;
    private String sportsbarName;
    private String sportsbarPicUrl;
    private double costFor2;
    private String sportsbarArea;
    private int sportsbarPincode;
    private String sportsbarLandmark;
    private String sportsbarPhoneNo;
    private int cityId;
    private String cityName;
    private int sportsbarPintBeer;

    public JsonSportsbar(){}

    public JsonSportsbar(int id, String sportsbarName, String sportsbarPicUrl, double costFor2, String sportsbarArea, int sportsbarPincode, String sportsbarLandmark, String sportsbarPhoneNo, int cityId, String cityName, int sportsbarPintBeer) {
        this.id = id;
        this.sportsbarName = sportsbarName;
        this.sportsbarPicUrl = sportsbarPicUrl;
        this.costFor2 = costFor2;
        this.sportsbarArea = sportsbarArea;
        this.sportsbarPincode = sportsbarPincode;
        this.sportsbarLandmark = sportsbarLandmark;
        this.sportsbarPhoneNo = sportsbarPhoneNo;
        this.cityId = cityId;
        this.cityName = cityName;
        this.sportsbarPintBeer = sportsbarPintBeer;
    }

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

    public String getSportsbarPicUrl() {
        return sportsbarPicUrl;
    }

    public void setSportsbarPicUrl(String sportsbarPicUrl) {
        this.sportsbarPicUrl = sportsbarPicUrl;
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

    public int getSportsbarPincode() {
        return sportsbarPincode;
    }

    public void setSportsbarPincode(int sportsbarPincode) {
        this.sportsbarPincode = sportsbarPincode;
    }

    public String getSportsbarLandmark() {
        return sportsbarLandmark;
    }

    public void setSportsbarLandmark(String sportsbarLandmark) {
        this.sportsbarLandmark = sportsbarLandmark;
    }

    public String getSportsbarPhoneNo() {
        return sportsbarPhoneNo;
    }

    public void setSportsbarPhoneNo(String sportsbarPhoneNo) {
        this.sportsbarPhoneNo = sportsbarPhoneNo;
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
