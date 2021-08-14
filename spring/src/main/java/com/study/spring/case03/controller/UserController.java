package com.study.spring.case03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.case03.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController() {
	   System.out.println("UserContorller ok");
   }
  public void appendUser() {
	  userService.addUser();
  }

}
