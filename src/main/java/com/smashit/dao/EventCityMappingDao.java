package com.smashit.dao;

import com.smashit.model.Event;
import com.smashit.model.EventCityMapping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 05/03/2016.
 */
public interface EventCityMappingDao extends CrudRepository<EventCityMapping,Integer> {

    @Query("select ecm.event from EventCityMapping ecm where ecm.city.id=?1 and ecm.event.eventDate=?2")
    public List<Event> getEventsByCity(int cityId,Date currentDate);

    @Query("select ecm.event from EventCityMapping ecm where ecm.event.id=?1")
    public Event getEvent(int eventId);
}
