<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise_19_10</title>
</head>
<body>
	<%
		// get the height
		int height_in_feet = Integer.parseInt(request.getParameter("height_in_feet"));
		out.println("<h1>" + height_in_feet + " feets is " + (height_in_feet * 12) + " Inches </h1>");
	%>
</body>
</html>