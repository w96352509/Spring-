package com.study.spring.case05.dancer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
 @Before("execution(* com.study.spring.case05.dancer.Performance.perform(..))")
	public void SlienceCellPhone() {
	 System.out.println("關掉手機");
 }
 @Before("execution(* com.study.spring.case05.dancer.Performance.perform(..))")
	public void takeSeats() {
	 System.out.println("找到位置");
}
 @AfterReturning("execution(* com.study.spring.case05.dancer.Performance.perform(..))")
 public void applause() {
	 System.out.println("拍手");
}
 @AfterThrowing("execution(* com.study.spring.case05.dancer.Performance.perform(..))")
 public void demandRefund() {
	 System.out.println("退票");
}
  @After("execution(* com.study.spring.case05.dancer.Performance.perform(..))")
 public void exit() {
	 System.out.println("離開表演場");
}
 
}
