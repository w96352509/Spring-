package com.study.spring.case05.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyLoggerAspect {
@Pointcut(value = "execution(* com.study.spring.case05.aop.ClacImpl.*(..))")
public void pt() {
	}
//環繞
@Around(value = "pt()")
public Object around(ProceedingJoinPoint joinPoint) {
Object result=null;
	try {
	//1.前置
		System.out.println("前置");
	//方法帶入
		result=joinPoint.proceed();
	//2.反應
		System.out.println("反");
	} catch (Throwable e) {
	//3.異常通知
		System.out.println("異常通知");
	}finally {
    //4.後置通知
		System.out.println("後置通知");
	}
	return result;
}
}
