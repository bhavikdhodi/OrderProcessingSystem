package com.hsbc.dao;
/*
 * @author shubham kumar
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.JDBC.DbConnection;
import com.hsbc.model.Employee;

public class EmployeeProfileDAO {
	
	DbConnection db = new DbConnection();
	boolean sessionStatus = false;
	
	public Employee getEmployeeDetailsById(int employeeid) {
		Employee employee = new Employee();
		PreparedStatement pst= db.getPreparedStatement("select * from employee where employeeid=?");
		
		try {
			pst.setInt(1, employee.getEmployeeid());
			ResultSet rs= pst.executeQuery();
			sessionStatus = rs.next();
			
			employee.setName(rs.getString("NAME"));
			employee.setEmployeeid(rs.getInt("EMPLOYEEID"));
			// have to add last logged in details as well.
			//*****************************************
			return employee;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
		
	}

}
