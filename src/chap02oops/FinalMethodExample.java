package chap02oops;

class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // The following would cause a compile-time error:
    // void show() { System.out.println("Cannot override."); }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}