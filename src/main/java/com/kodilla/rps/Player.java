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
        System.out.println(getName() + " " + "scores");
        score++;
    }

    public int makeMove() {
        int move = (int) Math.floor(Math.random() * 3);
        System.out.println(getName() + " " + (move + 1) + " ");
        return move;

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





