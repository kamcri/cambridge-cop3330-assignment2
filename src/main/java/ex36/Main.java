/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex36;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<String>();
        String input;
        int i = 0;
        int avg;
        int min;
        int max;
        double dev;

        while(true)
        {
            System.out.println("Enter a number: ");
            input = sc.next();
            values.add(input);
            i++;
            if(input.equals("done"))
            {
                i--;
                values.remove(i);
                break;
            }
        }
        System.out.print("Numbers: ");
        for (String value : values)
        {
            System.out.print(value+", ");
        }
        avg = average(values);
        min = min(values, input);
        max = max(values, input);
        dev = std(values, avg);
        System.out.println("\nThe average is "+avg);
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);
        System.out.printf("The standard deviation is %.2f", dev);
    }
    public static int average(List<String> values)
    {
        int sum = 0;
        int avg = 0;

        for(String i : values)
        {
            int x = Integer.parseInt(i);
            sum += x;
        }
        avg = sum / values.size();
        return avg;
    }
    public static int min(List<String> values, String i)
    {
        i = Collections.min(values);
        int min = Integer.parseInt(i);
        return min;
    }
    public static int max(List<String> values, String i)
    {
        i = Collections.max(values);
        int max = Integer.parseInt(i);
        return max;
    }
    public static double std(List<String> values, int avg)
    {
        double sum = 0.0;
        //square root of sum of (each element - avg)^2 divided by number of elements
        for(String i : values)
        {
            double x = Double.parseDouble(i);//i as a double
            sum += Math.pow(x - avg, 2);
        }
        //take square root
        double sq = sum / values.size();
        double ans = Math.sqrt(sq);

        return ans;
    }
}
