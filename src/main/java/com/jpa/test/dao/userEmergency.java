package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.emergency;

public interface userEmergency extends CrudRepository<emergency,Integer> {

}
