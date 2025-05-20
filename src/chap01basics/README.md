# Chapter 1 - Basic Programming With Java

Java is object-oriented, platform independent, multithreaded programming language developed by Sun Micro System (later owned by Oracle)

- 1991 (started)
- Jams Gosling, Patric Naughton (starter)
- OAK (previous name)
- In 1995 (renamed to Java)


- **JVM (Java Virtual Machine):** Converts byte code into machine code.
- **JRE (Java Runtime Environment):** Set the environment to execute java program.

![Platform independence of Java](https://i.ytimg.com/vi/-F-SnOzJohg/maxresdefault.jpg)

**Requirements:**
- JDK (Java Development Kit)
- IDE (Integrated Development Environment)

---

## Java Architecture

![Java Architecture](https://www.interviewbit.com/blog/wp-content/uploads/2022/06/Java-Architecture-1024x658.png)

---

## Sample Program

```java
package chap01basics;

public class SampleProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

**To Compile:** `javac SampleProgram.java` --> compile to bytecode --> `SampleProgram.class`

**To Run:** `java SampleProgram` --> runs byte code

---

## Types of Data

In Java, data types specify the type of data that a variable can hold. They are broadly categorized into **Primitive Data Types** and **Referential Data Types**.

### Primitive Data Types

Primitive data types are the most basic data types built into the Java language. They are used to store simple values.

| Data Type | Memory   | Description                                                                 |
|-----------|----------|-----------------------------------------------------------------------------|
| `byte`    | 1 byte   | Stores integers in the range -128 to 127.                                   |
| `short`   | 2 bytes  | Stores integers in the range -32,768 to 32,767.                             |
| `int`     | 4 bytes  | Stores integers in the range -2^31 to 2^31-1.                               |
| `long`    | 8 bytes  | Stores integers in the range -2^63 to 2^63-1.                               |
| `float`   | 4 bytes  | Stores real numbers with single precision (e.g., 3.14).                     |
| `double`  | 8 bytes  | Stores real numbers with double precision (e.g., 3.141592653589793).         |
| `char`    | 2 bytes  | Stores a single character in Unicode (e.g., 'A', '1', '$').                 |
| `boolean` | 1 byte   | Stores logical values: `true` or `false`.                                   |

### Referential Data Types

Referential data types are used to store references to objects. These include classes, interfaces, arrays, and strings.
#### Array

An array is a collection of elements of the same data type stored in contiguous memory locations. Arrays are used to store multiple values in a single variable.

**Syntax:**
```java
<type>[] <arrayName> = new <type>[<size>];
```

**Example:**
```java
// Declaring and initializing an array
int[] numbers = new int[5];

// Assigning values to the array
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

// Accessing array elements
System.out.println(numbers[0]); // Output: 10
```

**Note:**
- Array indices start from `0`.
- The size of an array is fixed once declared.

#### String

A `String` is a sequence of characters. It is a class in Java and is widely used to store and manipulate text.

**Syntax:**
```java
String <identifier>;
```

**Example:**
```java
// Declaring a string variable
String name;

// Assigning a value to the string
name = "John Doe";

// Printing the string
System.out.println(name); // Output: John Doe

// Declaring a string using a literal
String name1 = "Your Name";

// Declaring a string using the 'new' keyword
String name2 = new String("Your Name");
```

---

## Variables

Variables are named memory locations used to store data. They must be declared before use.

### Syntax:
```java
<type> <identifier>;
```

### Example:
```java
int a;       // Declares an integer variable
boolean b;   // Declares a boolean variable
```

---

## Operators

Operators are symbols used to perform operations on variables and values. They are categorized as follows:

### Types of Operators

| Type         | Operators           | Description                                      |
|--------------|---------------------|--------------------------------------------------|
| Arithmetic   | `+`, `-`, `/`, `*`, `%` | Perform basic mathematical operations.          |
| Conditional  | `==`, `<`, `>`, `<=`, `>=`, `!=` | Compare values and return a boolean result. |
| Assignment   | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Assign values to variables.                   |
| Logical      | `&&`, `\|\|`, `!`     | Perform logical operations.                     |
| Bitwise      | `&`, `\|`, `^`, `~`, `<<`, `>>`, `>>>` | Perform bit-level operations.              |

### Unary Operators

Unary operators operate on a single operand.

1. **Increment Operator (`++`)**: Increases the value of a variable by 1.
2. **Decrement Operator (`--`)**: Decreases the value of a variable by 1.

**Note:**
- `++a` (Pre-increment): Increments `a` before using it.
- `a++` (Post-increment): Uses `a` first, then increments it.

**Example:**
```java
int a = 10;
int b = a++;
System.out.println("a = " + a); // Output: a = 11
System.out.println("b = " + b); // Output: b = 10
```

### Ternary Operator

The ternary operator is a shorthand for the `if-else` statement.

**Syntax:**
```java
(condition) ? expression1 : expression2;
```

**Example:**
```java
String result = (a > b) ? "Hello" : "Hi";
System.out.println(result);
```

**Explanation:**
- If `a > b` evaluates to `true`, `result` will be `"Hello"`.
- Otherwise, `result` will be `"Hi"`.

---

## Programming Constructs

Programming constructs control the flow of execution in a program. They are categorized into **Selective**, **Iterative**, and **Transitive** constructs.

### Selective Constructs

Selective constructs allow decision-making in a program.

#### a. `if-else`
```java
if (/*condition*/) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```

#### b. `switch-case`
```java
switch (<variable>) {
    case <value1>:
        // Code for case 1
        break;
    case <value2>:
        // Code for case 2
        break;
    default:
        // Code if no case matches
}
```

### Iterative Constructs

Iterative constructs allow repeating a block of code.

#### a. `for` Loop
```java
// Syntax:
for (/*initialization*/; /*condition*/; /*increment*/) {
    // Code to execute
}

// Example:
for (int i = 0; i < 5; i++) {
    System.out.println("Hello");
}
```

#### b. `while` Loop
```java
// Syntax:
while (/*condition*/) {
    // Code to execute
}

// Example:
int i = 0;
while (i < 5) {
    System.out.println("Hello");
    i++;
}
```

#### c. `do-while` Loop
```java
// Syntax:
do {
    // Code to execute
} while (/*condition*/);
```

### Transitive Constructs

Transitive constructs transfer control within a program.

#### a. `break`
Exits the loop or switch statement prematurely.
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println("Hello");
}
```

#### b. `continue`
Skips the current iteration and moves to the next iteration.
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println("Hello");
}
```

#### c. `return`
Exits from the current method and optionally returns a value.
```java
double add(double a, double b) {
    return a + b;
}
```

---

## Array

An array is a data structure that allows you to store multiple values of the same type in a single variable. It is useful when you need to manage a collection of data efficiently.

**Key Features:**
- Arrays are fixed in size, meaning the number of elements is determined when the array is created.
- All elements in an array must be of the same data type.
- Array elements are stored in contiguous memory locations, allowing fast access using indices.

**Advantages:**
- Simplifies the management of multiple data items.
- Provides fast access to elements using their index.

**Syntax:**
```java
<type>[] <arrayName> = new <type>[<size>];
```

**Example:**
```java
// Declaring an array
int[] number = new int[5];

// Declaring and initializing an array
int[] numbers = {10, 20, 30, 40, 50};
// int numbers[] = {10, 20, 30, 40, 50} // Also valid but not preferred

// Accessing array elements
System.out.println(numbers[0]); // Output: 10

// Modifying an array element
numbers[1] = 25;
System.out.println(numbers[1]); // Output: 25
```

**Note:**
- Array indices start from `0`.
- Attempting to access an index outside the array bounds will result in an `ArrayIndexOutOfBoundsException`.

### Iterating Over an Array:

You can use loops to iterate through the elements of an array.

#### Enhanced `for` Loop

The enhanced `for` loop (also known as the "for-each" loop) is a simplified way to iterate over arrays or collections.

**Syntax:**
```java
for (<type> <variable> : <array>) {
    // Code to execute
}
```

### Example:
```java
int[] numbers = {1, 2, 3, 4, 5};

// Using a traditional for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Using an enhanced for loop
for (int number : numbers) {
    System.out.println(number);
}
```

**Output:**
```
1
2
3
4
5
```

### Program

```java
package chap01basics;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

**Output:**
```output
10
20
30
40
50
```

---

## Input in Java

In Java, input can be taken from the user using the `Scanner` class, which is part of the `java.util` package. The `Scanner` class provides methods to read different types of input such as integers, floating-point numbers, strings, etc.

#### Importing the Scanner Class
To use the `Scanner` class, you need to import it at the beginning of your program:
```java
import java.util.Scanner;
```

#### Syntax
```java
Scanner scanner = new Scanner(System.in);
<type> variable = scanner.next<Type>();
```

#### Common Methods of the Scanner Class
| Method               | Description                                   |
|----------------------|-----------------------------------------------|
| `nextInt()`          | Reads an integer value.                      |
| `nextDouble()`       | Reads a double value.                        |
| `nextFloat()`        | Reads a float value.                         |
| `nextLine()`         | Reads a string (including spaces).           |
| `next()`             | Reads a single word (up to a space).         |
| `nextBoolean()`      | Reads a boolean value (`true` or `false`).   |

#### Example Program
```java
package chap01basics;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Reading a double
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Reading a string
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);

        scanner.close();
    }
}
```

#### Output
```output
Enter an integer: 42
You entered: 42
Enter a double: 3.14
You entered: 3.14
Enter a string: Hello, Java!
You entered: Hello, Java!
```

**Note:**
- Always close the `Scanner` object using `scanner.close()` to release resources.
- Use `scanner.nextLine()` to handle strings properly after reading other types of input, as it consumes the newline character left in the buffer.
- Be cautious of input mismatches (e.g., entering a string when an integer is expected), as they can throw exceptions like `InputMismatchException`.

---

## Packages

Packages in Java are used to group related classes, interfaces, and sub-packages together. They help organize code, avoid naming conflicts, and provide access control.

### Key Points:
- **Definition:** A package is a namespace that organizes a set of related classes and interfaces.
- **Types:** 
    - **Built-in packages:** Provided by Java (e.g., `java.util`, `java.io`).
    - **User-defined packages:** Created by developers for their own classes.

### Creating a Package
To declare a class as part of a package, use the `package` keyword at the top of the Java file:
- Create a folder. Example: `mypackage`
- Create a class inside folder. Example: `Hello`
- First statement of class should be package declaration. Example: `package mypackage;`


```java
package mypackage;

public class MyClass {
        // class code
}
```

### Using Packages
To use classes from a package, use the `import` statement:
- `import <packagename>.*`
- `import <packagename>.ClassName`

```java
import mypackage.MyClass;

public class Test {
        public static void main(String[] args) {
                MyClass obj = new MyClass();
        }
}
```

### Advantages of Packages
- **Modularity:** Organizes code into logical units.
- **Reusability:** Classes in packages can be reused across projects.
- **Name Collision Avoidance:** Prevents naming conflicts between classes.
- **Access Protection:** Provides access control using access modifiers.

### Example
```java
// File: mypackage/Hello.java
package chap01basics;

package chap01basics.mypackage;

public class Hello {
    public void greet() {
        System.out.println("Hello from package!");
    }
}
```

```java
// File: Test.java
package chap01basics;

import chap01basics.mypackage.Hello;

public class Test {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.greet();
    }
}
```

**Output:**
```output
Hello from package!
```

### Sub-Packages

A sub-package is a package that is nested inside another package. Sub-packages help further organize classes into a hierarchical structure, making large projects easier to manage.

**Key Points:**
- Sub-packages are created by adding a dot (`.`) and the sub-package name to the parent package (e.g., `chap01basics.mypackage`).
- The directory structure should match the package hierarchy. For example, `chap01basics/mypackage/` on disk.
- Classes in sub-packages must declare the full package path at the top of the file.

**Example:**
```java
// File: chap01basics/mypackage/Utils.java
package chap01basics.mypackage;

public class Utils {
    public static void printMessage() {
        System.out.println("Hello from sub-package!");
    }
}
```

To use a class from a sub-package:
```java
package chap01basics;

import chap01basics.mypackage.Utils;

public class TestSubPackage {
    public static void main(String[] args) {
        Utils.printMessage();
    }
}
```

**Output:**
```output
Hello from sub-package!
```

---

## Exception Handling in Java

- Concept to track the error during the execution and handle them gracefully.

Exception handling in Java is a mechanism that allows you to manage runtime errors, ensuring the normal flow of the application. Exceptions are events that disrupt the normal execution of a program, such as dividing by zero or accessing an invalid array index.


### Key Concepts

- **Exception:** An object representing an error or unexpected event.
- **Try-Catch Block:** Used to handle exceptions gracefully.
    - **Try:** Code is written inside `try` block.
    - **Catch:** Track the exception and give message.
- **Finally Block:** Contains code that always executes, regardless of whether an exception occurred. Generally, holds clean up codes.
- **Throw Statement:** Used to explicitly throw an exception.
- **Throws Clause:** Declares exceptions that a method might throw.

### Basic Syntax

```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that always executes
}
```

### Example

```java
package chap01basics;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
```

**Output:**
```output
Error: / by zero
This block always executes.
```

### Example Using `throw` and `throws`

The `throw` statement is used to explicitly throw an exception, while the `throws` keyword is used in a method signature to declare that the method might throw certain exceptions.

```java
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
```

**Output:**
```output
Exception caught: Age must be 18 or above.
```

**Note:** You can specify multiple exceptions after the `throws` keyword in a method declaration, separated by commas. The `throw` statement is used to throw a single exception instance, and it must appear inside a method or constructor body (not after the class declaration).

### Types of Exceptions

- **Checked Exceptions:** Checked at compile-time (e.g., `IOException`, `SQLException`).
- **Unchecked Exceptions:** Checked at runtime (e.g., `ArithmeticException`, `NullPointerException`).

### Advantages

- Improves program reliability and robustness.
- Separates error-handling code from regular code.
- Helps in debugging and maintaining code.

**Note:** 
- Always handle exceptions appropriately to avoid unexpected program termination. 
- We can also handle multiple exceptions at a time in a single `catch` block as : `catch (ArithmeticException | IOException | ...)`

### Error vs Exception

| Aspect         | Error                                              | Exception                                         |
|----------------|---------------------------------------------------|---------------------------------------------------|
| Definition     | Serious problems that occur beyond application control, usually related to system resources. | Issues that occur during program execution and can be handled in code. |
| Handling       | Cannot be handled or recovered by application code. | Can be caught and handled using try-catch blocks. |
| Examples       | `OutOfMemoryError`, `StackOverflowError`           | `NullPointerException`, `IOException`             |
| Package        | `java.lang.Error` and its subclasses               | `java.lang.Exception` and its subclasses          |
| Occurrence     | Indicates problems in the runtime environment (JVM). | Indicates problems in the application code.       |
| Recovery       | Not intended to be recovered from.                 | Can often be recovered from or handled gracefully.|

**Summary:**  
Errors are critical issues related to the JVM or system resources and can not be  be  handled in code, while exceptions are conditions that applications should anticipate and handle.

### User Defined Exception

In Java, you can create your own exception classes to handle specific error conditions in your application. These are called **user defined exceptions** or **custom exceptions**. Custom exceptions are created by extending the `Exception` class (for checked exceptions) or the `RuntimeException` class (for unchecked exceptions).

#### Steps to Create a User Defined Exception
1. Define a class that extends `Exception` or `RuntimeException`.
2. Provide constructors as needed.
3. Optionally, override the `toString()` and `getMessage()` methods to provide custom error messages.
4. Throw the custom exception using the `throw` statement.
5. Handle it using `try-catch` blocks.

#### Example 1
```java
package chap01basics;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
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

#### Example 2
```java
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
```

**Output:**
```output
MyException: Something went wrong!
Custom getMessage(): Something went wrong!
```

**Note:**  
User defined exceptions help make your code more readable and meaningful by providing specific error messages for application-specific conditions.

---

