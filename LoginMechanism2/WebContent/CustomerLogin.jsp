<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body background="Background.png">
<br>
<br>
    <div class="container-fluid">
        <center>
            <img style="height: 300px; width: 300px "  src = "logo.png"> 
            <div margin:top = "3cm">
            <table style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif, Helvetica, cursive; padding-inline-start:1cm; padding-inline-end: ;">
            <form action = "CustomerLoginServlet" method = "POST">
            
            <tr style="margin-top:1cm;">
                <div class="form-group" >
                  <th><label for="customerid"> <h3> Customer Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3></label></th>
                  <td><input style=" border-radius:8px; background-color: white; color: #ef241c; border: 1px solid #ffffff;" type="text" name = "customerid" class="form-control" id="customerid" aria-describedby="emailHelp" placeholder="Enter Customer Id"></td>
             </div>
            <tr style="margin-top:1cm;"> 
                <div class="form-group" >
                    <th><label for="password"><h3>Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3></label></th>
                        <td><input style="border-radius:8px; background-color: white; color: #ef241c; border: 1px solid #ffffff;" type="password" name = "password" class="form-control" id="password" placeholder="Password"></td>
                  
                </div>
            </tr>
            <tr>
                <th>
            <div class="form-group form-check" style="margin-top:0cm;">
                <input style="background-color: white; color:#ef241c; border: 1px solid #ffffff;" type="checkbox"  id="exampleCheck1"></th>
                <td><label class="form-check-label" for="exampleCheck1"><h5>I'm a human.</h5></label></td>
            
            </tr>
            <tr><th>
            
            <button style=" margin-top: 1 cm; background-color: white; color: #ef241c; border: 2px solid #ffffff; border-radius: 8px;" type="submit" class="btn btn-primary" > Submit </button></th></tr>
            </form>
            </table>
              </div>
            <%               
            String str1=(String) request.getAttribute("errormsg");
                if(str1!=null)
                {%>
                	<h3 style="margin-top: 2cm; color:#ffffff"><%out.print(str1);
                }
                %>
            

            <h3><marquee style="margin-top:1cm; color:#ffffff;">Notice:</marquee></h3> 
        </div>
    </center>
      </div>
    
</body>
</html>