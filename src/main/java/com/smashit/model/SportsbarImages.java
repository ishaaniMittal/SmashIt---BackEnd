package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Vijay on 21/02/2016.
 */
@Entity
@Table(name = "sportsbar_img_mapping")
public class SportsbarImages {


    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="sbar_img_id")
    private int id;

    @NotNull
    @Column(name = "total_imgs")
    private int totalImages;

    @NotNull
    @Column(name = "sbar_id")
    private int sportsbarId;

    public SportsbarImages() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalImages() {
        return totalImages;
    }

    public void setTotalImages(int totalImages) {
        this.totalImages = totalImages;
    }

    public int getSportsbarId() {
        return sportsbarId;
    }

    public void setSportsbarId(int sportsbarId) {
        this.sportsbarId = sportsbarId;
    }
}
