# Lab 04 - Exception Handling

## Objectives

1. Write a program for handling the ArithmeticException in java using your own exception class.

---

## Implementation

### Custom Exception Handling

```java
package lab04exceptions;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionHandling {
    // Method that throws the custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18, not allowed.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

**Output:**
```output
Caught Exception: Age is less than 18, not allowed.
```

---