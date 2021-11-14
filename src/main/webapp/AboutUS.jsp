<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>

<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">	
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
    

<title>About US</title>

<!-- styles -->
<style >

.bg{
	background:linear-gradient(black, white);
}


*{
	margin:0;
	padding:0;
}






.container
{
	width:90%;
	margin:0 auto;
}

.navbar
{
		position:relative;
		width:100%;
		overflow:hidden;
		height:70px;
		line-height:70px;
		background:#000000;
		border-bottom: 2px solid #000066 ;
		
}



.logo
{
	width:60px;
	height:70px;
	float:left;
}

.menu
{
	
}
.menu li
{
	float:left;
	width :120px;
	height:70px;
	line-height:70px;
	text-align:center;
	
	
	
}
.navbar ul 
{
	list-style-type:none;
	text-align:center;
	
}

.menu li a 
{
	color:#fff;
	text-decoration:none;
	font-family:calibri;
	text-transform:uppercase;
	
}
.menu li:hover
{
	background-color:#000066;
	border-radius: 200px;
	color:#ffffff;
}
.menu li a:hover
{
	background-color:#000066;
	color:#00ccff;
}
.register
{
	background-color: #ff0000;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	cursor: pointer;
	border-radius: 8px;
	margin-right:10px;
	
}

.register:hover
{
	opacity:0.6;
}

#company{
	height:100%;
	width:100%;
}

#name{
	position: absolute;
    left: 6%;
    top: 20%;
    width: 100%;
    text-align: center;
	font-family:sanserif;
	color:white;
	text-shadow:5px 3px black;
	letter-spacing: 3px;
	font-size:50px;
}

#name2{
	position:absolute;
	left:50%;
	top:33%;
}

.ft{

	position:bottom;
	height:60%;
	width:99%;
	background-color:black;
	display:flex;
	
}

.box1{
	background-color: black;
    width: 300px;
    border: 2px solid white;
    padding-top: 40px;
	padding-bottom:40px;
	padding-left:40px;
	padding-right:40px;
    margin: 25px;
	
}

.box2 {
    position:bottom;
    left: 32%;
    top: 8%;
    width: 100%;
    text-align: center;
	background-color: black;
    width: 300px;
    border: 2px solid white;
    padding-top: 40px;
	padding-bottom:40px;
	padding-left:40px;
	padding-right:40px;
    margin: 25px;
}

.box3 {
    position:bottom;
    left: 65%;
    top: 8%;
	right:20%;
    width: 100%;
    text-align: center;
	background-color: black;
    width: 300px;
    border: 2px solid white;
	padding-top: 40px;
	padding-bottom:40px;
	padding-left:40px;
	padding-right:40px;
    margin: 25px;
}

.qa{
	font-size:15px;
	
}



.head1{
    
    width:100%;
    position:relative;
    height:auto;
    margin-bottom:0;
    margin-left:300;
}
.head1 h1{
    color:white;
    font-size: 350%;
    float: center;
    font-family:sanserif;
}

.int1{
	font-size:20px;
}


.Services{
	font-size:20px;
}


#more {
	display: none;
}

#h2{
	text-decoration:underline;
	letter-spacing:3px;
	margin-left:300;
	color:white;
}


#message{
	font-size:30px;
}

.line{
	border: 3px solid black;
	margin:30px;
}

#mybtn{
	background-color:black;
	color:white;
	float:center;
	border-radius:25%;
}

.directors{
	display: flex;
	margin:250px;
	position:relative;
	
}

.desc{
	margin-right: 2%;
	margin-left: 2%;
	color: white;
	font-size: 21px;
}

.world{
	width: 50%;
	margin-left: 3%;
	font-size: 16px;
}
.user{
	width: 50%;
	margin-left: 2%;
	font-size: 16px;
}
.like{
	width: 50%;
	margin-left: 2%;
	font-size: 16px;
}




</style>



</head>
<body>

<!-- javascript functions -->
<script>



function myFunction() {
	  var dots = document.getElementById("dots");
	  var moreText = document.getElementById("more");
	  var btnText = document.getElementById("myBtn");

	  if (dots.style.display === "none") {
	    dots.style.display = "inline";
	    btnText.innerHTML = "Read more"; 
	    moreText.style.display = "none";
	  } else {
	    dots.style.display = "none";
	    btnText.innerHTML = "Read less"; 
	    moreText.style.display = "inline";
	  }
	}




