package com.study.spring.case06.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.case06.tx.dao.BookDao;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao ;
	
	@Override
	public void buyOne(Integer wid, Integer bid) {
		//得到price
		int price=bookDao.getPrice(bid);
		//更新庫存
		bookDao.updateStock(bid);
		//更新錢包
		bookDao.updateWallet(wid, bid);
	}

	@Override
	public void buyMany(Integer wid, Integer... bid) {
		// TODO Auto-generated method stub
		
	}
  
}
