<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>University Management System</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css">
        <link rel="stylesheet" href="/resources/vendor2/css/style.css">
        <link rel="stylesheet" href="/resources/vendor2/css/Table-With-Search.css">

        <!--For Tamplate -->
        <link rel="stylesheet" href="/resources/vendor2/css/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="/resources/vendor2/css/assets/fonts/fontawesome-all.min.css">
        <script src="/resources/vendor2/css/assets/js/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js"></script>
        
		<!--For DATA Table-->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>
    </head>
    <body style="background-image: url(/resources/home/images/coll.jpg);">
 
<div class="container">
	<div class="login-form">
        <div class="main-div">
            <div class="panel">
                <h2>Admin Login</h2>
                <p >Please enter your email and password</p>
                <p style="color: #d52a1a">${map.status}</p>
            </div>
            <form id="Login" action="/admindashboard" method="POST">                
                <div class="form-group">
                    <input type="email" class="form-control" name="email" id="inputEmail" placeholder="Email Address" >
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" id="inputPassword" placeholder="Password" >
                </div>
                <div class="forgot">
                    <a href="reset.html" style="text-decoration: none;">Forgot password?</a>
                </div>
                <button type="submit" class="btn btn-primary">Login</button> <br> <br>
                <a href="/" style="text-decoration: none;">Back</a>      
            </form>
        </div>
    </div>
</div>