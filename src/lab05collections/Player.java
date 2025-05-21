package lab05collections;

import java.util.*;

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
