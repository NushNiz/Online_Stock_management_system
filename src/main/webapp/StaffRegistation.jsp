<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


<meta charset="ISO-8859-1">
<title>Staff Register</title>
  <style>  
body {
  background-image: url('C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/reg.jpg');
  background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>

<script>  
function validateemail()  
{  
var x=document.myform.email.value;  
var ap=x.indexOf("@");  
var dp=x.lastIndexOf(".");  
if (ap<1 || dp<ap+2 || dp+2>=x.length){  
  alert("Please enter a valid e-mail address \n atpostion(@):"+ap+"\n dotposition(.):"+dp);  
  return false;  
  }  
}  
</script> 
 

</head>
<body>
<h1 style="margin-top:130px ; color:white ; text-shadow: 2px 2px #FF0000" ><center>Staff Registration Form</center></h1><hr>
<!-- Staff registation form -->
		<form  name="myform" action="SRegister" method = "post" onsubmit="return validateemail();">
	<table style="width:500px; margin-left:500px; margin-top:250px color:white" class="table table-hover table-dark">
	<tr><td>Staff Name    : </td><td><input type="text" name="sname"></td></tr>
	<tr><td>Password    : </td><td><input type="password" name="password"></td></tr>
	<tr><td>Staff E-mail  : </td><td><input type="text" name="email"></td></tr>
	<tr><td>Staff Address : </td><td><input type="text" name="address"></td></tr>
	<tr><td>Staff Phone   : </td><td><input type="text" name="phone" pattern="[0-9]{10}"></td></tr>
	<tr><td>Staff Type    : </td><td><input type="radio" name="stype" value="StockKeeper">Stock Keeper<br><input type="radio" name="stype" value="Agent">Agent</td></tr>
	<tr><td></td><td><input  class="btn btn-outline-primary" type="submit" value="Register"></td></tr>
	</table>
	</form>

</body>
</html>