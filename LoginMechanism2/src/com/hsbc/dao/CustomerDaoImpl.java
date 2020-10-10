package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.JDBC.DBConnection;
import com.hsbc.JDBC.DBUtility;
import com.hsbc.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	DBConnection db= new DBConnection();
	
	@Override
	public boolean customerLoginValidate(Customer customer)
	{
		PreparedStatement pst= db.getPreparedStatement("select * from  customers where customerid=? and password=?");
		boolean status = false;
		try {
			pst.setInt(1, customer.getCustomerid());
			pst.setString(2, customer.getPassword());
			
			ResultSet rs= pst.executeQuery();
			status=rs.next();
			return status;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.closeConnection();
		}
		return status;
	}

	@Override
	public Customer getCustomer(int customerId) {
		Customer customer = new Customer();
				try {
					Connection connection  = DBUtility.getConnection();
					String Query  = "select * from customers where customerId = "+customerId;
					PreparedStatement preparedStatement =  connection.prepareStatement(Query);
					ResultSet resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()) {
						customer.setCustomerid((int)resultSet.getInt(1));
						customer.setName(resultSet.getString(2));
						customer.setAddress(resultSet.getString(3));
						customer.setMail(resultSet.getString(4));
						customer.setCity(resultSet.getString(5));
					}	
					preparedStatement.close();
					connection.close();			
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
				return customer;
	}

	

}
