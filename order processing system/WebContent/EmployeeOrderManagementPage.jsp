<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style type="text/css">
	</style>
<title>Hello, world!</title>
</head>
  <body>
  <% if(session == null){
	  RequestDispatcher rd = request.getRequestDispatcher("LogoutPage.jsp");
	  request.setAttribute("errormsg", "session expired login again!!");
	  rd.forward(request, response);
	  }%>
  
    <h1 style="color: #ef241c;">EMPLOYEE ORDER MANAGEMENT PAGE!</h1>
    <div>
    <DIV>  
	<jsp:include page="EmployeeProfile.jsp" />  
	</DIV>
	<div>
	<a href="LogoutServlet"><button>Log out</button></a>
	</div>
	</div>
	
</body>
</html>

