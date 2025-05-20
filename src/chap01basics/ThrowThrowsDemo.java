package chap01basics;

public class ThrowThrowsDemo {
    // Method that declares it may throw an exception
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Explicitly throw an exception
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
