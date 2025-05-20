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