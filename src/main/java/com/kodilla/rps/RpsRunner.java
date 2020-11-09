package com.kodilla.rps;


public class RpsRunner {
    private Player player1, player2;
    private int[][] tableRps = {{0,1,2}, {2,0,1}, {1,2,0}};

    public RpsRunner(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        game();
    }

    private boolean isFinished() {
        if (player1.isWinner()) {
            return true;
        }
        return player2.isWinner();
    }

    private void game() {
        while(!isFinished()) {
            int whoScores = tableRps[player1.makeMove()][player2.makeMove()];
            if(whoScores == 1) {
                player1.score();
            } else if(whoScores == 2) {
                player2.score();
            }
        }
        if(player1.isWinner()) {
            System.out.println(player1.getName() + " " + "wins");
        } else System.out.println(player2.getName() + " " + "wins");
    }


    public static void main(String[] args) {



    }

}
