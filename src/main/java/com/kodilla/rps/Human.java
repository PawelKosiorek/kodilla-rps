package com.kodilla.rps;

public class Human extends Player {

    public Human(String name, int wins) {
        super(name, wins);
    }

    @Override
    public int makeMove() {
        System.out.print("Please enter your move: '1' for rock, '2' for scissors, '3' for paper ");
        return KeyboardReader.inputInteger();
        }
}
