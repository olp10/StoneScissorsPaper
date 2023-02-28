package org.example;


import java.util.Random;
import java.util.Scanner;

public class StoneScissorsPaper {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Stone, Paper, Scissors");
        System.out.println("1. Stone");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Quit");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != 4) {
            int randomNumber = random.nextInt(3);
            if (choice == 1) {
                System.out.println("You chose: Stone");
                if (randomNumber == 0) {
                    System.out.println("Computer chose: Scissors");
                    System.out.println("You win!");
                } else if (randomNumber == 1) {
                    System.out.println("Computer chose: Paper");
                    System.out.println("You lose!");
                } else {
                    System.out.println("Computer chose: Stone");
                    System.out.println("Draw!");
                }
            } else if (choice == 2) {
                System.out.println("You chose: Paper");
                if (randomNumber == 0) {
                    System.out.println("Computer chose: Stone");
                    System.out.println("You lose!");
                } else if (randomNumber == 1) {
                    System.out.println("Computer chose: Scissors");
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer chose: Paper");
                    System.out.println("Draw!");
                }
            } else if (choice == 3) {
                System.out.println("You chose: Scissors");
                if (randomNumber == 0) {
                    System.out.println("Computer chose: Paper");
                    System.out.println("You lose!");
                } else if (randomNumber == 1) {
                    System.out.println("Computer chose: Stone");
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer chose: Scissors");
                    System.out.println("Draw!");
                }
            }
            System.out.println("1. Stone");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

        }

        }
}