package com.study.spring.case04;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
  @Autowired
	private PersonService personService;
  
  public boolean addPerson(String name , Date birth) {
	  Person person =new Person();
	  Date date = new Date();
	  person.setName(name);
	  person.setAge(0);
	  person.setBirDate(birth);
	  return personService.apped(person);
  }
  public List<Person> queryPerson(){
	  return personService.findAll();
  }
}
