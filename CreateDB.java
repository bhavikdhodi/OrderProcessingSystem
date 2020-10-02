package com.hsbc.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author NEHA BALASUBRAMANIAN
 * 
 * DATABASE CREATION
 *
 */
public class CreateDB{
	public static void main(String[] args) {
	try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OP;create=true");

			Statement st = con.createStatement();

			//st.execute("CREATE TABLE customer(customerId INTEGER PRIMARY KEY, customerName VARCHAR(20), customerGSTNumber NUMBER(15), customerAddress VARCHAR(30), customerCity varchar(10), email VARCHAR(25), phone NUMBER(10), PIN NUMBER(6))");
			
			//st.execute("CREATE TABLE product(productID INTEGER PRIMARY KEY, productName VARCHAR(10), price INTEGER, categoryID INTEGER, orderID INTEGER, FOREIGN KEY(orderID) references orders(orderID);");
			
			//st.execute("CREATE TABLE orders(orderID INTEGER PRIMARY KEY, dateOfOrder DATE, customerId INTEGER, productIDList VARCHAR(200), totalOrderValue INTEGER, (shippingCost INTEGER)..can we do this in service layer?, Agency VARCHAR(10), status VARCHAR(20), FOREIGN KEY (customerId) REFERENCES customer(customerId))");
			
			//st.execute("CREATE TABLE invoice(invoiceID INTEGER PRIMARY KEY, orderID INTEGER, customerId INTEGER, GSTtype varchar(10), GSTamount INTEGER, totalValue INTEGER, status varchar(10), FOREIGN KEY (customerId) REFERENCES customer(customerId), FOREIGN KEY (orderId) REFERENCES orders(orderId))");
			/*
			*
			//st.execute("create table users(CREATE TABLE category(categoryID INTEGER, level INTEGER)");
			*	usecase of this table?
			*	
			*/
			//st.execute("CREATE TABLE company(companyID INTEGER primary key, companyName VARCHAR(15), companyAddress VARCHAR(30), companyCity varchar(10), companyGSTNumber NUMBER(15))");
			
			//st.execute("CREATE TABLE employee(employeeID INTEGER primary key, username VARCHAR(10), password VARCHAR(10))");
			
			
			con.close();
			
		} catch (ClassNotFoundException ex1) {
			// TODO Auto-generated catch block
			ex1.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}
	
}

	



