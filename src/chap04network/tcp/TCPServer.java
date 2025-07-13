package chap04network.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

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
