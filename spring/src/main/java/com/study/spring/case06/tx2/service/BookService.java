package com.study.spring.case06.tx2.service;

import com.study.spring.case06.tx2.Exeception.InsufficientAmount;
import com.study.spring.case06.tx2.Exeception.InsufficientQuantity;

public interface BookService {
  void buyOne(Integer wid , Integer bid) throws InsufficientAmount , InsufficientQuantity;
  void buyMany(Integer wid , Integer... bids) throws InsufficientAmount , InsufficientQuantity;
  
}
