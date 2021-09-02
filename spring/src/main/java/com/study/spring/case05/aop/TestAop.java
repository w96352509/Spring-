package com.study.spring.case05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) {
       ApplicationContext ctx =new ClassPathXmlApplicationContext("aop-config.xml");
       Calc calc = ctx.getBean("clacImpl" , Calc.class);
       System.out.println(calc.add(10, 20));
       System.out.println(calc.div(10, 10));
	}
}
