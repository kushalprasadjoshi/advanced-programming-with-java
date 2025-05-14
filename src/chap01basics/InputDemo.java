package chap01basics;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Reading a double
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Reading a string
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);

        scanner.close();
    }
}