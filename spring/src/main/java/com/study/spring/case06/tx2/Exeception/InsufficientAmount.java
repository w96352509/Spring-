package com.study.spring.case06.tx2.Exeception;

public class InsufficientAmount extends Throwable {
   public InsufficientAmount() {
	   super("庫存不足");
   }
}
