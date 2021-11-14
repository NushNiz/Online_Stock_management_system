<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Js list and getting parameters to be deleted -->
		<%
		String id= request.getParameter("id");
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String phone= request.getParameter("phone");
		String username=request.getParameter("uname");
		//String password=request.getParameter("pass");
	
	   %>
	   <h1>Admin Account Delete!</h1>
	   
	   <form action="aDelete" method="get">
	 <table class="table table-hover">
	 <!-- values are called as the above declared paras -->
		<tr>
		<td>Admin ID</td>
		<td> <input type="text" name="adid" value="<%=id%>" class="form-control" readonly></td>
		</tr>
		<tr>
		<td>Admin Name</td> 
		<td><input type="text" name="adname" value="<%=name%>" class="form-control" readonly></td>
		</tr>
		<tr>
		<td>Admin E-mail</td> 
		<td><input type="text" name="admail" value="<%=email%>" class="form-control" readonly></td>
		</tr>
		<tr>
		<td>Admin Phone</td> 
		<td><input type="text" name="adphone" value="<%=phone%>" class="form-control" readonly></td>
		</tr>
		<tr>
		<td>Admin Username</td> 
		<td><input type="text" name="aduname" value="<%=username%>" class="form-control" readonly></td>
		</tr>
		
		</table>
		<input type="submit" name="submit" value="Delete My Account" class="btn btn-danger"><br>
	</form>
</body>
</html>