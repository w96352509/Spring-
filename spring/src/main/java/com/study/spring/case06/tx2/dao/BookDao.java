package com.study.spring.case06.tx2.dao;

public interface BookDao {
   Integer getPrice(Integer bid);
   Integer updateStock1(Integer bid);
   Integer updateWalletInteger(Integer wid ,Integer money);
}
