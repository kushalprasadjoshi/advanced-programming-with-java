# Lab 03 - Inheritance in Java

## Objectives

1. Create a class that should implement a `Bank` Interface.
```java
interface Bank {
    void deposit(int);
    void withdraw(int);
    void showBalance(int);
}
```

## Implementation

### Implement Bank Interface

```java
package lab03inheritance;

interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
    void showBalance();
}

public class Gibl implements Bank{
    double balance = 0;

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully! Your new balance is " + balance);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println(amount + " deposited successfully! Your new balance is " + balance);
    }

    @Override
    public void showBalance() {
        System.out.println("Your available balance is " + balance);
    }

    public static void main(String[] args) {
        Gibl customer = new Gibl();

        customer.deposit(10000);
        customer.withdraw(5000);
        customer.showBalance();
    }
}
```

**Output:**
```output
10000 deposited successfully! Your new balance is 10000.0
5000 deposited successfully! Your new balance is 5000.0
Your available balance is 5000.0
```

---
