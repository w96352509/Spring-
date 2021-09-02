package com.study.spring.case05.dancer;

import java.util.Date;

public class Dancer implements Performance{

	@Override
	public void perform() {
		System.out.println("開始跳舞");
		if (new Date().getTime()%3==0) {
			throw new RuntimeException("舞者起飛了");
		}
		
	}

}
