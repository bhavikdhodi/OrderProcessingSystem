<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align: center;color: #ef241c;"> logout successfull !!</h2>

<%
String errormsg=(String)request.getAttribute("errormsg");
if(errormsg!=null){
	out.println(errormsg);
}
%>
</body>
</html>