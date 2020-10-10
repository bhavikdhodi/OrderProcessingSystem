package com.hsbc.service;

import com.hsbc.dao.EmployeeProfileDAO;
import com.hsbc.model.Employee;

/*
 * @author shubham kumar
 */


public class EmployeeProfileService {
	EmployeeProfileDAO employeeProfileDAO = new EmployeeProfileDAO();
	
	public Employee getEmployeeDetailsById(int employeeid) {
		return employeeProfileDAO.getEmployeeDetailsById(employeeid);
		
	}

}
