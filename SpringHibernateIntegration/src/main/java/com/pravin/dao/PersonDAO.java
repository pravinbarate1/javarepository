package com.pravin.dao;

import java.util.List;

import com.pravin.dto.Person;


public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
