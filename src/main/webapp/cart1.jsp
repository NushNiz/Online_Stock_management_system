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
	 
	html,
	body {
		  background-color: #000000;
		  font-family: 'Roboto', sans-serif;
	}
	.cart{
		position: relative;
	    width:auto;
	    padding: 130px;
		padding-bottom: 20px;
		padding-left: 300px;
	}
	
	.shopping-cart {
		  position: relative;
		  width: 850px;
		  background: rgba(75,55,28,0.7);
		  box-shadow: 1px 2px 3px 0px rgba(0,0,0,0.10);
		  border-radius: 6px;
		  display: flex;
		  flex-direction: column;
	
		  border: 1px solid #c8a951;
	}
	.title {
		  height: 60px;
		  border-bottom: 1px solid #c8a951;
		  padding: 20px 30px;
		  color: #c8a951;
		  font-size: 18px;
		  font-weight: 400;
	}
 
	.item {
		  padding: 20px 30px;
		  height: 140px;
		  display: flex;
	}
 
	.item {
		  border-top:  1px solid #cc9966;
	}
	.image {
 		 margin-right: 50px;
	}
	.description {
		  padding-top: 1px;
		  padding-left: 5px;
		  margin-right: 65px;
		  width: 115px;
	}
	 
	.description span {
		  display: block;
		  font-size: 14px;
		  color: #fff4c2;
		  font-weight: 400;
	}
	 
	.description span:first-child {
	  	margin-bottom: 5px;
	  	font-size: 20px;
	}
	.description span:last-child {
		  font-weight: 300;
		  margin-top: 8px;
		  color: #997950;
	}
	.button {
		  border-radius: 4px;
		  transition-duration: 0.4s;
		  padding: 16px;
		  background-color: #9c7550;
		  color: black;
		  border: 2px solid #9c7550;
	}
	.button:hover {
		background-color: #dac17c;
	}
	.total-price {
		  width: 200px;
		  padding-top: 27px;
		  text-align: left;
		  font-size: 18px;
		  color: #fff4c2;
		  font-weight: 300;
	}
	.buttonPosition{
		  padding: 15px 8px;
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
<title>Shopping Cart</title>
</head>
<body>
<div style="background-image: linear-gradient(#360033, #0b8793); height:2000px;">
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
                  <a href="viewProducts.jsp"><span>Logout</span></a>
                </li>
                <li>
                	<form action="productlog" method="post">
				        <button class="productsbtn" type="submit" name="products" value="products"><span>Products</span></button>
					</form>
                </li>
                <li><a href="AboutUS.jsp"><span>About Us</span></a></li>
                <li><a href="ContactUs.jsp"><span>Contact Us</span></a></li>  
                <li class="active">
                	<a href="#"><span><i class="fa fa-shopping-cart"></i></span></a>
                </li>
              </ul>
            </nav>
          </div>


          <div class="d-inline-block d-xl-none ml-md-0 mr-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-white"><span class="icon-menu h3"></span></a></div>

          </div>

        </div>

    </header>

	<!--end of header-->
	
	<div class="cart">
		<div class="shopping-cart">
		  <!-- Title -->
		  <div class="title">
		    Shopping Cart
		  </div>
		  
			<c:forEach var="cart" items="${productDetails}">
			
			<c:set var="id" value="${cart.id}"/>
			<c:set var="name" value="${cart.name}"/>
			<c:set var="company" value="${cart.company}"/>
			<c:set var="quantity" value="${cart.quantity}"/>
			<c:set var="totalPrice" value="${cart.price}"/>
			
			
			 <!-- Product  -->
		  <div class="item">
		 
		    <div class="description" >
		      <span>${cart.name}</span>
		      <span>${cart.company}</span>
		      <span>x${cart.quantity}</span>
		      <span>Item ID:${cart.id}</span>
		    </div>
		 
		    <div class="total-price" >Rs.${cart.price}</div>
			
			<div class="buttonPosition">
				<c:url value="updateQty.jsp" var="update_qty">
					<c:param name="id" value="${id}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="company" value="${company}"/>
					<c:param name="quantity" value="${quantity}"/>
					<c:param name="price" value="${cart.price}"/>
				</c:url>
				<a href="${update_qty}">
				<input type="submit" name="update" value="Update Quantity" class="button">
				</a>
			</div>
			
			<div class="buttonPosition">
				<c:url value="deleteItem_cart.jsp" var="delete">
					<c:param name="id" value="${id}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="company" value="${company}"/>
					<c:param name="quantity" value="${quantity}"/>
					<c:param name="price" value="${cart.price}"/>
				</c:url>
					<a href="${delete}">
					<input type="submit" name="delete" value="Delete from Cart" class="button">
					</a>
			</div>
			
		  </div>
		
		  
		  	</c:forEach>
		
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