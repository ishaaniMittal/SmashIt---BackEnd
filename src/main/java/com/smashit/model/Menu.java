package com.smashit.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Vijay on 21/02/2016.
 */
@Entity
@Table(name = "sbar_menu_img_mapping")
public class Menu {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="menu_id")
    private int id;

    @NotNull
    @Column(name = "sbar_id")
    private int sportsbarId;

    @NotNull
    @Column(name = "total_pages")
    private int totalPages;

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSportsbarId() {
        return sportsbarId;
    }

    public void setSportsbarId(int sportsbarId) {
        this.sportsbarId = sportsbarId;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
