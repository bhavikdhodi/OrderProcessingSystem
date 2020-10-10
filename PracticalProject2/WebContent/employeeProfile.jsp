<%@page import="com.hsbc.model.Employee"%>
<%@page import="com.hsbc.service.EmployeeProfileService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! EmployeeProfileService employeeProfileService = new EmployeeProfileService();
%>

<%
Employee employee = employeeProfileService.getEmployeeDetailsById((int)session.getAttribute("empoyeeid"));
%>
<%= employee.getEmployeeid()+"/n"+employee.getName() %>

</body>
</html>