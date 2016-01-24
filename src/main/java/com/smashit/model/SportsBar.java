package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Vijay on 24/01/2016.
 */

@Entity
@Table(name="sportsbar")
public class SportsBar {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="sbar_id")
    private int id;

    @Column(name="sbar_name")
    @NotNull
    private String sportsbarName;

    @Column(name="sbar_pic_url")
    @NotNull
    private String sportsbarPicUrl;

    @Column(name="cost_for_2")
    @NotNull
    private double costFor2;

    @Column(name = "sbar_area")
    @NotNull
    private String sportsbarArea;

    @Column(name = "sbar_pincode")
    @NotNull
    private int sportsbarPincode;

    @Column(name = "sbar_landmark")
    @NotNull
    private String sportsbarLandmark;

    @Column(name = "sbar_phone_no")
    @NotNull
    private String sportsbarPhoneNo;

    @Column(name = "sbar_city_id")
    @NotNull
    private int sportsbarCityId;

    @ManyToOne
    @JoinColumn(table = "city" ,name = "city_id")
    public int getSportsbarCityId() {
        return sportsbarCityId;
    }

    public SportsBar(){}
    public SportsBar(String sportsbarName, String sportsbarPicUrl, double costFor2, String sportsbarArea, int sportsbarPincode, String sportsbarLandmark, String sportsbarPhoneNo, int sportsbarCityId) {
        this.sportsbarName = sportsbarName;
        this.sportsbarPicUrl = sportsbarPicUrl;
        this.costFor2 = costFor2;
        this.sportsbarArea = sportsbarArea;
        this.sportsbarPincode = sportsbarPincode;
        this.sportsbarLandmark = sportsbarLandmark;
        this.sportsbarPhoneNo = sportsbarPhoneNo;
        this.sportsbarCityId = sportsbarCityId;
    }
}
