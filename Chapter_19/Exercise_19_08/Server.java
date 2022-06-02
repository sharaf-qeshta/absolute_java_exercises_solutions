package chapter_nineteen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server
{
    public static final int PORT = 8000;
    public static final String HOSTNAME = "localhost";
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(PORT);
            while (!serverSocket.isClosed())
            {
                Socket socket = serverSocket.accept();
                ClientHandler handler = new ClientHandler(socket);
                Thread thread = new Thread(handler);
                thread.start();
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * Inner class to handle clients requests
     * */
    private static class ClientHandler implements Runnable
    {
        public static ArrayList<ClientHandler> clients = new ArrayList<>();
        private Socket socket;
        private String username;
        private BufferedReader bufferedReader;
        private BufferedWriter bufferedWriter;

        public ClientHandler(Socket socket)
        {
            try
            {
                this.socket = socket;
                this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.username = bufferedReader.readLine();
                clients.add(this);
                System.out.println(username + " joined!");
                spread("(SERVER) " + username + " joined the chat :)");
            }
            catch (Exception exception)
            {
                close();
            }
        }

        @Override
        public void run()
        {
            while (socket.isConnected())
            {
                try
                {
                    String message = bufferedReader.readLine();
                    spread("(" + username + ") " + message);
                }
                catch (Exception exception)
                {
                    close();
                    break;
                }
            }
        }


        private void close()
        {
            leave();
            try
            {
                socket.close();
                bufferedReader.close();
                bufferedWriter.close();
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }

        private void spread(String message)
        {
            for (ClientHandler client: clients)
            {
                try
                {
                    if (!client.username.equals(username))
                    {
                        client.bufferedWriter.write(message);
                        client.bufferedWriter.newLine();
                        client.bufferedWriter.flush();
                    }
                }
                catch (Exception exception)
                {
                    close();
                }
            }
        }

        public void leave()
        {
            clients.remove(this);
            spread("(SERVER) " + username + " left the chat :(");
            System.out.println(username + " leave!");
        }
    } // End of inner class ClientHandler
}
