package chap01basics;

// Custom exception class by extending Exception
class MyException extends Exception {
    private String detail;

    // Constructor to initialize detail message
    public MyException(String message) {
        this.detail = message;
    }

    // Override getMessage() to provide custom message
    @Override
    public String getMessage() {
        return "Custom getMessage(): " + detail;
    }

    // Override toString() to provide custom string representation
    @Override
    public String toString() {
        return "MyException: " + detail;
    }
}

public class OverrideExceptionDemo {
    public static void main(String[] args) {
        try {
            // Simulate a condition that throws the custom exception
            throw new MyException("Something went wrong!");
        } catch (MyException e) {
            // Print custom messages from overridden methods
            System.out.println(e); // Calls toString()
            System.out.println(e.getMessage()); // Calls getMessage()
        }
    }
}