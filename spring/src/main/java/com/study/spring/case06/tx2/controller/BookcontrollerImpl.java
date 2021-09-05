package com.study.spring.case06.tx2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.case06.tx2.Exeception.InsufficientAmount;
import com.study.spring.case06.tx2.Exeception.InsufficientQuantity;
import com.study.spring.case06.tx2.service.BookService;

@Controller
public class BookcontrollerImpl  implements Bookcontroller{
    @Autowired
	private BookService bookService;
	
	@Override
	public void buyBook(Integer wid, Integer bid) {
		try {
		bookService.buyOne(wid, bid);
		System.out.println("購買成功");
		} catch (InsufficientAmount  | InsufficientQuantity e) {
			System.out.println(e);
		}
		
		
	}

	@Override
	public void buyBooks(Integer wid, Integer... bids) {
		try {
			bookService.buyMany(wid, bids);
			System.out.println("購買成功");
			} catch (InsufficientAmount  | InsufficientQuantity e) {
				System.out.println(e);
			}
		
	}

}
