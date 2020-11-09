package com.kodilla.rps;



public class RpsRunner {

    public static void rpsRunner() {
        System.out.println("Instruction: ");
        System.out.println("Please enter '1' for rock, '2' for scissors, '3' for paper");
        System.out.println("'n' if you wish to start a new game, 'x' to exit");
        System.out.print("Please enter your name: ");
        String name = KeyboardReader.inputString();
        System.out.print("Up to how many winnings?  ");
        int winnings = Integer.parseInt(KeyboardReader.inputString());
        Game game = new Game(new Player("Computer", winnings), new Human(name, winnings));
        game.playGame();
    }
    public static void play() {
        boolean end = false;
        while(!end) {
            rpsRunner();
            System.out.print("Enter 'n' to play a new game, 'x' to finish ");
            if(KeyboardReader.inputString() == "n") { end = false; }
            if(KeyboardReader.inputString() == "x"){ end = true; }
        }
    }





    public static void main(String[] args) {
        RpsRunner.play();

    }

}
