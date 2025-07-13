# Chap 04 - Distributed Network Programming

Distributed network programming involves designing and implementing software systems where components located on different networked computers communicate and coordinate their actions by passing messages. This approach enables resource sharing, scalability, fault tolerance, and parallel processing. In distributed systems, communication can occur through various protocols and technologies, such as sockets, Remote Method Invocation (RMI), and web services. Key challenges include handling network latency, partial failures, data consistency, and security. Distributed network programming is fundamental for building modern applications like cloud services, microservices, and collaborative tools.

---

## TCP (Transmission Control Protocol)

TCP is a core protocol of the Internet Protocol Suite that provides reliable, connection-oriented communication between networked devices. It ensures that data sent from one computer to another arrives intact and in the correct order. TCP achieves this by establishing a connection using a three-way handshake, sequencing data packets, retransmitting lost packets, and managing flow control to prevent congestion. Common applications that use TCP include web browsing (HTTP/HTTPS), email (SMTP), and file transfers (FTP). TCP is widely used in distributed systems where reliable data delivery is essential.

### Steps for TCP Programming

1. **Server Side:**
    - Create a `ServerSocket` object to listen for incoming connections on a specific port.
    - Call `accept()` on the `ServerSocket` to wait for a client connection. This returns a `Socket` object for communication.
    - Use input and output streams from the `Socket` to read from and write to the client.
    - Close the streams and sockets when done.

2. **Client Side:**
    - Create a `Socket` object to connect to the server using the server's IP address and port number.
    - Use input and output streams from the `Socket` to communicate with the server.
    - Close the streams and socket after communication is complete.

**Example:**

**TCPServer.java**
```java
import java.io.*;
import java.net.*;

public class TCPServer {
     public static void main(String[] args) throws IOException {
          ServerSocket serverSocket = new ServerSocket(5000);
          System.out.println("Server started, waiting for client...");
          Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

          String message = in.readLine();
          System.out.println("Received from client: " + message);
          out.println("Hello from server!");

          in.close();
          out.close();
          socket.close();
          serverSocket.close();
     }
}
```

**TCPClient.java**
```java
import java.io.*;
import java.net.*;

public class TCPClient {
     public static void main(String[] args) throws IOException {
          Socket socket = new Socket("localhost", 5000);
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

          out.println("Hello from client!");
          String response = in.readLine();
          System.out.println("Received from server: " + response);

          in.close();
          out.close();
          socket.close();
     }
}
```

#### Output

First run the **TCPServer.java**:

```output
Server started, waiting for client...
Received from client: Hello from client!
```

Then run the **TCPClient.java**:

```output
Received from server: Hello from server!
```

---

## UDP (User Datagram Protocol)

UDP is a core protocol of the Internet Protocol Suite that provides connectionless, unreliable communication between networked devices. Unlike TCP, UDP does not guarantee message delivery, order, or error checking, making it faster and more suitable for applications where speed is more critical than reliability. UDP is commonly used in real-time applications such as video streaming, online gaming, and voice over IP (VoIP), where occasional data loss is acceptable.

### Steps for UDP Programming

1. **Server Side:**
    - Create a `DatagramSocket` object bound to a specific port to listen for incoming datagrams.
    - Use a `DatagramPacket` to receive data from clients.
    - Process the received data and optionally send a response using another `DatagramPacket`.
    - Close the socket when done.

2. **Client Side:**
    - Create a `DatagramSocket` object (optionally bound to any available port).
    - Use a `DatagramPacket` to send data to the server's IP address and port.
    - Optionally, receive a response from the server using another `DatagramPacket`.
    - Close the socket after communication is complete.

**Example:**

**UDPServer.java**
```java
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6000);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        System.out.println("UDP Server started, waiting for client...");
        socket.receive(packet);
        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received from client: " + message);

        String response = "Hello from UDP server!";
        byte[] responseData = response.getBytes();
        DatagramPacket responsePacket = new DatagramPacket(
            responseData, responseData.length, packet.getAddress(), packet.getPort());
        socket.send(responsePacket);

        socket.close();
    }
}
```

**UDPClient.java**
```java
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello from UDP client!";
        byte[] data = message.getBytes();
        InetAddress serverAddress = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(data, data.length, serverAddress, 6000);
        socket.send(packet);

        byte[] buffer = new byte[1024];
        DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);
        socket.receive(responsePacket);
        String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
        System.out.println("Received from server: " + response);

        socket.close();
    }
}
```

#### Output

First run the **UDPServer.java**:

```output
UDP Server started, waiting for client...
Received from client: Hello from UDP client!
```

Then run the **UDPClient.java**:

```output
Received from server: Hello from UDP server!
```

---

## RMI (Remote Method Invocation)

- RMI enables a method in one Java program to be called from another program running on a different computer over a network.

Remote Method Invocation (RMI) is a Java API that allows objects to communicate and invoke methods across a network. With RMI, a Java program can call methods on an object located on a different Java Virtual Machine (JVM), possibly on a remote server. RMI handles the details of network communication, object serialization, and remote object references, making distributed computing in Java more straightforward. It is commonly used for building distributed applications where components need to interact over a network.

### Steps

1. Create a remote (e.g. `MyRemote`) interface by inheriting from `Remote` present in `java.rmi`. Methods should throw `RemoteException`.

2. Create an implementation class (e.g. `MyRemoteImp`) that implements the created remote interface (`MyRemote`) and extends `UnicastRemoteObject` present in `java.rmi.server`.

3. Create a server class (e.g. `MyRemoteServer`) which bind the object.
```java 
MyRemoteImp obj = new MyRemoteImp(); // Create the object
LocateRegistry.createRegistry(1099); // Start the RMI registry
Naming.rebind("MY_OBJECT", obj); // param1 is unique id and param2 is object
```

4. Create a client class (e.g. `RMIClient`) which should call the remote method.
```java
MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/MY_OBJECT");
```

### Example

**MyRemote.java**
```java
package chap04network.rmi;

import java.rmi.*;

public interface MyRemote extends Remote{
    public int add(int a, int b) throws RemoteException;
}
```

**MyRemoteImp.java**
```java
package chap04network.rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImp() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
```

**MyRemoteServer.java**
```java
package chap04network.rmi;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class MyRemoteServer {
    public static void main(String[] args) throws Exception {
        MyRemoteImp obj = new MyRemoteImp();
        LocateRegistry.createRegistry(1099);
        System.out.println("RMI registry started .....");
        Naming.rebind("MY_OBJECT", obj);
    }
}
```

**RMIClient.java**
```java
package chap04network.rmi;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) throws Exception{
        MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/MY_OBJECT");
        System.out.println("Result from remote call: " + obj.add(3, 5));
    }
}
```

#### Output

First run the **MyRemoteServer.java**

```output
RMI registry started .....

```

After that run the **RMIClient.java**

```output
Result from remote call: 8

```

---