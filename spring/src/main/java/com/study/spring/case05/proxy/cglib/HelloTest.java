package com.study.spring.case05.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class HelloTest {

	public static void main(String[] args) {
		Hello hello = new Hello();
		System.out.println(hello.sayHello("Vic"));
		Hello hello2 = new EchancerHello();
		System.out.println(hello2.sayHello("Vic"));
		Enhancer echance = new Enhancer();
		echance.setSuperclass(Hello.class);
		echance.setCallback(new MyMethodInterceptor());
		Hello hello3 =(Hello) echance.create();
		System.out.println(hello3.sayHello("vic"));
	}

}
