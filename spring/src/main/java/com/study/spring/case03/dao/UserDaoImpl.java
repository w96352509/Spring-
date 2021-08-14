package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

@Repository
 class UserDaoImpl  implements UserDao{
 public UserDaoImpl() {
	 System.out.println("DAOIMPL");
 }

@Override
public void createUser() {
	System.out.println("Create OK");
	
}
}
