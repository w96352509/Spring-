package com.study.spring.case05.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
 public static void main(String[] args) {
	ApplicationContext ctx =new ClassPathXmlApplicationContext("aopxml-config.xml");
	Calc calc = (Calc)ctx.getBean("clacImpl");
	System.out.println(calc.add(10, 20));
}
}
