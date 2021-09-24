/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex28;
import java.util.Scanner;
public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers to add?");
        int counter = sc.nextInt();
        int[] numbers = new int[counter];
        int i, x, sum = 0;

        for(i = 0; i < counter; i++)
        {
            System.out.println("Enter a number:");
            x = sc.nextInt();
            numbers[i] = x;
            sum = sum + numbers[i];
        }
        System.out.println("The total is " +sum);
        sc.close();
    }
}
