package com.study.spring.case06.tx2.Exeception;

public class InsufficientQuantity extends Throwable {
   public InsufficientQuantity() {
	   super("金額不足");
   }
}
