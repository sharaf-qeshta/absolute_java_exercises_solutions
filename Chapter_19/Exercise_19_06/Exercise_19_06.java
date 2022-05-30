package chapter_nineteen.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

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
    public static final int PORT = 8000;
    public static final String WELCOME_MESSAGE = "<HTML><TITLE>Java Server</TITLE>This web \n" +
            "page was sent by our simple <B>Java Server</B></HTML>";

    public static void main(String[] args) throws IOException
    {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
        System.out.println("server started at " + PORT);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
    }
}
