package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
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
    @Column(name = "event_name")
    private String eventName;

    @NotNull
    @Column(name = "event_date")
    private Date eventDate;

    @NotNull
    @Column(name = "event_time")
    private Timestamp eventTimestap;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "event_sprt_id")
    @NotNull
    private Sport eventSport;

    public Event() {
    }

    public Event(String eventName, Date eventDate, Timestamp eventTimestap, Sport eventSport) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTimestap = eventTimestap;
        this.eventSport = eventSport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Timestamp getEventTimestap() {
        return eventTimestap;
    }

    public void setEventTimestap(Timestamp eventTimestap) {
        this.eventTimestap = eventTimestap;
    }

    public Sport getEventSport() {
        return eventSport;
    }

    public void setEventSport(Sport eventSport) {
        this.eventSport = eventSport;
    }
}
