package com.study.spring.case06.tx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectAll {
	public static void main(String[] args) {
      ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config2.xml");
      JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
      //查詢位置
      String sql ="Select * from book1";
      System.out.println(jdbcTemplate.queryForList(sql));
      sql ="Select * from wallet1";
      System.out.println(jdbcTemplate.queryForList(sql));
      sql ="Select * from stock1";
      System.out.println(jdbcTemplate.queryForList(sql));
      
	}
}
