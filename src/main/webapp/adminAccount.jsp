<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Admin Account</title>
<style type="text/css">
	
	table,th,td{
		border: 1px solid black;
	}
</style>
</head>
<body>
<div style="background-image: linear-gradient(#360033, #0b8793); height:1000px;">
	<br><br>
	<!-- displaying all the details of the admin -->
	<center>
	<table class="table table-hover" style="background-color: #C9C9CB;width:1080px;margin-left:50px; margin-top:100px">
	<tr >
				<td colspan="2"><h1>Account &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminHome.jsp"><input type="button" name="show" value="Administrative authority" class="btn btn-outline-dark"></a>
				<a href="Home.jsp"><input type="button" name="logout"class="btn btn-outline-dark" value="Logout"></a><br><br>
				</h1></td>
			</tr >
	<c:forEach var="ad" items="${AdminDetails}"> 
	
	<c:set var="id" value="${ad.a_id}"/>
	<c:set var="name" value="${ad.a_name}"/>
	<c:set var="email" value="${ad.a_email}"/>
	<c:set var="phone" value="${ad.a_phone}"/>
	<c:set var="usern" value="${ad.a_userName}"/>
	<c:set var="passw" value="${ad.a_password}"/>
	

	<tr>
	<td>Admin Id </td>
	<td>${ad.a_id}</td>
	</tr>
	<tr>
	<td>Admin Name </td>
	<td>${ad.a_name}</td>
	</tr>
	<tr>
	<td>Admin E-mail </td>
	<td>${ad.a_email}</td>
	</tr>
	<tr>
	<td>Admin Phone</td>
	<td>${ad.a_phone}</td>
	</tr>
	<tr>
	<td>Admin UserName</td>
	<td>${ad.a_userName}</td>
	</tr>
	<tr>
	<td>Admin password</td>
	<td>${ad.a_password}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value="updateAdmin.jsp" var="adUpdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${usern}"/>
		<c:param name="pass" value="${passw}"/>
	</c:url>
	
	<a href="${adUpdate}">
	<input type="button" name="update" class="btn btn-secondary" value="Update My Data"/></a>
	
	
	<c:url value="deleteAdmin.jsp" var="adDelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${usern}"/>
		<c:param name="pass" value="${passw}"/>
	
	</c:url>

	<a href="${adDelete}"><input type="button" name="delete" class="btn btn-danger" value="Delete My Account"></a><br><br>
	<br>
	</div></center>
	
</body>
</html>