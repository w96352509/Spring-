package com.study.spring.case05.aopxml;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyLoggerXMLAspect {
 public void before(JoinPoint joinpoint) {
	 System.out.println("XML前置");
	 String methodname=joinpoint.getSignature().getName();
	 Object[] args =joinpoint.getArgs();
	 System.out.printf(methodname , Arrays.toString(args));
 }
}
