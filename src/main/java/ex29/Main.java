/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex29;
import java.util.Scanner;
public class Main {
    static boolean isNumber(String input)
    {
        String regex = "^[0-9]+$";
        if(!input.matches(regex))
        {
            System.out.println("Please enter a number.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rate;
        int years;

        while (true)
        {
            System.out.println("What is the rate of return?");
            rate = sc.nextLine();
            boolean isNum = isNumber(rate);
            if (isNum);//check if it is a number
            {
                if(rate == "0")//is it zero
                {
                    System.out.println("Sorry. That's not a valid input.");
                    sc.next();
                }
                else
                {
                    int r = Integer.parseInt(rate);
                    years = 72 / r;
                    break;
                }
            }
        }
        System.out.println("It will take " +years+" years to double your initial investment.");
    }
}
