# Unit 1 - Basic Programming With Java

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
| Logical      | `&&`, `||`, `!`     | Perform logical operations.                     |
| Bitwise      | `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>` | Perform bit-level operations.              |

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

