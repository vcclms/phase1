<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<link rel="https://fonts.googleapis.com/css?family=Open+Sans:400:300:700" />
<link rel="stylesheet" type="text/css" href="css/library_home_style.css" />
<link rel="stylesheet" href="css/login_style.css">


</head>
<body>

<div class="header">
		<img src="img/vcc.png" align="left" width="65" height="65" />
		<h2>VEYANGODA CENTRAL COLLEGE || LIBRARY MANAGEMENT SYSTEM</h2>
	</div>
<div class="center">
<div class="login-form" >
		<h2>User Login</h2>
		<form action="LoginServlet" method="post" class="user-form">
			UserName <input type="text" name="username" required><br> 
			Password <input type="password" name="password" required><br> 
			<input type="submit" name="submit" value="Login">
<p><a href="Signup.jsp">Don't have an account? Sign up</a></p>
		</form>
	</div>
</div>
</body>
</html>