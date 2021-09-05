package com.study.spring.case06.tx2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao1Impl implements Book1Dao{
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer getPrice(Integer bid) {
		String sql="Select price from where bid=?";
		Object[] args = new Object[] {bid};
		return jdbcTemplate.queryForObject(sql, args , Integer.class);
	}

	@Override
	public Integer updateStock1(Integer bid) {
		String sql="updata stock set amount= amount -1 where bid=?";
		Object[] args=new Object[]{bid};
		return jdbcTemplate.update(sql, bid);
	}
    
	@Override
	public Integer updateWalletInteger(Integer wid, Integer money) {
		String sql ="updata wallet set price= price -? where wid=?";
		Object[] args= new Object[] {wid , money};
		return jdbcTemplate.update(sql,args);
	}

}
