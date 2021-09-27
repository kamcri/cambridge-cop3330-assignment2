/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex36;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<Integer>();
        String input;
        int i = 0;
        while(true)
        {
            System.out.println("Enter a number: ");
            input = sc.next();
            values.add(Integer.valueOf(input));
            i++;
            if(input.equals("done"))
            {
                i--;
                break;
            }
        }
        findAvg(values);
    }
    public static int findAvg(List<Integer> values)
    {
        int sum = 0;
        int avg = 0;

        for(int i : values)
        {
            sum += i;
        }
        avg = sum / values.size();
        return avg;
    }
}
