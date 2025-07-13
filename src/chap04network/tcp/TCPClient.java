package chap04network.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 9097);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello from client.");
        out.flush();

        String msg = bufferedReader.readLine();
        System.out.println("Server! " + msg);

        out.close();
        bufferedReader.close();
        socket.close();
    }
}
