package chap07advanced.synchronization;

public class BankAccount {
    double balance = 1000;

    public synchronized void withdraw(String name, double amount) {
        if (balance >= amount) {
            System.out.println("Withdraw success by: " + name);
            try {
                Thread.sleep(1000); // Simulate delay
            } catch(Exception e) {
                e.printStackTrace();
            }
            balance -= amount;
        } else {
            System.out.println("Balance not enough.");
        }
    }
}
