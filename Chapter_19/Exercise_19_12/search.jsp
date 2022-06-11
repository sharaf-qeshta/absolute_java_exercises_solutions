<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise_19_12 Search</title>
</head>
<body>

<%
try
{
	String author = request.getParameter("author_name");
	java.sql.Connection connection = java.sql.DriverManager.getConnection(
			"jdbc:mysql://localhost:3307/absolute_java", "root", "123456");

	java.sql.Statement statement = connection.createStatement();

	java.sql.ResultSet result = statement.executeQuery
            (
                    "select Titles.Title "
                        + " from Titles, Names, BooksAuthors "
                        + " where Names.AUTHOR_ID = BooksAuthors.AUTHOR_ID "
                        + " and Titles.ISBN = BooksAuthors.ISBN "
                        + " and Names.AUTHOR = '" + author + "';"
            );
    out.println("<h1>" + author + " wrote: </h1> <ul>");
    while (result.next())
        out.println("<li>" + result.getString(1) + "</li>");
    out.println("</ul>");
}
catch (Exception exception)
{
    out.println(exception.getMessage());
}
%>

</body>
</html>