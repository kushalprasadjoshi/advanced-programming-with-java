package chap02oops;

public class OverloadingExample {
    void display(int a) {
        System.out.println("Argument: " + a);
    }

    void display(String s) {
        System.out.println("Argument: " + s);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display(10);
        obj.display("Hello");
    }
}