package com.hsbc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.EmployeeDaoImpl;
import com.hsbc.model.Employee;

/**
 * Servlet implementation class EmployeeLoginServlet
 */
@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		int employeeid=Integer.parseInt(request.getParameter("empid"));
		String password= request.getParameter("password");
		Employee employee= new Employee();
		employee.setEmployeeid(employeeid);
		employee.setPassword(password);
		EmployeeDaoImpl employeelogin= new EmployeeDaoImpl();
		if(employeelogin.employeeLoginValidate(employee))
		{
			RequestDispatcher rd= request.getRequestDispatcher("ProfileServlet");
			rd.forward(request, response);
			
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("EmployeeLogin.jsp");
			request.setAttribute("errormsg", " Incorrect Employee Id or Password!!");
			rd.forward(request, response);
		}
		}
		catch (NumberFormatException e) {
			RequestDispatcher rd= request.getRequestDispatcher("EmployeeLogin.jsp");
			request.setAttribute("errormsg", "Please enter Employee Id and Password!");
			rd.forward(request, response);
		}
	}

}

