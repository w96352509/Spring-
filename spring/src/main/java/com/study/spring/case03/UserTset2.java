package com.study.spring.case03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.case03.controller.UserController;
import com.study.spring.case03.modle.Page;
import com.study.spring.case03.modle.User;

public class UserTset2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		     User uc = ctx.getBean("user",User.class);
		     Page pg = ctx.getBean("page",Page.class);
		     System.out.println(uc);
		     System.out.println(pg);

	}

}
