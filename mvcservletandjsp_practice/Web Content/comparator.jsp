<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greatest Number</title>
</head>
<body>
<%
	int result = (Integer)request.getAttribute("response");
	out.println("Greatest of two numbers = " + result);
%>
</body>
</html>