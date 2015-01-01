<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="loginstyle.css">
</head>
<body>

	<form action="SignUpServlet" method="post" style="padding-top: 5%;">
		<fieldset
			style="width: 250px; margin: 0px auto; background-color: white;">
			<center>
				<img src="resources/logo.jpg">
			</center>
			<br> Email: <br> <input type="text" name="username"
				id="username" size="40px"> <br> 
				<br> Name: <br>
			<input type="text" name="Name" id="name" size="40px"><br>
			<br> <br> Password: <br> <input type="password"
				name="password" id="password" size="40px"><br> <br>

			<br> Code: <br> <input type="text" name="code" id="code"
				size="40px"><br> <br>
			<center>

				<input type="submit" id="styled-button" value="Sign up" />

			</center>
		</fieldset>
	</form>

</body>
</html>