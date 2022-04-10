package com.jpa.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.dao.booking;
import com.jpa.test.dao.userRepository;
import com.jpa.test.entities.user;
import com.jpa.test.entities.book;



@Service
public class userservice {
	@Autowired
	userRepository userep;
	
	@Autowired
	booking book;
	
	public void deleteemployeerecord(int id)
	{
		book.deleteById(id);
	}
	
	public List<user> getallusers()
	{
		return (List<user>)userep.findAll();
	}
	
	public List<book> getallrecords()
	{
		return (List<book>)book.findAll();
	}
	
	public List<book> getallemployeerecords()
	  {
	    return (List<book>)book.findAll();
	  }
	
	public void adduser(user emp)
	{
		userep.save(emp);
	}
	
	public void addAppoint(book obj)
	{
		book.save(obj);
	    //carrepository.save(car);
	}

	public String findByName(String name) {
		user u;
		try {
			u=userep.findByName(name);
		}catch(Exception e) {
			System.out.println("user not found!!!");
			return "/";
		}
		if(u!=null) {
			return name;
		}
		return null;
	}

	public String findByPass(String pass) {
		user u1;
		try {
			u1=userep.findByPass(pass);
		}catch(Exception e) {
			System.out.println("pass not found!!!");
			return "/";
		}
		if(u1!=null) {
			return pass;
		}
		return null;
	
	}
}
