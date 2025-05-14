# Unit 2 - Object Oriented Principles in Java

## Overview of Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which can contain data in the form of fields (often known as attributes) and code in the form of methods. OOP focuses on organizing code into reusable and modular components.

### Key Principles of OOP
1. **Encapsulation**: Bundling data and methods that operate on the data within a single unit (class) and restricting direct access to some of the object's components.
2. **Inheritance**: Allowing a class to inherit properties and behavior from another class, promoting code reuse.
3. **Polymorphism**: Enabling a single interface to represent different underlying forms (e.g., method overriding and overloading).
4. **Abstraction**: Hiding complex implementation details and exposing only the necessary functionality.

### Benefits of OOP
- Improved code maintainability and readability.
- Enhanced modularity and reusability.
- Easier debugging and testing.
- Better alignment with real-world modeling.

----

## Class

Class is a blueprint for certain tasks which contains `attributes` and `methods`.

### Example:
```java
package chap02oops;

public class Human {
    int eyes = 2;

    void show() {
        System.out.println("Number of eyes: " + eyes);
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.show();
    }
}
```

**Output:**
```output
Number of eyes: 2
```

### Constructor in Java

A constructor in Java is a special method used to initialize objects. It is called when an object of a class is created. Constructors have the same name as the class and do not have a return type.

#### Key Features of Constructors
1. Automatically called when an object is created.
2. Can be overloaded to initialize objects in different ways.
3. If no constructor is defined, Java provides a default no-argument constructor.

#### Example:
```java
package chap02oops;

public class HumanWithConstructor {
    int eyes;

    // Constructor
    public HumanWithConstructor(int eyes) {
        this.eyes = eyes;
    }

    void show() {
        System.out.println("Number of eyes: " + eyes);
    }

    public static void main(String[] args) {
        HumanWithConstructor human = new HumanWithConstructor(2);
        human.show();
    }
}
```

**Output:**
```output
Number of eyes: 2
```

### Functions in Java3

A function (or method) in Java is a block of code that performs a specific task. Functions are used to define the behavior of objects and can be called to execute the code they contain.

#### Key Features of Functions
1. Functions can take parameters and return values.
2. They help in code reuse and modularity.
3. Functions can be public, private, or protected, defining their accessibility.

##### Example:
```java
package chap02oops;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 3));
    }
}
```

**Output:**
```output
Sum: 8
```

---

### Attributes in Java

Attributes (or fields) are variables that hold the state or properties of an object. They are defined within a class and can have different access levels (e.g., private, public).

##### Example:
```java
package chap02oops;

public class Car {
    String color = "Red";

    void displayColor() {
        System.out.println("Car color: " + color);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.displayColor();
    }
}
```

**Output:**
```output
Car color: Red
```

---

### Static in Java

The `static` keyword in Java is used to define methods or attributes that belong to the class rather than any specific instance. Static members can be accessed without creating an object of the class.

#### Key Features of Static
1. Shared among all instances of the class.
2. Can be accessed using the class name.
3. Useful for utility methods and constants.

##### Example:
```java
package chap02oops;

public class MathUtils {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4: " + MathUtils.square(4));
    }
}
```

**Output:**
```output
Square of 4: 16
```

---

### The `this` Keyword in Java

The `this` keyword in Java is a reference variable that refers to the current object. It is used to resolve ambiguity between instance variables and parameters, or to call other constructors in the same class.

#### Key Features of `this`
1. Refers to the current instance of the class.
2. Used to differentiate between instance variables and parameters with the same name.
3. Can be used to call another constructor in the same class.

**NOTE:** This cannot be used for the `static` attributes as they belongs to the class not the object.

##### Example:
```java
package chap02oops;

public class Person {
    String name;

    // Constructor
    public Person(String name) {
        this.name = name; // Resolves ambiguity
    }

    void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.display();
    }
}
```

**Output:**
```output
Name: Alice
```

---

