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
