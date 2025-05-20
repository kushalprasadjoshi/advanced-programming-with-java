package chap02oops;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle d1 = new Circle();
        Rectangle d2 = new Rectangle();
        d1.draw();
        d2.draw();
    }
}