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