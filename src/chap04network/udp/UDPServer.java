package chap04network.udp;

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
