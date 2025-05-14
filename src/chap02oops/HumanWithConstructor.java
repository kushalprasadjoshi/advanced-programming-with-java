package chap02oops;

public class HumanWithConstructor {
    int eyes;

    // Constructor
    public HumanWithConstructor(int eyes) {
        this.eyes = eyes;
    }

    void show() {
        System.out.println("Number of eyes: " + eyes);
    }

    public static void main(String[] args) {
        HumanWithConstructor human = new HumanWithConstructor(2);
        human.show();
    }
}