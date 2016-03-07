package com.smashit.dao;

import com.smashit.model.Event;
import com.smashit.model.EventSportsbarSportMapping;
import com.smashit.model.Sport;
import com.smashit.model.SportsBar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

/**
 * Created by Vijay on 15/02/2016.
 */
@Transactional
public interface EventSportsbarSportMappingDao extends CrudRepository<EventSportsbarSportMapping,Integer>{

    @Query("select ess.sport from EventSportsbarSportMapping ess where ess.sportsBar.id = ?1 and ess.eventDate =?2")
    public List<Sport> getEventSportBySportsbarId(int sportsbarId,Date currentDate);

    @Query("select ess.event from EventSportsbarSportMapping ess where ess.sportsBar.id = ?1 and ess.eventDate =?2")
    public List<Event> getEventsBySportsbarId(int sportsbarId,Date currentDate);

    @Query("select ess.event from EventSportsbarSportMapping ess where ess.sportsBar.sportsbarCity.id=?1")
    public List<Event> getEventsByCityId(int cityId);

    @Query("select ess.sportsBar from EventSportsbarSportMapping ess where ess.event.id=?1 and ess.event.eventDate=?3 and ess.sportsBar.sportsbarCity.id=?2")
    public List<SportsBar> getSportsbarsByEventAndCity(int eventId,int cityId,Date eventDate);

}
