package chap07advanced.synchronization;

public class BankWithdraw extends Thread{
    BankAccount acc;
    String name;
    double amount;

    BankWithdraw(BankAccount acc, double amount, String name) {
        this.acc = acc;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(name, amount);
    }
}
