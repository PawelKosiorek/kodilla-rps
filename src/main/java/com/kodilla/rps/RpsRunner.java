package com.kodilla.rps;


public class RpsRunner {
    private Player computer, human;
    private int[][] rpsTable = {{0,1,2}, {2,0,1}, {1,2,0}};

    public RpsRunner(Player computer, Player human) {
        this.computer = computer;
        this.human = human;
    }

    private boolean isFinished() {
        if (computer.isWinner()) {
            return true;
        }
        return human.isWinner();
    }

    private void game() {
        while(!isFinished()) {
            int whoScores = rpsTable[human.makeMove()][computer.makeMove()];
            if(whoScores == 1) {
                human.score();
            } else if(whoScores == 2) {
                computer.score();
            }
        }
        if(human.isWinner()) {
            System.out.println(human.getName() + " " + "wins");
        } else System.out.println("Computer" + " " + "wins");
    }


    public static void main(String[] args) {
        Player computer = new Player("Computer", 7);
        Player human = new Human("Peter Jay", 7);
        RpsRunner rpsrunner = new RpsRunner(computer, human);
        rpsrunner.game();

    }

}
