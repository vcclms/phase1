<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/library_home_style.css" />
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
<% String user = (String) session.getAttribute("user"); %>

    <div class="header">
    <img src="img/vcc.png" align="left" width="65"  height="65" />
    <h2>VEYANGODA CENTRAL COLLEGE || LIBRARY MANAGEMENT SYSTEM
                </h2>
        <div class="header">
            <a class="active"  href="memberregister.jsp">Add User</a> 
            
            <!--  LOGOUT -->
            <form action="LogoutServlet" method="post" class="user-form">           
                <input type="submit" name="submit" value="Logout">
            </form>                  
    </div>    
    </div>

    <p>
        <a href="Addbook.jsp"> <img src="img/book_add.png" alt="" width="65" height="65">Add books
        </a>
        
        <a href="userdetails.jsp"> <img src="img/edit user details.jpg" alt="add user"  width="65" height="65">
        </a>
    </p>

</body>
</html>