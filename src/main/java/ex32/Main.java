/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex32;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int level = 0, number = 0, guess = 0;
        char again;

        System.out.println("Let's play Guess the Number!");

        do {
            Guess(sc, guess, number, level);
            System.out.println("Do you wish to play again? (Y/N)");
            sc.nextLine();
            again = sc.next().charAt(0);
        }while (again == 'Y' || again == 'y');
    }
    public static void Guess (Scanner sc, int guess, int number, int level)
    {
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        level = sc.nextInt();

        Random random = new Random();

        if (level == 1) {
            number = random.nextInt(10) + 1;
        }
        if (level == 2) {
            number = random.nextInt(100) + 1;
        }
        if (level == 3) {
            number = random.nextInt(1000) + 1;
        }
        int counter = 0;

        System.out.println("I have my number. What's your guess?");
        guess = sc.nextInt();
        while (guess != number)
        {
            if(guess > number)
            {
                System.out.println("Too high. Guess again.");
                guess = sc.nextInt();
                counter += 1;
            }
            if(guess < number)
            {
                System.out.println("Too low. Guess again");
                guess = sc.nextInt();
                counter += 1;
            }
        }
        if (guess == number)
        {
            counter += 1;
            System.out.println("You got it in " +counter+" guesses!");
        }
        if(counter == 1)
            System.out.println("You're a mind reader!");
        if(counter >= 2 && counter <= 4)
            System.out.println("Most impressive.");
        if(counter == 5 || counter == 6)
            System.out.println(" “You can do better than that.");
        if(counter >= 7)
            System.out.println("Better luck next time.");
    }

}

