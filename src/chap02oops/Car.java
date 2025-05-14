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