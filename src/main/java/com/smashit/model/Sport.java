package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Vijay on 24/01/2016.
 */
@Entity
@Table(name="sports")
public class Sport implements Serializable{
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="sprt_id")
    private int id;

    public Sport() {
    }

    @Column(name="sprt_name")
    @NotNull
    private String sportName;

    public Sport(String sportName) {
        this.sportName = sportName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
}
