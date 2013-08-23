<%@page import="StringSwapper.dto.SwappingObject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	<!-- Page Layout  -->
	<div id="container" style="width:500px">
		
		<!-- Header  -->
		<div id="header" style="background-color:#00FFFF;">
		<h1 style="margin-bottom:0;">Swap Result</h1>
		</div>

		<!-- Content  -->
		<div id="content" style="background-color:#EEEEEE;height:200px;width:400px;float:left;">
		<br>
		<h3>Results</h3>
		<%
		SwappingObject swappingResult = (SwappingObject) request.getAttribute("swappedObject");
		%>
		The string: <%=swappingResult.getStringId()%> 
		reversed is: <%=swappingResult.getSwappedId()%>!
		</div>
	</div>
</body>
</html>