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