package com.study.spring.case05.dancer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance performance = (Performance)ctx.getBean("dancer");
       performance.perform();
	}

}
