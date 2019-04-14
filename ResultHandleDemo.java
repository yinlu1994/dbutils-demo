package com.itheima.c_dbutils.g_curd;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.itheima.domain.Category;
import com.itheima.utils.DataSourceUtils;

public class ResultHandleDemo {
	@Test
	public void arrayHandler() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		 String sql = "select * from catagory";
		 
		 Object[] query = qr.query(sql, new ArrayHandler());//查询操作，第二个参数是封装成什么样的结果
		 System.out.println(Arrays.toString(query));
		 
		 Category bean = qr.query(sql, new BeanHandler<>(Category.class));
		 System.out.println(bean);
		 
		 java.util.List<Category> list = qr.query(sql, new BeanListHandler<>(Category.class));
		 
		 for(Category bean2 : list) {
			 System.out.println(bean2);
		 }
		 
		 Map<String,Object> map = qr.query(sql, new MapHandler());
		 List< Map<String,Object> > maplist = qr.query(sql, new MapListHandler());
		 for(Map<String,Object> map2 : maplist) {
			 System.out.println(map2);
		 }
		 
		 String sql2 = "select count(*) from catagory";
		 Object obj = qr.query(sql2, new ScalarHandler());
		 System.out.println(obj);//返回类型是long值
	}
	
}
