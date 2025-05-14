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