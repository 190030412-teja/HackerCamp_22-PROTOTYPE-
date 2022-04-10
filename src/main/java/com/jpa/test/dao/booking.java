package com.jpa.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.book;



public interface booking extends CrudRepository<book,Integer> 
{

	List<book> findByName(String username);

	List<book> findByBookuser(String username);
	
	@Query(value="select * from where id=:empid",nativeQuery=true)
	book findById1(@Param("empid")int empid);

	@Modifying
	@Transactional
	@Query(value="update booking set status = :k where id=:empid",nativeQuery=true)
	void findById2(@Param("empid")int empid,@Param("k")String k);
	
}
