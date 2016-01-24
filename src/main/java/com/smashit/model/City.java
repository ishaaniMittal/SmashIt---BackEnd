package com.smashit.model;

/**
 * Created by Vijay on 24/01/2016.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="city")
public class City {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="city_id")
    private int id;

    @NotNull
    @Column(name="city_name")
    private String cityName;


    public City()
    {}

    public City(int id,String cityName)
    {
        this.id=id;
        this.cityName=cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName) {

        this.cityName = cityName;
    }
}
