package chapter_nineteen;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    private Socket socket;
    private String username;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public Client(Socket socket, String username)
    {
        try
        {
            this.socket = socket;
            this.username = username;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch (Exception exception)
        {
            close();
        }
    }

    public void sendMessage()
    {
        try
        {
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected())
            {
                String message = scanner.nextLine();
                bufferedWriter.write(message);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        catch (Exception exception)
        {
            close();
        }
    }

    public void listen()
    {
        new Thread(() ->
        {
            while (socket.isConnected())
            {
                try
                {
                    String message = bufferedReader.readLine();
                    System.out.println(message);
                }
                catch (Exception exception)
                {
                    close();
                }
            }
        }).start();
    }


    public void close()
    {
        try
        {
            socket.close();
            bufferedWriter.close();
            bufferedReader.close();
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }


    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.nextLine();

        Socket socket = new Socket(Server.HOSTNAME, Server.PORT);
        Client client = new Client(socket, username);
        client.listen();
        client.sendMessage();
    }
}
