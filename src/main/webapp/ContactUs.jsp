<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Importing Style Sheet Link -->
<link rel="stylesheet"
	  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	  crossorigin="anonymous">


<title>Contact US</title>

<!-- Style For Background -->
  <style>  
body {
  background-image: url('C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/qw.jpg');
}
</style>

<!--Java Script Validation for E-mail  -->
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

	<h1 style="margin-top:130px ; color:white ; text-shadow: 2px 2px #FF0000" ><center>Contact Us</center></h1><hr>
	<!--/*Contact us Form Creation*/  -->
	<form name="myform" action="contactUsServlet" method = "post" onsubmit="return validateemail();">
	<fieldset style=" color:red">
	<table style="width:500px; margin-left:500px; margin-top:80px color:white" class="table table-hover table-dark">
	<tr  class="table-active"><td>First Name    : </td><td><input type="text" name="fname" required></td></tr>
	<tr  class="table-active"><td>Last Name     : </td><td><input type="text" name="lname" required></td></tr>
	<tr  class="table-active"><td>E-mail 		   : </td><td><input type="text" name="email" ></td></tr>
	<tr class="table-active"><td>Phone 		   : </td><td><input type="text" name="phone" pattern="[0-9]{10}"></td></tr>
	<tr  class="table-active"><td>Message 	   : </td><td><input type="text" name="message" required></td></tr>
	
	<tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="btn btn-outline-warning" type="submit" value="SUBMIT"></td></tr>
	</table></fieldset>
	</form>
	&nbsp;&nbsp;<center><a href="Home.jsp"><input type="submit" Value = "EXIT" class="btn btn-outline-danger"></a></center>
</body>
</html>