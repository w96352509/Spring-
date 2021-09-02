package com.study.spring.case05.proxy.cglib;

public class EchancerHello extends Hello {

	@Override
	public String sayHello(String str) {
		
		return super.sayHello(str)+"123456";
	}
 
}
