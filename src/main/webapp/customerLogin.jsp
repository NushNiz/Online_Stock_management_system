<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
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
* { box-sizing: border-box; }

body {
	font-family: "HelveticaNeue-Light","Helvetica Neue Light","Helvetica Neue",Helvetica,Arial,"Lucida Grande",sans-serif;
  color:white;
  font-size:12px;
  background:#333 url(/images/classy_fabric.png);
}

form {
 	background:#111; 
  width:300px;
  margin:30px auto;
  border-radius:0.4em;
  border:1px solid #191919;
  overflow:hidden;
  position:relative;
  box-shadow: 0 5px 10px 5px rgba(0,0,0,0.2);
}

form:after {
  content:"";
  display:block;
  position:absolute;
  height:1px;
  width:100px;
  left:20%;
  background:linear-gradient(left, #111, #444, #b6b6b8, #444, #111);
  top:0;
}

form:before {
 	content:"";
  display:block;
  position:absolute;
  width:8px;
  height:5px;
  border-radius:50%;
  left:34%;
  top:-7px;
  box-shadow: 0 0 6px 4px #fff;
}

.inset {
 	padding:20px; 
  border-top:1px solid #19191a;
}

form h1 {
  font-size:18px;
  text-shadow:0 1px 0 black;
  text-align:center;
  padding:15px 0;
  border-bottom:1px solid rgba(0,0,0,1);
  position:relative;
}

form h1:after {
 	content:"";
  display:block;
  width:250px;
  height:100px;
  position:absolute;
  top:0;
  left:50px;
  pointer-events:none;
  transform:rotate(70deg);
  background:linear-gradient(50deg, rgba(255,255,255,0.15), rgba(0,0,0,0));
  color: white;
}

label {
 	color:#666;
  display:block;
  padding-bottom:9px;
}

input[type=text],
input[type=password] {
 	width:100%;
  padding:8px 5px;
  background:linear-gradient(#1f2124, #27292c);
  border:1px solid #222;
  box-shadow:
    0 1px 0 rgba(255,255,255,0.1);
  border-radius:0.3em;
  margin-bottom:20px;
  color: #cccccc;
}

label[for=remember]{
 	color:white;
  display:inline-block;
  padding-bottom:0;
  padding-top:0px;
}

input[type=checkbox] {
 	display:inline-block;
  vertical-align:top;
}

.p-container {
 	padding:0 20px 20px 20px; 
}

.p-container:after {
 	clear:both;
  display:table;
  content:"";
}

.p-container span {
  display:block;
  float:left;
  color:#0d93ff;
  padding-top:8px;
}
input[type=submit] {
 	padding:5px 20px;
  border:1px solid rgba(0,0,0,0.4);
  text-shadow:0 -1px 0 rgba(0,0,0,0.4);
  box-shadow:
    inset 0 1px 0 rgba(255,255,255,0.3),
    inset 0 10px 10px rgba(255,255,255,0.1);
  border-radius:0.3em;
  background:#0184ff;
  color:white;
  float:right;
  font-weight:bold;
  cursor:pointer;
  font-size:13px;
}

input[type=submit]:hover {
  box-shadow:
    inset 0 1px 0 rgba(255,255,255,0.3),
    inset 0 -10px 10px rgba(255,255,255,0.1);
}

input[type=text]:hover,
input[type=password]:hover,
label:hover ~ input[type=text],
label:hover ~ input[type=password] {
 	background:#27292c;
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
	
.login{
	padding: 80px 0 20px;
}
</style>

<title>Customer Login</title>
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
                <li><a href="Home.jsp"><span>Home</span></a></li>
            <!--   <li class="has-children">
                  <a href=""><span>Login</span></a>
                  <ul class="dropdown arrow-top">
                    <li><a href="#">Customer Login</a></li>
                    <li><a href="#">Admin Login</a></li>
                  </ul>
                </li>
                  <li>
                	<form action="log" method="post">
				        <button class="productsbtn" type="submit" name="products" value="products"><span>Products</span></button>
					</form>
                </li>
                <li><a href="about.html"><span>About Us</span></a></li>
                <li><a href="blog.html"><span>Contact Us</span></a></li>	-->   
              </ul>
            </nav>
          </div>


          <div class="d-inline-block d-xl-none ml-md-0 mr-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-white"><span class="icon-menu h3"></span></a></div>

          </div>
          
        </div>

    </header>

	<!--end of header-->

	<div class="login">
	<form action="cuslogin" method="post">
  <h1>Customer Log in</h1>
  <div class="inset">
  <p>
    <label for="email">User Name</label>
    <input type="text" name="uid" placeholder="Username" required="required" />
  </p>
  <p>
    <label for="password">Password</label>
    <input type="password" name="pwd" placeholder="Password" required="required" />
  </p>
  <p>
    <input type="checkbox" name="remember" id="remember">
    <label for="remember">Remember me for 14 days</label>
  </p>
  </div>
  <p class="p-container">
    <span><a href="customerRegister.jsp">Haven't SIGNUP yet ?</a></span>
    <input type="submit" name="go" id="go" value="Log in">
  </p>
</form>
</div>

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
</body>

</html>