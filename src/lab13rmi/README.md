# Lab 13 - RMI (Remote Method Invocation)

## Objective

1. WAP to create RMI application with 3 remote methods: `deposit()`, `withdraw()` and `showBalance()`.

---

## Implementation

### 1. Define the Remote Interface

```java
package lab13rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccount extends Remote {
    void deposit(double amount) throws RemoteException;
    void withdraw(double amount) throws RemoteException;
    double showBalance() throws RemoteException;
}
```

### 2. Implement the Remote Interface

```java
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
```

### 3. Create the Server

```java
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
```

### 4. Create the Client

```java
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
```

---

## Output

**1. Compile all `.java` files.**

**2. Start the server: `java BankServer`**
```output
Bank Server is running...
```

**3. Run the client: `java BankClient`**
```output
Current Balance: 800.0
```

---
