package lab13rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            BankAccount account = (BankAccount) registry.lookup("BankAccount");

            account.deposit(1000);
            account.withdraw(200);
            System.out.println("Current Balance: " + account.showBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}