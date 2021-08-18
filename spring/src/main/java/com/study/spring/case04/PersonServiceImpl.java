package com.study.spring.case04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
	private PersonDao personDao; 
	@Override
	public boolean apped(Person person) {
		try {
			return personDao.add(person);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return false;
	}

	@Override
	public List<Person> findAll() {
		try {
			return personDao.querAll();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

}
