/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex38;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Enter a list of numbers, separated by spaces: ");
        input = sc.nextLine();

        String[] items = input.split(" ");
        int[] array = new int[items.length];

        for (int i = 0; i < items.length; i++)
        {
            array[i] = Integer.parseInt(items[i]);
        }
        System.out.print("The even number(s) are: ");
        filterEvenNumbers(array);
    }
    public static int[] filterEvenNumbers(int[] array)
    {
        int isEven;
        for(int number : array)
        {
            isEven = number % 2;
            if(isEven == 0)
            {
                System.out.print(number+" ");
            }
        }
        return array;
    }
}
