package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;


/*  Created by Vijay on 15/02/2016.*/

@Entity
@Table(name = "event_sbar_sprt_mapping")
public class EventSportsbarSportMapping {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="ess_id")
    private int id;

    @NotNull
    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    private Event event;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "sbar_id")
    private SportsBar sportsBar;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "sprt_id")
    private Sport sport;

    @NotNull
    @Column(name = "event_date")
    private Date eventDate;

    public EventSportsbarSportMapping() {
    }

    public EventSportsbarSportMapping(Event event, SportsBar sportsBar, Sport sport, Date eventDate) {
        this.event = event;
        this.sportsBar = sportsBar;
        this.sport = sport;
        this.eventDate = eventDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public SportsBar getSportsBar() {
        return sportsBar;
    }

    public void setSportsBar(SportsBar sportsBar) {
        this.sportsBar = sportsBar;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}
