package lab13rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankServer {
    public static void main(String[] args) {
        try {
            BankAccountImpl account = new BankAccountImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("BankAccount", account);
            System.out.println("Bank Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}