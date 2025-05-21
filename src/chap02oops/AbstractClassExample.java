package chap02oops;

abstract class Animal {
    abstract void sound(); // Abstract method

    void eat() { // Concrete method
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}