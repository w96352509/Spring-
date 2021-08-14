package com.study.spring.case03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.study.spring.case03.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	@Qualifier(value="userDaoDerbyImpl")
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println("ServiceIMPL");
	}

	@Override
	public void addUser() {
		userDao.createUser();

	}
}
