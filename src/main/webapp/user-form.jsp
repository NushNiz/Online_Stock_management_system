

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Stock Management System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	 

</head>
<body>
	
	<header>
		
	</header>
	
	<div style="background-image: linear-gradient(#360033, #0b8793);">
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${stock != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${stock == null}">
					<form action="insert" method="post">
				</c:if>
	<!-- Edit Stock Details Button -->
				<caption>
					<h2  style="color:blue">
						<c:if test="${stock != null}">
            			Edit Stock
            		</c:if>
						<c:if test="${stock == null}">
            			<center>Add	New Stock</center> <!-- Add new stock details button -->
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            		<a href="<%=request.getContextPath()%>/list" class="btn btn-outline-info">View Stocks list</a>
  						
						
            		</c:if>
					</h2>
					<hr>
					
					<!-- Stock insert form -->
	
				</caption>
	
				<c:if test="${stock != null}">
					<input type="hidden" name="id" value="<c:out value='${stock.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Stock Name</label> <input type="text"	value="<c:out value='${stock.name}' />" class="form-control" name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Stock Company</label> <input type="text" 	value="<c:out value='${stock.company}' />" class="form-control"	name="company">
				</fieldset>

				<fieldset class="form-group">
					<label>Stock Price</label> <input type="text"	value="<c:out value='${stock.price}' />" class="form-control" name="price">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Stock Quantity</label> <input type="text"	value="<c:out value='${stock.quantity}' />" class="form-control" name="quantity">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Stock Expire_Date</label> <input type="text"	value="<c:out value='${stock.exp_date}' />" class="form-control" name="exp_date">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Stock Description</label> <input type="text"	value="<c:out value='${stock.discripition}' />" class="form-control" name="discripition">
				</fieldset>

				<center><button type="submit"  class="btn btn-outline-primary">SAVE</button></center>
				</form>
			</div>
			</div>
		</div>
	</div>
</body>
</html>