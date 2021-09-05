package com.study.spring.case06.tx.eception;

import com.github.javafaker.Superhero;

public class InsufficientAmount extends Throwable{
 public InsufficientAmount() {
	 super("錢包不足");
 }
}
