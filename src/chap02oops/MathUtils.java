package chap02oops;

public class MathUtils {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4: " + MathUtils.square(4));
    }
}