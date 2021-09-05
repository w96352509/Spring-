package com.study.spring.case06.tx2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	//取得價錢
	public Integer getPrice(Integer bid) { 
		String sql="Select price from where bid=?";
		Object[] args = new Object[] {bid};
		return jdbcTemplate.queryForObject(sql, args , Integer.class);
	}

	@Override
	public Integer updateStock1(Integer bid) {
		//檢查庫文
		String sql="Select amount from book1 where bid=?";
		Object[] args=new Object[]{bid};
		int amount=jdbcTemplate.queryForObject(sql,args,Integer.class);
		
		//更新庫存
		sql="updata stock set amount= amount -1 where bid=?";
		return jdbcTemplate.update(sql, bid);
	}
    
	@Override
	public Integer updateWalletInteger(Integer wid, Integer money) {
		String sql ="updata wallet set price= price -? where wid=?";
		Object[] args= new Object[] {wid , money};
		return jdbcTemplate.update(sql,args);
	}

}
