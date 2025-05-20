# Chapter 2 - Object Oriented Principles in Java

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

### Functions in Java

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

## Inheritance in Java

- Inherit the property of one class by another class.
- Reusability, time saving.

Inheritance is a fundamental concept in object-oriented programming that allows one class (child or subclass) to inherit the properties and behaviors (fields and methods) of another class (parent or superclass). It promotes code reuse and establishes a relationship between classes.

## How to Inherit Classes in Java

To inherit properties from a parent class, use the `extends` keyword in the subclass declaration. The subclass automatically acquires all accessible fields and methods of the superclass.

**Syntax:**
```java
class ParentClass {
    // fields and methods
}

class ChildClass extends ParentClass {
    // additional fields and methods
}
```

The subclass can now use the inherited members as if they were its own, unless they are marked as `private`.

### Types of Inheritance in Java

1. **Single Inheritance**
2. **Multilevel Inheritance**
3. **Hierarchical Inheritance**

> **Note:** Java does not support multiple inheritance with classes (a class cannot inherit from more than one class), but it can be achieved using interfaces.

---

### 1. Single Inheritance

A subclass inherits from a single superclass.

**Example:**
```java
package chap02oops;

public class AnimalSingle {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogSingle extends AnimalSingle {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        DogSingle dog = new DogSingle();
        dog.eat();
        dog.bark();
    }
}
```

**Output:**
```output
Animal is eating
Dog is barking
```

---

### 2. Multilevel Inheritance

A class is derived from another derived class, forming a chain.

**Example:**
```java
package chap02oops;

public class AnimalMulti {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogMulti extends AnimalMulti {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class PuppyMulti extends DogMulti {
    void weep() {
        System.out.println("Puppy is weeping");
    }

    public static void main(String[] args) {
        PuppyMulti puppy = new PuppyMulti();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
```

**Output:**
```output
Animal is eating
Dog is barking
Puppy is weeping
```

---

### 3. Hierarchical Inheritance

Multiple subclasses inherit from a single superclass.

**Example:**
```java
package chap02oops;

public class AnimalHier {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogHier extends AnimalHier {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class CatHier extends AnimalHier {
    void meow() {
        System.out.println("Cat is meowing");
    }

    public static void main(String[] args) {
        DogHier dog = new DogHier();
        dog.eat();
        dog.bark();

        CatHier cat = new CatHier();
        cat.eat();
        cat.meow();
    }
}
```

**Output:**
```output
Animal is eating
Dog is barking
Animal is eating
Cat is meowing
```

### The `super` Keyword in Java

The `super` keyword in Java is used within a subclass to refer to its immediate superclass. It allows access to superclass methods and fields, and can also be used to invoke the superclass constructor.

#### Uses of `super`:
- Access superclass fields when they are hidden by subclass fields.
- Invoke superclass methods that are overridden in the subclass.
- Call the superclass constructor from the subclass constructor.

**Example:**
```java
package chap02oops;

class AnimalSuper {
    String name = "Animal";

    void display() {
        System.out.println("This is an animal");
    }
}

public class DogSuper extends AnimalSuper {
    String name = "Dog";

    void display() {
        System.out.println("This is a dog");
    }

    void printInfo() {
        System.out.println(name);           // prints Dog (subclass field)
        System.out.println(super.name);     // prints Animal (superclass field)
        display();                          // calls subclass method
        super.display();                    // calls superclass method
    }

    public static void main(String[] args) {
        DogSuper dog = new DogSuper();
        dog.printInfo();
    }
}
```

**Output:**
```output
Dog
Animal
This is a dog
This is an animal
```

**Summary:**  
Inheritance enables code reuse and logical hierarchy in Java. The most common types are single, multilevel, and hierarchical inheritance. Java restricts multiple inheritance with classes to avoid ambiguity, but interfaces can be used to achieve similar results.

---

## Polymorphism in Java

- Ability of object to act in different forms.

Polymorphism is an important concept in object-oriented programming that allows objects to take many forms. In Java, polymorphism enables a single action to behave differently based on the object performing it. There are two main types of polymorphism:

1. **Compile-time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

### 1. Method Overloading (Compile-time Polymorphism)

Method overloading occurs when two or more methods in the same class have the same name but different parameters (type, number, or both). The method to be executed is determined at compile time.

**Example:**
```java
package chap02oops;

public class OverloadingExample {
    void display(int a) {
        System.out.println("Argument: " + a);
    }

    void display(String s) {
        System.out.println("Argument: " + s);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display(10);
        obj.display("Hello");
    }
}
```

**Output:**
```output
Argument: 10
Argument: Hello
```

### 2. Method Overriding (Runtime Polymorphism)

Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be executed is determined at runtime based on the object type.

**Example:**
```java
package chap02oops;

class AnimalPoly {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogPoly extends AnimalPoly {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        AnimalPoly a;
        a = new AnimalPoly();
        a.sound(); // Animal makes a sound

        a = new DogPoly();
        a.sound(); // Dog barks
    }
}
```

**Output:**
```output
Animal makes a sound
Dog barks
```

**Summary:**  
Polymorphism allows Java to support flexible and reusable code. Method overloading enables multiple methods with the same name but different signatures, while method overriding allows subclasses to provide specific implementations for superclass methods.

---

## Interfaces in Java

An interface in Java is a reference type, similar to a class, that can contain only abstract methods (until Java 8, after which default and static methods are also allowed) and constants. Interfaces are used to achieve abstraction and multiple inheritance in Java.

### Key Points:
- An interface defines a contract that implementing classes must fulfill.
- A class implements an interface using the `implements` keyword.
- Interfaces cannot be instantiated directly.
- A class can implement multiple interfaces, enabling multiple inheritance.

**Syntax:**
```java
interface InterfaceName {
    // abstract methods
    void method1();
    void method2();
}
```

**Example:**
```java
package chap02oops;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle d1 = new Circle();
        Rectangle d2 = new Rectangle();
        d1.draw();
        d2.draw();
    }
}
```

**Output:**
```output
Drawing a circle
Drawing a rectangle
```

**Summary:**  
Interfaces provide a way to achieve abstraction and multiple inheritance in Java. They define a set of methods that implementing classes must provide, ensuring a consistent API across different classes.

---

## Encapsulation in Java

Encapsulation is one of the core principles of object-oriented programming. It refers to the bundling of data (fields) and methods that operate on that data into a single unit, typically a class. Encapsulation restricts direct access to some of an object's components, which helps protect the integrity of the data and promotes modularity and maintainability.

### Key Points:
- Fields (variables) are made `private` to prevent direct access from outside the class.
- Public getter and setter methods are provided to access and modify the private fields.
- Encapsulation helps in data hiding and controlling how data is accessed or modified.

**Example:**
```java
package chap02oops;

public class Student {
    // Private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice");
        s.setAge(20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```

**Output:**
```output
Name: Alice
Age: 20
```

**Summary:**  
Encapsulation ensures that the internal representation of an object is hidden from the outside. Access to the data is only possible through well-defined methods, making the code more robust and easier to maintain.

---