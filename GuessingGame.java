package com.gaming;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        //Menu For the Game
        System.out.println("Welcome to Number Guessing Game ");
        System.out.println("1. Start the game");
        System.out.println("2. Exit the Game");
        System.out.print("Please select the one option ->");
        Logic();

    }

    public static void Logic() {
        Scanner sc = new Scanner(System.in);
        int menuOption = sc.nextInt();

        try {
            switch (menuOption) {
                case 1 -> {
                    System.out.print("Inter the range 0 to ...");
                    int range = sc.nextInt();
                    Random random = new Random();
                    int randomNumber = random.nextInt(range) + 1;
                    int trycount = 0;
                    while (true) {
                        System.out.print("Enter your Guessing Number ->");

                        int userNumber = sc.nextInt();
                        trycount++;

                        if (userNumber == randomNumber) {
                            System.out.println("Correct! YOU WIN");
                            System.out.println("Your number of attempts are " + trycount);
                            System.out.print("Your Score is -> ");
                            if (trycount <= 4) {

                                System.out.println("100 Points");
                            } else if (trycount <= 8) {

                                System.out.println("50 Points");
                            } else {

                                System.out.println("25 Points");
                            }
                            break;
                        } else if (userNumber > randomNumber) {
                            System.out.println("Higher");

                        } else {
                            System.out.println("Lower");
                        }

                    }
                }
                case 2 -> {
                    System.out.println("\n" + "Thank You for playing the game!");
                    System.exit(1);
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            System.out.println("Not getting the right Guess Please try again latter ");
        }


    }
}



