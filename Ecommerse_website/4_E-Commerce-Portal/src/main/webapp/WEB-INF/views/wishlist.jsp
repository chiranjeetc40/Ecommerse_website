<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Retail Products</title>
<style>
html,body
        {
            height: 100%;
            margin: 0;
            background-attachment: fixed;
            background-image: url("https://www.hostgator.com/blog/wp-content/uploads/2019/08/For-More-Sales-on-Your-E-Commerce-Site-Make-a-Wishlist.png");
            background-size: cover;
        }
 .form-inline {
            position: absolute;
            left: 50%;
            transform: translatex(-50%);
        }
        
        .search-button
        {
            border-radius: 0%;
            border: 0%;
        }
        .form-group {
	width: 100%;
	padding: 0px;
}
.bottomMargin {
  margin-bottom: 2rem;
}
.fixCard{
 border-radius: 25px;
 background-color: white;
 margin-bottom: 2rem;
 border-style: solid;
 overflow: hidden;
}


.fixImg{
 height: 16rem;
}
.description{
 height: 8rem;
}
.searchCard{
width: 50%;
}
.centerFix{
 text-align:
}
.butt
        {
            margin: 0.5rem 0; 
            width: 8rem;
            border: 0px;
            padding: 0.1rem;
            border-radius: 25px;
            background: #2691d9;
             font-size: 16px;
            color:#FFFFFF;
            cursor: pointer;
            outline: none;
        }
.input-group {
	width: 90% !important;
}
.widthParam{
 width:100%;
 margin: 0.5rem 0;
 border-radius: 25px;
}
.heading{
 margin-bottom: 0px;
 margin-left:1rem;
 margin-right:1.5rem;
 color:#ffffff;
}

.modeldata {
	width: 90% !important;
	margin-right: 10px;
	padding-left: 10px;
	padding-right: 10px;
}
.navBar{
 display:flex;
 flex-direction:row;
 align-items: center;
 margin: 0;
}
.expansion{
  flex-grow:3;
  display: flex;
  flex-direction:row;
  margin: 0 1rem;
}
.navToggler{
background-color: transparent;	
border:1px solid transparent;
border-radius: .25rem;
padding: 0 0.5rem;
}
.cardRow{
display:flex;
flex-direction: row;
width:100vw;
flex-wrap: wrap;
}
.flexProperty{
 display: flex;
 flex-direction: row;
 align-items:center;
 margin: 0 0.5rem;
}

.widthZero{
padding:0;
}

.heart{
color:#ffffff;
font-weight: 900;
}
.cart{
color:#ffffff;
font-weight: 900;
}
.marginEx{
 margin-right:4px;
}

.logout{
color:#ffffff;
font-weight: 900;
}
.description{
 height: 16rem;
 padding:10px;
}

.overPage{
overflow-x:hidden;
}
</style>
</head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="./style.css" />
<body class="overPage">
	<!-- navbar for the pages -->
	<nav class="navBar" style="background-color:rgba(53,57,66,255);">
            
           <a href="/index"> <h5 class="heading" href="/index">Home</h2></a>
            
            
            <form class="my-lg-0 expansion" action="/searchByName" method="get">
			  <input class="widthParam mr-sm-2" type="text" placeholder="   Search"
					name="search" id="search" />
				  	 <input
					class="butt" type="submit"
					value="Search">
			   
			</form>
         
            <div id="navbarNav">
                <ul class="navBar ml-auto">
                    <li class="flexProperty">
                        <i class="fa fa-heart marginEx heart"></i>
                        <a href="/getWishlist" class="widthZero heart">Wishlist</a>
                    </li>
                    <li class="flexProperty">
                        <i class="fa fa-shopping-cart marginEx cart"></i>
                        <a href="/getCart" class="widthZero cart">Cart</a>
                    </li>
                    <li class="flexProperty">
                        <i class="fa fa-sign-out marginEx logout"></i>
                        <a href="/logout" class="widthZero logout">Logout</a>
                    </li>
                </ul>
            </div>
            
               
        </nav>
	
	<!-- body section of the page use jsp -->
	<!-- use loop to fetch the data and display it -->
	<div class="cardRow">
	<c:forEach var="item" items="${list}">
			
				<!-- add a single item fech from database  -->
				<div class="col-sm">
					<div class="fixCard my-4 color" style="width: 18rem">
						<img src="${item.product.imageName}"
							class="fixImg card-img-top" alt="..." />
						<div class="description">
							<h5 class="card-title">${item.product.name}</h5>
							<p class="card-text">${item.product.description}</p>

							<h5 class="price">
								<strong>Price :${item.product.price}</strong>
							</h5>
							<h5 class="quantity">
								<strong>Quantity :${item.quantity}</strong>
							</h5>
							<br> <span id="rating">Rating :
								${item.product.rating} <i style="font-size: 15px" class="fa">&#xf005;</i>
							</span> <br>
						</div>
					</div>
				

		</div>
	</c:forEach>
	</div>
	<c:set var="error" value="${errorMEssage}" />
	<c:set var="errorHead" value="${errorHead}" />
	<div class="errorDiv" >
	<div class="alert">
  <strong>${errorHead}</strong><br>${error}</div>
  </div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
	
</body>
</html>

