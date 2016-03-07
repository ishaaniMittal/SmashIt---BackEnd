package com.smashit.model;

/**
 * Created by Vijay on 06/03/2016.
 */
public class EventStats {

    private String venue;
    private String team1;
    private String team2;
    private String teamImageUrl;
    private String eventSportName;
    private int team1WorldRanking;
    private int team2WorldRanking;
    private int trnTeam1Wins;
    private int trnTeam2Wins;
    private int t1GrpStanding;
    private int t2GrpStanding;
    private String eventDesc;

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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

    public String getEventSportName() {
        return eventSportName;
    }

    public void setEventSportName(String eventSportName) {
        this.eventSportName = eventSportName;
    }

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
}
