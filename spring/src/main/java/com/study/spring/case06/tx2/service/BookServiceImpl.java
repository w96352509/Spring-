package com.study.spring.case06.tx2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.case06.tx2.Exeception.InsufficientAmount;
import com.study.spring.case06.tx2.Exeception.InsufficientQuantity;
import com.study.spring.case06.tx2.dao.BookDao;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
	private BookDao bookDao;
	
    @Transactional(
    		rollbackFor = {InsufficientAmount.class,InsufficientQuantity.class}
    		)
	@Override
	public void buyOne(Integer wid, Integer bid) throws InsufficientAmount, InsufficientQuantity {
		
    	
    	//抓取金額
		int price=bookDao.getPrice(bid);
		//更新庫存
		bookDao.updateStock1(bid);
		
		//運算(減金額)
		bookDao.updateWalletInteger(wid, price);
	}
    @Transactional(
    //rollbackFor = {InsufficientAmount.class,InsufficientQuantity.class}
    		)
    //buyOne:綁定Transactional 套用上方設定
	@Override
	public void buyMany(Integer wid, Integer... bids) throws InsufficientAmount, InsufficientQuantity {
		for (int bid : bids) {
			buyOne(wid, bid);
		}
		
	}

}
