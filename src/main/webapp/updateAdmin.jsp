<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Update admin details</title>

<style type="text/css">
	body{
		font-family: Hind Semibold;
		background-image: url('C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/updateEmp.jpg');
		background-repeat: no-repeat;
		background-attachment: fixed;
	    background-size: cover;
	}
	
</style>
</head>
<body>
<!-- js validation and getting parameters to be updated -->
	<%
		String id= request.getParameter("id");
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String phone= request.getParameter("phone");
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
	
	%>

	<h1>Admin Account Update!!</h1>

	<form action="aUpdate" method="POST">
	 <table class="table table-striped">
	 <!-- calling the values as declared js variables -->
		<tr>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Admin ID</td>
		<td><div class="col-md-6"><input type="text" name="adid" value="<%=id%>" class="form-control" width="450px" readonly></div></td>
		</tr>
		<tr>
		<td>Admin Name</td> 
		<td><div class="col-md-6"><input type="text" name="adname" value="<%=name%>" class="form-control" width="450px"></div></td>
		</tr>
		<tr>
		<td>Admin E-mail</td> 
		<td><div class="col-md-6"><input type="text" name="admail" value="<%=email%>" class="form-control" width="450px"></div></td>
		</tr>
		<tr>
		<td>Admin Phone</td> 
		<td><div class="col-md-6"><input type="text" name="adphone" value="<%=phone%>" class="form-control" width="450px"></div></td>
		</tr>
		<tr>
		<td>Admin Username</td> 
		<td><div class="col-md-6"><input type="text" name="aduname" value="<%=username%>" class="form-control" width="450px"></div></td>
		</tr>
		<tr>
		<td>Admin Password</td> 
		<td><div class="col-md-6"><input type="password" name="adpass" value="<%=password%>" class="form-control" width="450px"></div></td>
		</tr>
		
		</table>
		<center><input type="submit" name="submit" value="Update My Data" class="btn btn-outline-dark"></center><br>
	</form>
</body>
</html>