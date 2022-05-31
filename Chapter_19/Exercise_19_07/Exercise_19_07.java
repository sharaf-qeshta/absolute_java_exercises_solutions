package chapter_nineteen;

import java.io.File;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 7. Modify the server from Programming Project 19.6 so that the content for body
 * is read from a file on the local hard drive instead of hard-coded into the program.
 * This file should contain the HTML string from Programming Project 19.6. In
 * addition, modify the server so that a new thread is created for each connection.
 * Test the server by starting up two or more Web browsers and navigate to your site.
 * Each browser should display the message.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_19_07
{
    static String response = "";
    public static final int PORT = 8_000;
    private static final String FILE_PATH = "src/chapter_nineteen/message.html";

    public static void main(String[] args)
    {
        try
        {
            loadMessage();
            ServerSocket serverSock = new ServerSocket(PORT);
            while (true)
            {
                Socket connectionSock = serverSock.accept( );
                ClientHandler handler = new ClientHandler(connectionSock);
                Thread thread = new Thread(handler);
                thread.start( );
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }


    private static class ClientHandler implements Runnable
    {
        private final Socket socket;

        public ClientHandler(Socket socket)
        {
            this.socket = socket;
        }


        @Override
        public void run()
        {
            try
            {
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/html");
                out.println("Content-Length: " + response.length());
                out.println();
                out.println(response);
                out.flush();
                out.close();
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }


    public static void loadMessage()
    {
        try (Scanner scanner = new Scanner(new File(FILE_PATH)))
        {
            while (scanner.hasNext())
                response += scanner.nextLine();
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
