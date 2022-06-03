package chapter_nineteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database
{
    public static void printResult(String author)
    {
        try
        {
            Connection connection = DriverManager.getConnection(
                    Constants.LINK, Constants.USER_NAME, Constants.PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery
                    (
                            "select Titles.Title "
                                + " from Titles, Names, BooksAuthors "
                                + " where Names.AUTHOR_ID = BooksAuthors.AUTHOR_ID "
                                + " and Titles.ISBN = BooksAuthors.ISBN "
                                + " and Names.AUTHOR = '" + author + "';"
                    );
            System.out.println(author + " wrote: ");
            while (result.next())
                System.out.println(result.getString(1));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void createTables()
    {
        try
        {
            Connection connection = DriverManager.getConnection(
                    Constants.LINK, Constants.USER_NAME, Constants.PASSWORD);

            Statement statement = connection.createStatement();

            // Create Names Table
            statement.execute(Constants.CREATE_NAMES_TABLE);

            // Create Titles Table
            statement.execute(Constants.CREATE_TITLES_TABLE);

            // Create BooksAuthors Table
            statement.execute(Constants.CREATE_BOOKS_AUTHORS_TABLE);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }


    public static void insertData()
    {
        try
        {
            Connection connection = DriverManager.getConnection(
                    Constants.LINK, Constants.USER_NAME, Constants.PASSWORD);

            Statement statement = connection.createStatement();

            // Insert Data into Names Table
            for (int i = 0; i < Constants.NAMES_AUTHOR.size(); i++)
                statement.execute("insert into Names(AUTHOR, AUTHOR_ID) " +
                        "values ('" + Constants.NAMES_AUTHOR.get(i) + "', " + Constants.NAMES_AUTHOR_ID.get(i) + ");");

            // Insert Data into Titles Table
            for (int i = 0; i < Constants.TITLES_TITLE.size(); i++)
                statement.execute("insert into Titles(TITLE, ISBN) " +
                        "values ('" + Constants.TITLES_TITLE.get(i) + "', '" + Constants.TITLES_ISBN.get(i) + "');");

            // Insert Data into BooksAuthors Table
            for (int i = 0; i < Constants.BOOKS_AUTHORS_AUTHOR_ID.size(); i++)
                statement.execute("insert into BooksAuthors(ISBN, AUTHOR_ID) " +
                        "values ('" + Constants.BOOKS_AUTHORS_ISBN.get(i) + "', " + Constants.BOOKS_AUTHORS_AUTHOR_ID.get(i) + ");");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
