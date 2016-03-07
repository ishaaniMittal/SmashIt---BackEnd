package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Vijay on 05/03/2016.
 */
@Entity
@Table(name = "event_city_mapping")
public class EventCityMapping {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="ecm_id")
    private int id;


    @NotNull
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    private Event event;

    @NotNull
    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
