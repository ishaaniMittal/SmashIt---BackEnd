package com.smashit.dao;

import com.smashit.model.Sport;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Vijay on 24/01/2016.
 */

@Transactional
public interface SportDao extends CrudRepository<Sport,Integer> {
}
