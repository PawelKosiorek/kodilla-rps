package com.kodilla.rps;
import java.util.Scanner;

public class KeyboardReader {
    public static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine();
    }
    public static int inputInteger() {
        return scanner.nextInt();
    }

}
