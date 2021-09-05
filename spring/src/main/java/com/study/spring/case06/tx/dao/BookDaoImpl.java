package com.study.spring.case06.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.spring.case06.tx.eception.InsufficientAmount;
import com.study.spring.case06.tx.eception.InsufficientQuantity;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer getPrice(Integer bid) {

		String sql = "Select price from book where bid=?";
		Object[] args = new Object[] { bid };
		return jdbcTemplate.queryForObject(sql, args, Integer.class);
	}

	@Override
	public Integer updateStock(Integer bid) throws InsufficientQuantity {
		// 新增檢查庫存
		String sql = "Select amount from Stock where bid=?";
		Object[] args = new Object[] { bid };
		int amount = jdbcTemplate.queryForObject(sql, args, Integer.class);
        if (amount<=0) {
			throw new InsufficientQuantity();
		}
		// 更新
		sql = "update stock set amount = amount - 1 where bid=?";
        return jdbcTemplate.update(sql, args);
	}

	@Override
	public Integer updateWallet(Integer wid, Integer money) throws InsufficientAmount {
		// 新增檢查錢包
		String sql = "Select money from wallet where wid=?";
		Object[] args = new Object[] { wid };
		int wallentMoney=jdbcTemplate.queryForObject(sql, args,Integer.class);
		if (wallentMoney<money) {
			throw new InsufficientAmount();
		}
		//更新
		sql = "update wallet set money = money - ? where wid=?";
		 args = new Object[] { money, wid };
		return jdbcTemplate.update(sql, args);
	}

}
