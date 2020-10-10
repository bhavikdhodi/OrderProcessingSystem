package com.hsbc.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	Connection con;
	Statement st;
	PreparedStatement pst;

	public DbConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		try {
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/OP;","aakash","aakash123");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public PreparedStatement getPreparedStatement(String sql) {
		try {
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/OP;","aakash","aakash123");
			pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}