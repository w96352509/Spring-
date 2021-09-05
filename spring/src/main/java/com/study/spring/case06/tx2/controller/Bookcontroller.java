package com.study.spring.case06.tx2.controller;

import com.study.spring.case06.tx.BuyBook;

public interface Bookcontroller {
    void buyBook(Integer wid , Integer bid);
    void buyBooks(Integer wid , Integer... bids);
}
