package com.kodilla.rps;

public class Player {
    private String name;
    private int score = 0;
    private int wins;

    public Player(String name, int wins) {
        this.name = name;
        this.score = score;
        this.wins = wins;

    }
    public void score() {
        score++;
    }

    public int makeMove() {
        return 0;
    }

    public boolean isWinner() {
        if (score == wins) {
            return true;
        } else return false;
    }
    public String getName() {
        return name;
    }
}





