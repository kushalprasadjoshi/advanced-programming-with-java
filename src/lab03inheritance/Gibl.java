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
