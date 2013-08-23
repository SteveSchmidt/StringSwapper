<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello String Swapper</title>
</head>
<body>
	<!-- Page Layout  -->
	<div id="container" style="width:500px">
		
		<!-- Header  -->
		<div id="header" style="background-color:#00FFFF;">
		<h1 style="margin-bottom:0;">Hello String Swapper!</h1>
		</div>

		<!-- Content  -->
		<div id="content" style="background-color:#EEEEEE;height:200px;width:500px;float:left;">
		<br>
		<h3>Enter a string of text to be reversed.</h3>

		<form action="SwapperServlet" method="post">
			String:
			<input type="text" name="stringObject" />
			<input type="submit" />
		</form>
		</div>
	</div>
</body>
</html>