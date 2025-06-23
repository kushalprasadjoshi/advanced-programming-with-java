package lab12tcp;

import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9097);
        Socket socket = serverSocket.accept();
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String cmsg = bufferdReader.readLine();
        System.out.println("Client: " + cmsg);

        out.println("It's from server");
        out.flush();

        socket.close();
        serverSocket.close();
    }
}
