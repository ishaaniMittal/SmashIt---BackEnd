package com.smashit.dao;

import com.smashit.model.EventSportsbarSportMapping;
import com.smashit.model.Sport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Vijay on 15/02/2016.
 */
@Transactional
public interface EventSportsbarSportMappingDao extends CrudRepository<EventSportsbarSportMapping,Integer>{

    @Query("select ess.sport from EventSportsbarSportMapping ess where ess.sportsBar.id = ?1")
    public List<Sport> getEventSportBySportsbarId(int sportsbarId);
}
