package com.hsbc.model.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.hsbc.model.beans.Product;
import com.hsbc.model.service.ProductJson;


public class JSONProductsDB {
	
	private Connection con=null;
	private PreparedStatement pstmt = null;
	
	public void addProductsToDB()
	{
		try {
		con = DBConnection.getConnection();
		List<Product> products=new ProductJson().readJsonFile();
		for(Product product:products)
		{
			
			String sql = "INSERT INTO products(productid, name, price,category) VALUES (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product.getProdId());
			pstmt.setString(2, product.getName());
			pstmt.setDouble(3, product.getPrice());
			pstmt.setString(4, product.getCategory());
			pstmt.executeUpdate();
			//System.out.println(product +"\nInserted records into the table...");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
