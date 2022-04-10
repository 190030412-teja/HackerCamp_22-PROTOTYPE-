<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>MEDICARE | HOME</title>
</head>
<style>
	ul li {
		display: inline;
		margin-left: 30px;
		color: white;
	}

	a {
		text-decoration: none;
		color: white;
	}

	.demo {
		margin-top: 8%;
	}

	.navbar-custom {
		background-color: #d9534f;
		color: white;
	}
	canvas{
      position:absolute;
      left:0;
      top:0;
      z-index:-1;
    }
</style>
<body>
	<canvas id='gridwormCanvas' width='1350' height='620' style='background-color: white;' ></canvas>   
	<nav class="navbar navbar-expand-lg navbar-dark navbar-custom">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><svg xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-activity" viewBox="0 0 16 16">
				<path fill-rule="evenodd" d="M6 2a.5.5 0 0 1 .47.33L10 12.036l1.53-4.208A.5.5 0 0 1 12 7.5h3.5a.5.5 0 0 1 0 1h-3.15l-1.88 5.17a.5.5 0 0 1-.94 0L6 3.964 4.47 8.171A.5.5 0 0 1 4 8.5H.5a.5.5 0 0 1 0-1h3.15l1.88-5.17A.5.5 0 0 1 6 2Z"/>
			  </svg>&nbsp;CARE</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a href="/guest">Home</a></li>
					<li class="nav-item" ><a href="/logout">Logout</a></li>
			</div>
		</div>
	</nav>



    <div class="main">
		<div class="container">
			<div class="demo">
				<center>
					<h1>Welcome To <img alt="" src="heart.svg" style="height:75px"> Medimax,&nbsp;${uname}</h1>
				</center>
			</div>
			<div class="row" style="margin-top:8% ;">
				<div class="col">
					<div class="card text-white bg-danger">
						<div class="card-header">
						  APPOINTMENT
						</div>
						<div class="card-body">
						  <h5 class="card-title">No more need to wait for turn in queue</h5>
						  <p class="card-text">Booking your doctor appointment through online medicare app.</p>
						  <center><a href="/booking1" class="btn btn-light">Book Appointment</a></center>
						</div>
					  </div>
				</div>
				<div class="col">
					<div class="card text-white bg-danger">
						<div class="card-header">
						  Bookings
						</div>
						<div class="card-body">
						  <h5 class="card-title">Special title treatment</h5>
						  <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
						  <center><a href="/ViewBooking1" class="btn btn-light">View Bookings</a></center>
						</div>
					  </div>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="design.js"></script>
</html>