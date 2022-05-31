package chapter_nineteen;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 6. This project shows how to create a simple Web server. Create a server program that
 * listens on port 8000. When a client connects to the server, the program should
 * send the following data to the client:
 * "HTTP/1.0 200 OK\n\n" + body
 *  where body is the String "<HTML><TITLE>Java Server</TITLE>This web
 * page was sent by our simple <B>Java Server</B></HTML>". If you know
 * HTML, feel free to insert your own content. The header line identifies the message
 * as part of the HTTP protocol that is used to transmit Web pages.
 *  When the server is running, you should be able to start a Web browser and
 * navigate to your machine on port 8000 and view the message. For example, if the
 * server is running on your local machine, you could point your Web browser to
 * http://localhost:8000 and the message in body should be displayed.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_19_06
{
    static String response = "<HTML><TITLE>Java Server</TITLE>This web" +
            "page was sent by our simple <B>Java Server</B></HTML>";
    static int port = 8_000;

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Waiting for a connection on port 8000.");
            ServerSocket serverSock = new ServerSocket(port);
            Socket connectionSock = serverSock.accept();

            PrintWriter out = new PrintWriter(connectionSock.getOutputStream());
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println("Content-Length: " + response.length());
            out.println();
            out.println(response);
            out.flush();
            out.close();
            connectionSock.close();
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
