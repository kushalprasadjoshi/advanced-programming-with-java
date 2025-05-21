package chap02oops;

public class FinalVariableExample {
    public static void main(String[] args) {
        final int MAX_AGE = 100;
        System.out.println("Maximum age: " + MAX_AGE);

        // The following line would cause a compile-time error:
        // MAX_AGE = 120;
    }
}