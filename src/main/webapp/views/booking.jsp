<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

	 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>MEDICARE | BOOKING</title>
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
		background-color: #f0ad4e;
		color: white;
	}
  canvas{
      position:absolute;
      left:0;
      top:0;
      z-index:-1;
    }
    .form-control::placeholder 
    { 
            color: black;
            opacity: 1; 
            font-weight: 600;
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

					<li class="nav-item"><a href="/home">Home</a></li>
			</div>
		</div>
	</nav>
  <h2 align=center>Book Appoointment</h2><br/>
  <div class="container" style="margin-top:30px;">
    <div class="card text-white bg-warning">
      <div class="card-body">
        <div class="bookingform">
          <form action="/saveapp" method="post" modelAttribute="obj">
            <div class="row">
              <div class="col">
                <input name="name" class="form-control" type="text" id="name" placeholder="Fullname"/>
              </div>
              <div class="col">
                <input name="email" class="form-control" type="text" id="email" placeholder="Email"/>
              </div>
            </div>
            <br>
            <div class="row">
              <div class="col">
                <input name="dob" class="form-control" type="date" id="dob" placeholder="BirthDate"/>
              </div>
              <div class="col">
                <input name="gender" class="form-control" type="text" id="gender" list="choice_gender" placeholder="Gender"/>
                <datalist  id="choice_gender">
                <option value="Male">Male</option>
                  <option value="Female">Female</option>
                </datalist>
              </div>
            </div>
            <br>
            <div class="row">
              <div class="col">
                <input name="blood" class="form-control" type="text" id="blood" list="choice_blood" placeholder="Blood Group"/>
                <datalist id="choice_blood">
                <option value="A+">A+</option>
                  <option value="A-">A-</option>
                  <option value="B+">B+</option>
                  <option value="B-">B-</option>
                  <option value="O+">O+</option>
                  <option value="O-">O-</option>
                  <option value="AB-">AB-</option>
                  <option value="AB+">AB+</option>
                </datalist>
              </div>
              <div class="col">
                <input name="phno" class="form-control" type="text" id="phno" placeholder="Phone Number"/>
              </div>
            </div>
            <br>
            <div class="row">
              <div class="col">
                <input name="address" class="form-control" type="text" id="address" placeholder="Address"/>
              </div>
              <div class="col">
                <input name="desease" class="form-control" type="text" id="desease" list="choice_doctor" placeholder="Select Doctor"/>
                  <datalist id="choice_doctor">
                  <option value="surgery">surgery</option>
                  <option value="neurology">neurology</option>
                  <option value="radiology">radiology</option>
                  <option value="Hematology">Hematology</option>
                  <option value="orthopedic">orthopedic</option>
                  <option value="ophthalmology">ophthalmology</option>
                  <option value="anesthesiology">anesthesiology</option>
                  <option value="pathology">pathology</option>
                  <option value="gynecology">gynecology</option>
                  <option value="pediatrics">pediatrics</option>
                  <option value="obstetrics">obstetrics</option>
                  <option value="psychiatry">psychiatry</option>
                  </datalist>
              </div>
            </div>
            <br>
            <div class="row">
              <div class="col">
                <input name="descp" class="form-control" type="text" id="descp" placeholder="Description About Heath Condition"/>
              </div>
              <div class="col" style="margin-top:3px">
                  <input type="submit" class="btn btn-light input-block-level form-control" value="Book Appoinment"/>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
<script src="design.js"></script>
</html>