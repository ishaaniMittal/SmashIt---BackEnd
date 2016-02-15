package com.smashit.dao;

import com.smashit.model.Event;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Vijay on 15/02/2016.
 */
@Transactional
public interface EventDao extends CrudRepository<Event,Integer> {
}
