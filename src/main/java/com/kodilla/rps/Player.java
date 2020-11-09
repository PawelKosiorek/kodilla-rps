package com.kodilla.rps;



public class Player {
    protected String name;
    private int score = 0;
    private int wins;

    public Player(String name, int wins) {
        this.name = name;
        this.score = score;
        this.wins = wins;

    }
    public void score() {
        System.out.println(name + " " + "scores");
        score++;
    }

    public int makeMove() {
        int move = (int) Math.floor((Math.random() * 3) + 1);
        System.out.println(name + " " + move + " ");
        return move;

    }

    public boolean isWinner() {
        if (score == wins) { return true; }
        else return false;
    }
    public void printName() { System.out.print(name + " "); }

    public void printScore() {System.out.print(score + " "); }
}





