/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex29;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    static boolean isNumber(String input)
    {
        boolean result = true;
        Pattern p = Pattern.compile("^[0-9]*$");
        Matcher m = p.matcher(input);
        if(!input.equals(p))
        {
            System.out.println("Please enter a number.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rate = "";
        boolean isNum = isNumber(rate);

        while (rate.isEmpty())
        {
            System.out.println("What is the rate of return?");
            rate = sc.nextLine();
            if (rate == "0")
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        int r = Integer.parseInt(rate);
        int years = 72 / r;
        System.out.println("It will take " +years+" years to double your initial investment.");
    }

}
