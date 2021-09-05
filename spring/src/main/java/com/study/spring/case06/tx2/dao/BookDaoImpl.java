package com.study.spring.case06.tx2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.spring.case06.tx2.Exeception.InsufficientAmount;
import com.study.spring.case06.tx2.Exeception.InsufficientQuantity;

@Repository
public class BookDaoImpl implements BookDao{
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	//取得價錢
	public Integer getPrice(Integer bid) { 
		String sql="Select price from book1 where bid=?";
		Object[] args = new Object[] {bid};
		return jdbcTemplate.queryForObject(sql, args , Integer.class);
	}

	@Override
	public Integer updateStock1(Integer bid)  throws InsufficientAmount{
		//檢查庫存
		String sql="Select amount from stock1 where bid=?";
		Object[] args=new Object[]{bid};
		int amount=jdbcTemplate.queryForObject(sql,args,Integer.class);
		if(amount<=0) {
		    throw new InsufficientAmount();
		}
		//更新庫存
		sql="update stock1 set amount= amount -1 where bid=?";
		return jdbcTemplate.update(sql, bid);
	}
    
	@Override
	public Integer updateWalletInteger(Integer wid, Integer money) throws InsufficientQuantity {
		//檢查庫存
		String sql = "Select money from wallet1 where wid=?" ;
		int moneyWallet=jdbcTemplate.queryForObject(sql,(new Object[] {wid}),Integer.class);
		if(moneyWallet<money) {
			throw new InsufficientQuantity();
		}
		
		//更新庫存
		sql ="update wallet1 set money= money -? where wid=?";
		Object[] args= new Object[] {money , wid};
		return jdbcTemplate.update(sql,args);
	}

}
