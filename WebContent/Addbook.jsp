<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	rel="https://fonts.googleapis.com/css?family=Open+Sans:400:300:700" />
<link rel="stylesheet" type="text/css" href="css/library_home_style.css" />
<link rel="stylesheet" href="css/register_style.css">
</head>
<body>

	<div class="header">
		<img src="img/vcc.png" align="left" width="65" height="65" />
		<h2>VEYANGODA CENTRAL COLLEGE || LIBRARY MANAGEMENT SYSTEM</h2>
	</div>

	<form action="AddBookServlet" method="post">

		<div class="container">

			<div class="center">

				<h2>Add Books</h2>

				<label for="isbn">ISBN No.</label> 
					<input type="text" id="isbn" name="isbn"> 
					
					<label for="bookname">Book Name</label> 
					<input type="text" id="bookname" name="bookname">
					
					<label for="author">Author</label> 
					<input type="text" id="author" name="author">
					
					<label for="booktype">Book Type</label>
    <select id="booktype" name="booktype">
      <option value="sinhala">Sinhala</option>
      <option value="english">English</option>
      <option value="tamil">Tamil</option>
      <option value="other">Other</option>
    </select> 
    
    <label for="bookcat">Book Catagory</label>
    <select id="bookcat" name="bookcat">
      <option value="educational">Educational</option>
      <option value="novel">Novel</option>
      <option value="magazine">Magazine</option>
      <option value="other">Other</option>
    </select> 
					
	<label for="rackno">Rack No.</label> 
	<input type="text" id="rackno" name="rackno"> 
	
	<label for="description">Description</label> 
					<input type="text" id="description" name="description"> 
					
					<!--<label for="img">Select image:</label>
  <input type="file" id="img" name="img" accept="image/*">-->ed
 
  
  <input type="submit" name="submit" value="Add Book">		
					
							

			</div>
		</div>
	</form>
</body>
</html>