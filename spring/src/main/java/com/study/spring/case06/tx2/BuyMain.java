package com.study.spring.case06.tx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.study.spring.case06.tx2.controller.Bookcontroller;

public class BuyMain {
	public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config2.xml");
	   JdbcTemplate jdbcTemplate =(JdbcTemplate)ctx.getBean("jdbcTemplate");
	
	  Bookcontroller bookcontroller = (Bookcontroller)ctx.getBean("bookcontrollerImpl");
	  int wid=1;
	  int bid=1;
	  bookcontroller.buyBook(wid, bid); 
	}
	
}
