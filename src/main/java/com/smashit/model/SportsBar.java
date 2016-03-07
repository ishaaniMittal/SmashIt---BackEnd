package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Vijay on 24/01/2016.
 */

@Entity
@Table(name="sportsbar")
public class SportsBar implements Serializable {

    @Override
    public String toString() {
        return "SportsBar{" +
                "id=" + id +
                ", sportsbarName='" + sportsbarName + '\'' +
                ", sportsbarPicUrl='" + sportsbarPicUrl + '\'' +
                ", costFor2=" + costFor2 +
                ", sportsbarArea='" + sportsbarArea + '\'' +
                ", sportsbarPincode=" + sportsbarPincode +
                ", sportsbarLandmark='" + sportsbarLandmark + '\'' +
                ", sportsbarPhoneNo='" + sportsbarPhoneNo + '\'' +
                ", sportsbarCity=" + sportsbarCity +
                '}';
    }

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

    @Column(name = "sbar_pint_beer")
    @NotNull
    private int sportsbarPintBeer;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "sbar_city_id")
    @NotNull
    private City sportsbarCity;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "sbar_id")
    @NotNull
    private List<SportsbarImages> sportsbarImages;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "sbar_id")
    @NotNull
    private List<Menu> menus;


    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public City getSportsbarCity() {
        return sportsbarCity;
    }

    public SportsBar(){}


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

    public void setSportsbarCity(City sportsbarCity) {
        this.sportsbarCity = sportsbarCity;
    }

    public List<SportsbarImages> getSportsbarImages() {
        return sportsbarImages;
    }

    public void setSportsbarImages(List<SportsbarImages> sportsbarImages) {
        this.sportsbarImages = sportsbarImages;
    }
}
