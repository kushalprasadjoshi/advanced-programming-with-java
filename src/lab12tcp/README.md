# Lab 12 - TCP Server

## Objectiv

1. WAP an `TCP Server` which provides the services.
2. WAP an `TCP Client` to access the server.

---

## Implementation

**TCPServer.java**
```java
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
```

**TCPClient.java**
```java
package lab12tcp;

import java.net.*;
import java.io.*;

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
```

---

## Output

To get the output first you have to run the server file then only you can run the client file to get the service from the server file.

```output
Server! It's from server
```

---