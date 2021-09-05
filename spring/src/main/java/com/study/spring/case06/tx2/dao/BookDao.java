package com.study.spring.case06.tx2.dao;

import com.study.spring.case06.tx2.Exeception.InsufficientAmount;
import com.study.spring.case06.tx2.Exeception.InsufficientQuantity;

public interface BookDao {
   Integer getPrice(Integer bid);
   Integer updateStock1(Integer bid) throws InsufficientAmount;
   Integer updateWalletInteger(Integer wid ,Integer money) throws InsufficientQuantity;
}
