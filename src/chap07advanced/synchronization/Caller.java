package chap07advanced.synchronization;

public class Caller {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        BankWithdraw obj = new BankWithdraw(acc,600, "Ram");
        BankWithdraw obj1 = new BankWithdraw(acc,500, "Hari");

        obj.start();
        obj1.start();
    }
}
