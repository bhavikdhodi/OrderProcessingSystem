package com.hsbc.model.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection con;
	static String databaseName = "op";
	static String url = "jdbc:mysql://localhost:3306/" + databaseName;
	static final String dbusername = "root";
	static final String dbpassword = "root";

	public static Connection getConnection()
			throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		System.out.println("Connecting to a selected database...");
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url, dbusername, dbpassword);
		System.out.println("Connected database successfully...");
		
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select *from phonebook");
//
//		while (rs.next())
//			System.out.println(rs.getString("name") + "  " + rs.getString("phone_number") + "  ");

		return con;

	}

}
