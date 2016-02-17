package com.smashit.dao;

import com.smashit.model.Offer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 17/02/2016.
 */
@Transactional
public interface OfferDao extends CrudRepository<Offer,Integer> {

    @Query("select o from Offer o where o.offeringSportsBar.id=?1 and o.offerDate=?2")
    public List<Offer> getOffersBySportsbarIdAndDate(int sportsbarId,Date offerDate);
}
