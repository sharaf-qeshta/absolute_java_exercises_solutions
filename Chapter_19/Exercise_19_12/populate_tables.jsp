<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise_19_12 Populate Data</title>
</head>
<body>

<%
// Constants
java.util.ArrayList<String> NAMES_AUTHOR = new java.util.ArrayList<>(java.util.Arrays.asList(
            "Adams, Douglas",
            "Simmons, Dan",
            "Stephenson, Neal"
    ));

java.util.ArrayList<Integer> NAMES_AUTHOR_ID = new java.util.ArrayList<>(java.util.Arrays.asList(
            1,
            2,
            3
    ));


java.util.ArrayList<String> TITLES_TITLE = new java.util.ArrayList<>(java.util.Arrays.asList(
        "Snow Crash",
        "Endymion",
        "The Hitchhikers Guide to the Galaxy",
        "The Rise of Endymion"
));

java.util.ArrayList<String> TITLES_ISBN = new java.util.ArrayList<>(java.util.Arrays.asList(
        "0-553-38095-8",
        "0-553-57294-6",
        "0-671-46149-4",
        "0-553-57298-9"
));


java.util.ArrayList<String> BOOKS_AUTHORS_ISBN = new java.util.ArrayList<>(java.util.Arrays.asList(
        "0-553-38095-8",
        "0-553-57294-6",
        "0-671-46149-4",
        "0-553-57298-9"
));

java.util.ArrayList<Integer> BOOKS_AUTHORS_AUTHOR_ID = new java.util.ArrayList<>(java.util.Arrays.asList(
        3,
        2,
        1,
        2
));

try
{
	 java.sql.Connection connection = java.sql.DriverManager.getConnection(
			 "jdbc:mysql://localhost:3307/absolute_java", "root", "123456");

	 java.sql.Statement statement = connection.createStatement();

    // Insert Data into Names Table
    for (int i = 0; i < NAMES_AUTHOR.size(); i++)
        statement.execute("insert into Names(AUTHOR, AUTHOR_ID) " +
                "values ('" + NAMES_AUTHOR.get(i) + "', " + NAMES_AUTHOR_ID.get(i) + ");");

    // Insert Data into Titles Table
    for (int i = 0; i < TITLES_TITLE.size(); i++)
        statement.execute("insert into Titles(TITLE, ISBN) " +
                "values ('" + TITLES_TITLE.get(i) + "', '" + TITLES_ISBN.get(i) + "');");

    // Insert Data into BooksAuthors Table
    for (int i = 0; i < BOOKS_AUTHORS_AUTHOR_ID.size(); i++)
        statement.execute("insert into BooksAuthors(ISBN, AUTHOR_ID) " +
                "values ('" + BOOKS_AUTHORS_ISBN.get(i) + "', " + BOOKS_AUTHORS_AUTHOR_ID.get(i) + ");");
}
catch (Exception exception)
{
    out.println(exception.getMessage());
}
%>

</body>
</html>