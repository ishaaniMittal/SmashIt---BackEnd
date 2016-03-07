package com.smashit.jsonPojo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Vijay on 20/02/2016.
 */
public class JsonEvent {
    private int id;
    private Date evenDate;
    private Timestamp eventStartTimestap;
    private String teamImageUrl;
    private String team1;
    private String team2;
    private String sport;
    private String eventDesc;

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
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

    public String getTeamImageUrl() {
        return teamImageUrl;
    }

    public void setTeamImageUrl(String teamImageUrl) {
        this.teamImageUrl = teamImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEvenDate() {
        return evenDate;
    }

    public void setEvenDate(Date evenDate) {
        this.evenDate = evenDate;
    }

    public Timestamp getEventStartTimestap() {
        return eventStartTimestap;
    }

    public void setEventStartTimestap(Timestamp eventStartTimestap) {
        this.eventStartTimestap = eventStartTimestap;
    }
}
