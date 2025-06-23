# Lab 11 - UDP Server

## Objective 

1. WAP an `UDP Server` which provides the services.
2. WAP an `UDP Client` to access the server.

---

## Implementation

**UDPServer.java**
```java
package lab11udp;

import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9099);
        byte[] data = new byte[1024];

        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.receive(packet);

        String msg = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Message: " + msg);
        String toMsg = "Hello to Server";
        byte[] toData = toMsg.getBytes();

        DatagramPacket toPack = new DatagramPacket(toData, toData.length, packet.getAddress(), packet.getPort());
        socket.send(toPack);

        socket.close();
    }
}
```

**UDPClient.java**
```java
package lab11udp;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        String msg = "Hello from Client";
        byte[] bmsg =msg.getBytes();

        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(bmsg, bmsg.length, address, 9099);

        socket.send(packet);

        byte[] smsg = new byte[1024];

        DatagramPacket spacket = new DatagramPacket(smsg, smsg.length);
        socket.receive(spacket);

        String smessage = new String(spacket.getData(), 0, spacket.getLength());

        System.out.println("Server message: " + smessage);

        socket.close();
    }
}
```

---

## Output

To get the output first you have to run the server file then only you can run the client file to get the service from the server file.

```output
Server message: Hello to Server
```

---
