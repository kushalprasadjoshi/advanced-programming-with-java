package chap02oops;

final class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

// The following will cause a compile-time error
// class Car extends Vehicle { }

public class FinalClassExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}
