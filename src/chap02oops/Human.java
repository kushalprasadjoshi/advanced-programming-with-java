package chap02oops;

public class Human {
    int eyes = 2;

    void show() {
        System.out.println("Number of eyes: " + eyes);
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.show();
    }
}
