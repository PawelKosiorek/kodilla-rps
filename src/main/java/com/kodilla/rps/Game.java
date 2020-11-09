package com.kodilla.rps;

public class Game {
    private Player computer, human;
    private int[][] rpsTable = {{0, 0, 0, 0}, {0, 0, 1, 2}, {0, 2 ,0 ,1}, {0, 1, 2, 0}};

    public Game(Player computer, Player human) {
        this.computer = computer;
        this.human = human;

    }

    private boolean isFinished() {
        if (computer.isWinner()) { return true; }
        return human.isWinner();
    }

    public void playGame() {
        while(!isFinished()) {
            int whoScores = rpsTable[human.makeMove()][computer.makeMove()];
            if(whoScores == 1) { human.score(); }
            else if(whoScores == 2) { computer.score(); }
            else System.out.println("Draw");
            computer.printName();
            computer.printScore();
            human.printName();
            human.printScore();
            System.out.println();
        }
        if(human.isWinner()) {
            human.printName();
            System.out.println("  wins");
        } else System.out.println("Computer" + " " + "wins");
    }
}
