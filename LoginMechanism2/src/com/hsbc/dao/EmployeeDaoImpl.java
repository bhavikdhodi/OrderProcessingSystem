package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.JDBC.DBConnection;
import com.hsbc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	DBConnection db= new DBConnection();
	
	@Override
	public boolean employeeLoginValidate(Employee employee) {
		// TODO Auto-generated method stub
		PreparedStatement pst= db.getPreparedStatement("select * from employee where employeeid=? and password=?");
		boolean status = false;
		try {
			pst.setInt(1, employee.getEmployeeid());
			pst.setString(2, employee.getPassword());
			
			ResultSet rs= pst.executeQuery();
			status=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.closeConnection();
		}
		return status;
	
	}
	

}
