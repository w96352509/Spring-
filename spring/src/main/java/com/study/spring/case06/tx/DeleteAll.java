package com.study.spring.case06.tx;

import java.time.chrono.MinguoChronology;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteAll {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);

		String sql = "Delete from book where bid=?";
		//System.out.println(jdbcTemplate.update(sql,2));
		sql = "Delete from stock where sid=?";
		System.out.println(jdbcTemplate.update(sql,2));
		sql = "Delete from wallet where wid=?";
		System.out.println(jdbcTemplate.update(sql,2));
	}
}
