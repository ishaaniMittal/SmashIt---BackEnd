package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * Created by Vijay on 15/02/2016.
 */
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="event_id")
    private int id;

    @NotNull
    @Column(name = "event_desc")
    private String eventDesc;

    @NotNull
    @Column(name = "event_date")
    private Date eventDate;

    @NotNull
    @Column(name = "event_start_time")
    private Timestamp eventStartTimestap;

    public Timestamp getEventStartTimestap() {
        return eventStartTimestap;
    }

    public void setEventStartTimestap(Timestamp eventStartTimestap) {
        this.eventStartTimestap = eventStartTimestap;
    }


    @NotNull
    @Column(name = "venue")
    private String venue;

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @NotNull
    @Column(name = "team1")
    private String team1;

    @NotNull
    @Column(name = "team2")
    private String team2;

    @NotNull
    @Column(name = "img_url")
    private String teamImageUrl;


    @NotNull
    @Column(name = "wr_t1")
    private int team1WorldRanking;

    @NotNull
    @Column(name = "wr_t2")
    private int team2WorldRanking;

    @NotNull
    @Column(name = "trn_t1_wins")
    private int trnTeam1Wins;

    @NotNull
    @Column(name = "trn_t2_wins")
    private int trnTeam2Wins;

    @NotNull
    @Column(name = "t1_grp_standing")
    private int t1GrpStanding;

    @NotNull
    @Column(name = "t2_grp_standing")
    private int t2GrpStanding;


    public int getTeam1WorldRanking() {
        return team1WorldRanking;
    }

    public void setTeam1WorldRanking(int team1WorldRanking) {
        this.team1WorldRanking = team1WorldRanking;
    }

    public int getTeam2WorldRanking() {
        return team2WorldRanking;
    }


    public void setTeam2WorldRanking(int team2WorldRanking) {
        this.team2WorldRanking = team2WorldRanking;
    }

    public int getTrnTeam1Wins() {
        return trnTeam1Wins;
    }

    public void setTrnTeam1Wins(int trnTeam1Wins) {
        this.trnTeam1Wins = trnTeam1Wins;
    }

    public int getTrnTeam2Wins() {
        return trnTeam2Wins;
    }

    public void setTrnTeam2Wins(int trnTeam2Wins) {
        this.trnTeam2Wins = trnTeam2Wins;
    }

    public int getT1GrpStanding() {
        return t1GrpStanding;
    }

    public void setT1GrpStanding(int t1GrpStanding) {
        this.t1GrpStanding = t1GrpStanding;
    }

    public int getT2GrpStanding() {
        return t2GrpStanding;
    }

    public void setT2GrpStanding(int t2GrpStanding) {
        this.t2GrpStanding = t2GrpStanding;
    }

    public String getTeamImageUrl() {
        return teamImageUrl;
    }

    public void setTeamImageUrl(String teamImageUrl) {
        this.teamImageUrl = teamImageUrl;
    }


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "event_sprt_id")
    @NotNull
    private Sport eventSport;

    public Event() {
    }


    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }


    public Sport getEventSport() {
        return eventSport;
    }

    public void setEventSport(Sport eventSport) {
        this.eventSport = eventSport;
    }
}
