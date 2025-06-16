package chap04network.rmi;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) throws Exception{
        MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/MY_OBJECT");
        System.out.println("Result from remote call: " + obj.add(3, 5));
    }
}
