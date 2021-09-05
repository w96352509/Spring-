package com.study.spring.case06.tx.eception;

import com.github.javafaker.Superhero;

public class InsufficientQuantity extends Throwable{
 public InsufficientQuantity() {
	 super("庫存不足");
 }
}
