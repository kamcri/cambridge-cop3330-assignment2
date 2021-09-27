/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex35;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] contestants = new String[100];
        String name;
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            contestants[i] = name;
            i += 1;
            if (name.isEmpty()) {
                i -=1;
                winner(contestants, i);
                break;
            }
        }
    }
    public static void winner(String[] contestants, int i)
    {
        Random random = new Random();
        int winner = random.nextInt(i);
        System.out.println("The winner is..." +contestants[winner]+"!");
    }
}
