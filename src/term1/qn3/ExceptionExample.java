package term1.qn3;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
