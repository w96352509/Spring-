package com.study.spring.case06.tx.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.case06.tx.dao.BookDao;
import com.study.spring.case06.tx.eception.InsufficientAmount;
import com.study.spring.case06.tx.eception.InsufficientQuantity;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao ;
	@Transactional(
			rollbackFor = {InsufficientAmount.class ,InsufficientQuantity.class}
			)
	@Override
	public void buyOne(Integer wid, Integer bid) throws InsufficientAmount , InsufficientQuantity {
		//得到price
		int price=bookDao.getPrice(bid);
		//更新庫存
		bookDao.updateStock(bid);
		//更新錢包
		bookDao.updateWallet(wid, price);
	}
    @Transactional
	@Override
	public void buyMany(Integer wid, Integer... bids) throws InsufficientAmount  , InsufficientQuantity{
		for (int bid : bids) {
		    buyOne(wid, bid);
		}
		
	}
  
}
