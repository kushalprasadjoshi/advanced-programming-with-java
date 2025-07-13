package chap04network;

import java.net.*;

public class URLExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com:443/docs/index.html?search=java#section2");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref: " + url.getRef());
    }
}