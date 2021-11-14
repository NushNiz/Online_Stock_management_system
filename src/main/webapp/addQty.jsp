<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
    <link rel="stylesheet"  type="text/css" href="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"  href="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/css/bootstrap1.min.css">
    <!-- Style -->
    <link rel="stylesheet" type="text/css" href="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/css/style.css">
    <link rel="stylesheet" type="text/css" href="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/css/style1.css">
	<link rel="stylesheet" type="text/css" href="https://www.w3schools.com/w3css/4/w3.css">
	
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500&display=swap" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css?family=Source+Serif+Pro:400,600&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>

	* {
	  box-sizing: border-box;
	}
	
	.addQty{
		position:relative;
	    width: auto;
		padding: 350px;
	}

	.login-box {
	  position: absolute;
	  top: 75%;
	  left: 50%;
	  width: 400px;
	  padding: 40px;
	  transform: translate(-50%, -50%);
	  background: rgba(0,0,0,.5);
	  box-sizing: border-box;
	  box-shadow: 0 15px 25px rgba(0,0,0,.6);
	  border-radius: 10px;
	}
	
	.login-box h2 {
	  margin: 0 0 30px;
	  padding: 0;
	  color: #fff;
	  text-align: center;
	}
	
	.login-box .user-box {
	  position: relative;
	}
	
	.login-box .user-box input {
	  width: 100%;
	  padding: 8px 0;
	  font-size: 16px;
	  color: #fff;
	  margin-bottom: 30px;
	  border: none;
	  border-bottom: 1px solid #fff;
	  outline: none;
	  background: transparent;
	}
	.login-box .user-box label {
	  position: absolute;
	  top:0;
	  left: 0;
	  padding: 10px 0;
	  font-size: 16px;
	  color: white;
	  pointer-events: none;
	  transition: .5s;
	}
	.label{
	  font-size: 16px;
	  color: #dbd5c4;
	}
	.pricelabel{
	  font-size: 12px;
	  color: #cfc6b0;
	}
	.button{
	  background-color:: #808080;
	}
	.cartbtn {
	  background-color: Transparent;
	  border: none;
	  color: #fff;
	  padding: 5px 20px;
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  margin: 4px 2px;
	  cursor: pointer;
	  border-radius: 30px;
	}
	.cartbtn:hover {
	  background-color: #007bff;
	}
	.productsbtn {
	  background-color: Transparent;
	  border: none;
	  color: #fff;
	  padding: 5px 20px;
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  margin: 4px 2px;
	  cursor: pointer;
	  border-radius: 30px;
	}
	
	.productsbtn:hover {
	  background-color: #007bff;
	}
