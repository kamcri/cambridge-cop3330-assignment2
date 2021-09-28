/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex25;
import java.util.Scanner;
public class App
{
    static int passwordValidator(String password)
    {
        int strength = 0;
        String regex = "^[0-9]+$";
        String regex2 = "^[a-zA-Z]+$";
        String regex3 = "^[a-zA-Z0-9]+";
        String regex4 = "^[a-zA-Z-9\\cX]+$";
        if(password.length() < 8) {
            if (password.matches(regex)) {
                return 1;
            }
            if (password.matches(regex2)) {
                return 2;
            }
        }
        if(password.length() >= 8)
        {
            if(password.matches(regex3)){
                return 3;
            }
            if(password.matches(regex4)) {
                return 4;
            }
        }
        return strength;
    }
    public static void main( String[] args )
    {
        int strength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = sc.next();
        strength = passwordValidator(password);

        if(strength == 1)
        {
            System.out.println(password +" is a very weak password.");
        }
        if(strength == 2)
        {
            System.out.println(password+ " is a weak password.");
        }
        if(strength == 3)
        {
            System.out.println(password +" is a strong password.");
        }
        if(strength == 4)
        {
            System.out.println(password +" is a very strong password.");
        }
    }
}
