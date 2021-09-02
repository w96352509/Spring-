package com.study.spring.case06.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateEmp {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
	JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);

	@Test
	public void test() {
        //case1();
		//case2();
		case3();
	}

	// 單筆新增
	public void case1() {
		String sql = "Insert into emp(ename,age) value(?,?)";
        jdbcTemplate.update(sql , "John1" , 12);
        System.out.println("新增成功");
	}

	// 多筆(<Object[]>)
	public void case2() {
		String sql = "Insert into emp(ename,age) value(?,?)";
		List<Object[]> list = new ArrayList<>();
		list.add(new Object[] {"vic",12});
		list.add(new Object[] {"vic1",13});
		int row[] = jdbcTemplate.batchUpdate(sql,list);
		System.out.println(Arrays.toString(row));

	}

	// 多筆(<Emp>)
	public void case3() {
		String sql = "Insert into emp(ename,age) value(?,?)";
		List<Emp> emps = Arrays.asList(
		 new Emp("vic2" ,12)
		,new Emp("vic3" ,13));
	BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter() {
		
		@Override
		public void setValues(PreparedStatement ps, int i) throws SQLException {
			ps.setString(1, emps.get(i).getEname());
			ps.setInt(2, emps.get(i).getAge());
			}
		
		@Override
		public int getBatchSize() {
			
			return emps.size() ;
		}
	};
	int[] rows = jdbcTemplate.batchUpdate(sql , setter);
	System.out.println("新增成功");
	}
}
