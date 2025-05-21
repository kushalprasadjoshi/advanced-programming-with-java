# Lab 05 - Number Guess Game

## Objectives

1. Create a **Number Guess Game**. Use **List** to store the guesses.

---

## Implementation

### Guess the Number Game

**Player.java**

```java
public class Player {
    private String name;
    private List<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGuess(int guess) {
        guesses.add(guess);
    }

    public List<Integer> getGuesses() {
        return guesses;
    }
}
```

**GuessNumberGame.java**

```java
package lab05collections;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        int guess = 0;
        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            player.addGuess(guess);

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations, " + player.getName() + "! You guessed the number.");
            }
        }

        System.out.println("Your guesses: " + player.getGuesses());
        scanner.close();
    }
}
```

**Output:**
```output
Enter your name: Kushal Prasad Joshi
Guess a number between 1 and 100:
Enter your guess: 50
Too high!
Enter your guess: 25
Too low!
Enter your guess: 37
Too low!
Enter your guess: 44
Too low!
Enter your guess: 47
Too low!
Enter your guess: 48
Congratulations, Kushal Prasad Joshi! You guessed the number.
Your guesses: [50, 25, 37, 44, 47, 48]
```

---