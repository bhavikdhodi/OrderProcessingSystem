package com.hsbc.JDBC;

import com.hsbc.dao.JdbcProductDao;
import com.hsbc.service.ProductServiceImpl;

public class ProductFactory {
	
	public static Object getInstance(String type) {
		if(type.equals("dao"))
			return new JdbcProductDao();
		if(type.equals("service"))
			return new ProductServiceImpl();
		
		return null;
	
	}
}