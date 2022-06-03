package chapter_nineteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Constants
{
    /** Connection Constants */
    public static final String LINK = "jdbc:mysql://localhost:3307/absolute_java";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "123456";

    /** Data Definition Language  Constants */
    public static final String CREATE_NAMES_TABLE = "create table Names("
            + "AUTHOR varchar(100) not null,"
            + "AUTHOR_ID integer primary key );";

    public static final String CREATE_TITLES_TABLE = "create table Titles("
            + "TITLE varchar(224) not null,"
            + "ISBN varchar(30) primary key );";

    public static final String CREATE_BOOKS_AUTHORS_TABLE = "create table BooksAuthors( "
            + "ISBN varchar(30),"
            + "AUTHOR_ID integer,"
            + "primary key (ISBN, AUTHOR_ID) );";


    /** Data to Be Inserted */
    public static final ArrayList<String> NAMES_AUTHOR = new ArrayList<>(Arrays.asList(
            "Adams, Douglas",
            "Simmons, Dan",
            "Stephenson, Neal"
    ));

    public static final ArrayList<Integer> NAMES_AUTHOR_ID = new ArrayList<>(Arrays.asList(
            1,
            2,
            3
    ));


    public static final ArrayList<String> TITLES_TITLE = new ArrayList<>(Arrays.asList(
            "Snow Crash",
            "Endymion",
            "The Hitchhikers Guide to the Galaxy",
            "The Rise of Endymion"
    ));

    public static final ArrayList<String> TITLES_ISBN = new ArrayList<>(Arrays.asList(
            "0-553-38095-8",
            "0-553-57294-6",
            "0-671-46149-4",
            "0-553-57298-9"
    ));


    public static final ArrayList<String> BOOKS_AUTHORS_ISBN = new ArrayList<>(Arrays.asList(
            "0-553-38095-8",
            "0-553-57294-6",
            "0-671-46149-4",
            "0-553-57298-9"
    ));

    public static final ArrayList<Integer> BOOKS_AUTHORS_AUTHOR_ID = new ArrayList<>(Arrays.asList(
            3,
            2,
            1,
            2
    ));






}
