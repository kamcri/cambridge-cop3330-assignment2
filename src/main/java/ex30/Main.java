/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex30;
public class Main
{
    public static void main(String[] args)
    {
        int r, c;
        for(r = 1; r <= 12; r++)
        {
            for(c = 1; c <= 12; c++)
            {
                System.out.printf("%4d", r*c);
            }
            System.out.printf("\n");
        }
    }
}
