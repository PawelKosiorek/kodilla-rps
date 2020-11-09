package com.kodilla.rps;

public class Human extends Player {

    public Human(String name, int wins) {
        super(name, wins);
    }

    @Override
    public int makeMove() {
        int move = (int) Math.floor(Math.random() * 3);
        System.out.println(getName() + " " + move + " ");
        return move;
    }


}
