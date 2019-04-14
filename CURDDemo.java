package com.itheima.c_dbutils.g_curd;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.itheima.utils.DataSourceUtils;

public class CURDDemo {
	@Test
	public void insert() throws SQLException {
		//创建queryrunner类
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		//2.编写sql
		String sql = "insert into catagory value(?,?)";
		//3.执行sql
		qr.update(sql,"c201","厨房电器");
		
	}
	
	@Test
	public void update() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql = "update catagory set cname = ? where cid = ? ";
		
		qr.update(sql,"大电器","c001");
	}
}
