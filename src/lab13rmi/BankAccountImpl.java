package lab13rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class BankAccountImpl extends UnicastRemoteObject implements BankAccount {
    private double balance;

    protected BankAccountImpl() throws RemoteException {
        super();
        balance = 0.0;
    }

    public void deposit(double amount) throws RemoteException {
        balance += amount;
    }

    public void withdraw(double amount) throws RemoteException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new RemoteException("Insufficient funds");
        }
    }

    public double showBalance() throws RemoteException {
        return balance;
    }
}