package com.smashit.model;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Vijay on 17/02/2016.
 */
@Entity
@Table(name = "offer")
public class Offer {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="offer_id")
    private int id;

    @NotNull
    @Column(name = "offer_desc")
    private String offerDescription;

    @NotNull
    @Column(name = "offer_start_time")
    private Timestamp offerStartTime;

    @NotNull
    @Column(name = "offer_end_time")
    private Timestamp offerEndTime;

    @NotNull
    @Column(name = "offer_date")
    private Date offerDate;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "offer_sbar_id")
    private SportsBar offeringSportsBar;

    public Offer() {
    }

    public Date getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(Date offerDate) {
        this.offerDate = offerDate;
    }

    public Offer(String offerDescription, Timestamp offerStartTime, Timestamp offerEndTime, Date offerDate, SportsBar offeringSportsBar) {

        this.offerDescription = offerDescription;
        this.offerStartTime = offerStartTime;
        this.offerEndTime = offerEndTime;
        this.offerDate = offerDate;
        this.offeringSportsBar = offeringSportsBar;
    }

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

    public SportsBar getOfferingSportsBar() {
        return offeringSportsBar;
    }

    public void setOfferingSportsBar(SportsBar offeringSportsBar) {
        this.offeringSportsBar = offeringSportsBar;
    }
}
