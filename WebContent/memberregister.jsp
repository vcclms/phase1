<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">


<link
	rel="https://fonts.googleapis.com/css?family=Open+Sans:400:300:700" />
<link rel="stylesheet" type="text/css" href="css/library_home_style.css" />
<link rel="stylesheet" href="css/register_style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="header">
		<img src="img/vcc.png" align="left" width="65" height="65" />
		<h2>VEYANGODA CENTRAL COLLEGE || LIBRARY MANAGEMENT SYSTEM</h2>
	</div>

	<form action="MemberServlet" method="post" class="login-form">

           <div class="container">
 
<div class="center">

         <h2>Add User</h2>
      
          <label for="uid">User Id</label>
    <input type="text" id="uid" name="uid" placeholder="Enter User Id">   
            
            <label for="fname">First Name</label>
    <input type="text" id="fname" name="fname" placeholder="Your name..">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lname" placeholder="Your last name..">
    
     <label for="address">Address</label>
    <input type="text" id="address" name="address" placeholder="Your Address..">
    
     <label for="grade">Grade</label>
    <input type="text" id="grade" name="grade" placeholder="Your name Grade..">

    <label for="userrole">User Role</label>
    <select id="userrole" name="userrole">
      <option value="Teacher">Teacher</option>
      <option value="Student">Student</option>
      <option value="Other">Other</option>
    </select> 
    
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="Enter username">
    
    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Enter password">
    
    
		<input type="submit" name="submit" value="Add User">
		<input type="reset" name="reset" value="Reset">
</div>
</div>

<img src="img/adduser.png" align="right" width="150" height="165" />
	


	</form>


</body>
</html>
