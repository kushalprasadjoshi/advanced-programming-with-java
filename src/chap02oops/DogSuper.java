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