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