package com.study.spring.case05.proxy.sta;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new PersonProxy(new Man());
		p1.work();

	}

}