</script>

	<!-- header -->

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
       
             
                <li><a href="listings.html"><span>Products</span></a></li>
                <li class="active"><a href="#"><span>AboutUs</span></a></li>
                <li><a href="ContactUs.jsp"><span>Contact Us</span></a></li>
              </ul>
            </nav>
          </div>


          <div class="d-inline-block d-xl-none ml-md-0 mr-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-white"><span class="icon-menu h3"></span></a></div>

          </div>

        </div>

    </header>
	<!-- end of the header -->

	<div style="background-image: linear-gradient(#360033, #0b8793);"><br><br>
		<!--  <img src="stock2.jpg" id = "company" class="">-->
		
			<br><br><br>
		<center> <h1 id="name">-Kings Peak</h1>  </center>
		
		<div class="head1">
			<center><h1><i> We are here to provide you with the <br> best and the dream <br> products with the best updates!</i></h1></center>
			
			<br><br><br>
		
	</div>
	

	<center><img src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/stock.jpg" ></center>

	
	<br><br>
	<div>
		<hr class="line"></hr>
	
	<!-- chairmans message -->
	<center>
		<h1 id="h2">Chairman's message</h1>
	<p id="message">  <span id="dots">As the No. 01 premier licensed online stock system in Sri Lanka,<br> 
			KINGs PEAK Pvt Ltd. is known for their incomparable...<br></span><span id="more">   professionalism in 
			handling product selling and buying, <br>fulfilling complete customer satisfaction with a vision,<br> 
			thriling with an unfaltering mission while<br>
			contributing to sustainability and country’s infrastructure.
			Welcome to KING PEAK, your number one 
			source for all things product. We are dedicated to giving you the very best of product, with a focus on customer service and uniqueness.
			Founded in 2015 by KINGS Holdings, has come a long way from its beginnings in a toolshed. When KINGS Holadings first started out, thrie passion for 
 			providing the best equipment drove him to do intense research, and gave them the impetus to turn hard work and inspiration into to a booming online store. 
		    We now serve customers all over the world and are thrilled to be a part of the fair trade wing of the whole sale industry.

			We hope you enjoy our products as much as we enjoy offering them to you. If you have any questions or comments, please don't hesitate 
			to contact us.

			Sincerely,
			Manager KINGS HOLDINGS</p></span></p>
	<button onclick="myFunction()" id="myBtn">Read more</button>
</center>

<hr class="line"></hr>
	</div>
	
<!-- directors -->
<center>
<h2 style="color:white;"><b><u>Kings Peek Director Board</b></u></h2></center>
<div class="directors">	

<div class="world">
			<center>
				<img style="border-radius:100px"src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/user.jpeg" width="200px" height="200px" >
				<h2 style="color:white;">CEO</h2>
				<p class="desc"></p>
			</center>
		</div>
	<div class="world">
			<center>
				<img style="border-radius:100px"  src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/user5.png" width="200px" height="200px">
				<h2 style="color:white;">Managing Director(HR)</h2>
				<p class="desc"></p>
			</center>
		</div>

		<div class="user">
			<center>
				<img  style="border-radius:100px" src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/user4.jpeg" width="200px" height="200px">
				<h2 style="color:white;">Managing Director(SALES)</h2>
				<p class="desc"></p>
			</center>
		</div>

		<div class="like">
			<center>
				<img style="border-radius:100px" src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/user1.jpeg"  width="200px" height="200px">
				<h2 style="color:white;">Managing Director(RG)</h2>
				<p class="desc"></p>
			</center>
		</div>
</div>


	<!--  <div>
		<center><img src="../Images/wallet.png" class="img1"  onclick="hiddenText()"><h2><b>Get rewards!</b>Click here to close the advertisment!!</h2></center>
		<div id="myDIV">
			<center><img src="../Images/share.png"  href="" width="200px" height="200px"></center>
			<h2>Share us now to get rewards</h2>
		</div>
	</div>-->

	<!-- company description -->
	<div class="int1">
			<center>
				<img src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/int1.jpg" width="400px" height="400px">
				<h2 style="color:white;">Well Known</h2>
				<p class="int1">More than 7k users a month find what they are looking for by being with us four thousands of products
				 every single day.</p>
			</center>
		</div>
	

	
		<br><br>
		
	<div class="services">
			<center>
				<img src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/stock2.jpg" width="400px" height="400px">
				<h2 style="color:white;">Services</h2>
				<p class="desc">KINGS PEAK has a big technological knowledge for nearly 19 years. Within these time we have developed 
				vast expertise in what our users need and how to help them succeed and quality service</p>
			</center>
		</div>	
		
		
<!-- footer -->		
<footer class="footer-48201">
      
      <div class="container">
        <div class="row">
          <div class="col-md-4 pr-md-5">
            <a href="#" class="footer-site-logo d-block mb-4"><img src="C:/Users/nizme/Documents/Eclips Enterprices SLIIT/Stock_Management/src/main/webapp/images/logo.png" style="width:300px; height:300px"></a>
            <p>According to our extensive experience, we can honestly say that Kings Peak Stock management solutions are world-class and, by far, the most comprehensive in the industry.</p>
          </div>
          <div class="col-md">
            <ul class="list-unstyled nav-links">
              <li><a href="HomePage.jsp">Home</a></li>
              <li><a href="AboutUS.jsp">About Us</a></li>
              <li><a href="ContactUs.jsp">Contact Us</a></li>
            </ul>
          </div>
          <div class="col-md">
            <ul class="list-unstyled nav-links">
              <li><a href="#">Clients</a></li>
              <li><a href="#">Team</a></li>
              <li><a href="#">Career</a></li>
             
            </ul>
          </div>
          <div class="col-md">
            <ul class="list-unstyled nav-links">
              <li><a href="#">Privacy Policy</a></li>
              <li><a href="#">Terms &amp; Conditions</a></li>
              
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