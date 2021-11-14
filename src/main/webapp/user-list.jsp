<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
<title>Stock Management System</title>




</head>
<body>

	<header>
		<!--  <nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: white">
			

			
		</nav>-->
	</header>
	<br>
	<div style="background-image: linear-gradient(#360033, #0b8793); margin-top:-25px;">

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
		<br><br>
		<h3   class="text-center" style="color:white;font-family: 'Courgette', cursive;font-family: 'Leckerli One', cursive;">STOCK LIST</h3>
			
			<hr>
			<div class="container text-left">
	
				<a href="<%=request.getContextPath()%>/list"  class="btn btn-outline-success" style="vertical-align:middle">View Stocks List</a>
			
				<a href="<%=request.getContextPath()%>/new" class="btn btn-outline-primary">Add	New Stock</a>
			</div>
			<br>
			<!-- reading stocks  -->
			<table class="table table-striped table-hover">
				<thead>
					<tr class="table-success">
						<th>ID</th>
						<th>Name</th>
						<th>Company</th>
						<th>Price</th>
						<th>Quantity</th>
						<th>Expire_Date</th>
						<th>Description</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="stock" items="${listUser}">

						<tr class="table-primary">
							<td ><c:out value="${stock.id}" /></td>
							<td><c:out value="${stock.name}" /></td>
							<td><c:out value="${stock.company}" /></td>
							<td><c:out value="${stock.price}" /></td>
							<td><c:out value="${stock.quantity}" /></td>
							<td><c:out value="${stock.exp_date}" /></td>
							<td><c:out value="${stock.discripition}" /></td>
							
							<td ><a  href="edit?id=<c:out value='${stock.id}' />" class="btn btn-primary">EDIT</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${stock.id}' />" class="btn btn-danger">DELETE</a></td>
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
	</div>
	<br><br>
	<center><a href="StaffHome.jsp"><button class="btn btn-outline-info">EXIT</button></a><br>
	<a href="adminHome.jsp"><button  style="background-color: Transparent;border: none; overflow: hidden;width:70px; transform:none; color:white">.</button></a></center>

</body>
</html>