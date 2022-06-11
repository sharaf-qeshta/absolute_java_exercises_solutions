<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise_19_12 Search Create Table</title>
</head>
<body>

<%
// constants
String CREATE_NAMES_TABLE = "create table Names("
            + "AUTHOR varchar(100) not null,"
            + "AUTHOR_ID integer primary key );";
            
String CREATE_TITLES_TABLE = "create table Titles("
                    + "TITLE varchar(224) not null,"
                    + "ISBN varchar(30) primary key );";
                    
String CREATE_BOOKS_AUTHORS_TABLE = "create table BooksAuthors( "
                    + "ISBN varchar(30),"
                    + "AUTHOR_ID integer,"
                    + "primary key (ISBN, AUTHOR_ID) );";                    
try
{
	 java.sql.Connection connection = java.sql.DriverManager.getConnection(
			 "jdbc:mysql://localhost:3307/absolute_java", "root", "123456");

	 java.sql.Statement statement = connection.createStatement();

    // Create Names Table
    statement.execute(CREATE_NAMES_TABLE);

    // Create Titles Table
    statement.execute(CREATE_TITLES_TABLE);

    // Create BooksAuthors Table
    statement.execute(CREATE_BOOKS_AUTHORS_TABLE);
}
catch (Exception exception)
{
    out.println(exception.getMessage());
}
%>

</body>
</html>