</style>
<title>Products</title>
</head>
<body>
<div style="background-image: linear-gradient(#360033, #0b8793); height:1000px;">
<!--Header-->

    <div class="site-mobile-menu">
      <div class="site-mobile-menu-header">
      
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div>
	 
    <header class="site-navbar" role="banner">
	
      <div class="container">
     
        <div class="row align-items-center">
         
          <div class="col-11 col-xl-2">
            <!-- <h1 class="mb-0 site-logo"><a href="index.html" class="text-white mb-0">Manage Products Online </a></h1> -->
           </div>
          <div class="col-12 col-md-10 d-none d-xl-block">
 
        
	 	 <nav class="site-navigation position-relative text-right" role="navigation">

              <ul class="site-menu js-clone-nav mr-auto d-none d-lg-block">
                <li><a href="CustomerLoginHome.jsp"><span>Home</span></a></li>
                <li>
                  <a href="Home.jsp"><span>Logout</span></a>
                </li>
                 <li>
                	<form action="productlog" method="post">
				        <button class="productsbtn" type="submit" name="products" value="products"><span>Products</span></button>
					</form>
                </li>
                <li><a href="AboutUS.jsp"><span>About Us</span></a></li>
                <li><a href="ContactUs.jsp"><span>Contact Us</span></a></li>
                <li>
                	<form action="viewCart" method="post">
       					<button class="cartbtn" type="submit" name="viewCart" value="products"><i class="fa fa-shopping-cart"></i></button>
					</form>
                </li>
              </ul>
            </nav>
          </div>


          <div class="d-inline-block d-xl-none ml-md-0 mr-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-white"><span class="icon-menu h3"></span></a></div>

          </div>
          
        </div>

    </header>

	<!--end of header-->

	<% 
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String price = request.getParameter("price");
	%>
	
	<div class="addQty">	
	<div class="login-box">
	  <h2>Add Item Quantity</h2>
	  
	  <form action="addQuantity" method="post">
	  <label class="label">Item Name</label>
	    <div class="user-box">
	      <input type="hidden" name="id" value="<%=id %>"/>
		  <input type="text" name="name" value="<%=name %>" readonly/>
	    </div>
	    
	    <label class="label">Manufactured Company</label>
	    <div class="user-box">
		  <input type="text" name="company" value="<%=company %>" readonly/>
	    </div>
	    
	    <label class="label">Price</label>
	    <label class="pricelabel">(Rs.)</label>
	    <div class="user-box">
		  <input type="text" name="price" value="<%=price %>"/>
	    </div>
	    
	    <label class="label">Quantity</label>
	    <div class="user-box">
		  <input type="number" min="1" name="quantity" placeholder="Enter Quantity" required/>
	    </div>
	     <button type="submit" name="add" value="add" class="btn btn-primary btn-block btn-large" onclick="alert('Added to the Cart')">Add To Cart</button>
	    
	  </form>
	</div>
	</div>	
	</div>
<!--footer-->

 <footer class="footer-48201">
      
      <div class="container">
        <div class="row">
          <div class="col-md-4 pr-md-5">
            <a href="#" class="footer-site-logo d-block mb-4"><img src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/logo.png" style="width:300px; height:300px"></a>
            <p>According to our extensive experience, we can honestly say that Kings Peak Stock management solutions are world-class and, by far, the most comprehensive in the industry.</p>
          </div>
          <div class="col-md">
            <ul class="list-unstyled nav-links">
              <li><a href="Home.jsp">Home</a></li>
              <li><a href="AboutUS.jsp">About Us</a></li>
              <li><a href="ContactUs.jsp">Contact Us</a></li>
            </ul>
          </div>
          <div class="col-md">
            <ul class="list-unstyled nav-links">
              <li><a href="ContactUs.jsp">Clients</a></li>
              <li><a href="AboutUS.jsp">Team</a></li>
              <li><a href="AboutUS.jsp">Career</a></li>
             
            </ul>
          </div>
          <div class="col-md">
            <ul class="list-unstyled nav-links">
              <li><a href="AboutUS.jsp">Privacy Policy</a></li>
              <li><a href="AboutUS.jsp">Terms &amp; Conditions</a></li>
              
            </ul>
          </div>
          <div class="col-md text-md-center">
            <ul class="social list-unstyled">
              <li><a href="https://www.instagram.com/"><span class="icon-instagram"></span></a></li>
              <li><a href="https://twitter.com/BillGates"><span class="icon-twitter"></span></a></li>
              <li><a href="https://www.facebook.com/"><span class="icon-facebook"></span></a></li>
              <li><a href="https://www.pinterest.com/login/"><span class="icon-pinterest"></span></a></li>
              
            </ul>
            <p class=""><a href="ContactUs.jsp" class="btn btn-tertiary">Contact Us</a></p>
            <p class=""><a href="Feedback.jsp" class="btn btn-tertiary">Feedback</a></p>
          </div>
        </div> 

        <div class="row ">
          <div class="col-12 text-center">
            <div class="copyright mt-5 pt-5">
              <p><small>&copy; 2021 All Rights Reserved by Kings Peak.</small></p>
            </div>
          </div>
        </div> 
      </div>
      
    </footer>
	</div>
	<!--end of footer-->
	
	<script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery1-3.3.1.min.js"></script>
    <script src="js/popper1.min.js"></script>
    <script src="js/bootstrap1.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    <script src="js/main.js"></script>

</body>
</html>