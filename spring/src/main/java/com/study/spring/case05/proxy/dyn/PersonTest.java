package com.study.spring.case05.proxy.dyn;


import com.study.spring.case05.proxy.sta.Man;
import com.study.spring.case05.proxy.sta.Person;
import com.study.spring.case05.proxy.sta.PersonProxy;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = (Person)new ProxyUtil(new PersonProxy(new Man())).getProxy();
        p1.work();
	}

}
