<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
	// load the data from the file
	java.util.ArrayList<String> boys = new java.util.ArrayList<>();
	java.util.ArrayList<String> girls = new java.util.ArrayList<>(); 
	
	try (java.util.Scanner reader = new java.util.Scanner(new java.io.File("src/main/webapp/names.txt")))
    	{
        	while (reader.hasNext())
        	{
        		java.util.StringTokenizer st = new java.util.StringTokenizer(reader.nextLine());
            		st.nextToken();
            		boys.add(st.nextToken());
            		st.nextToken();
            		girls.add(st.nextToken());
        	}
       }
       catch (Exception ignored) { }
%>

<% 
	String lastName = request.getParameter("last_name");
	int randomIndex = (int) ((Math.random() * 10000) % 1000);
		
	out.println("<h1>If your baby is a boy, consider the name " + boys.get(randomIndex) + " " + lastName);
	out.println("<h1>If your baby is a girl, consider the name " + girls.get(randomIndex) + " " + lastName);
%>

</body>
</html>