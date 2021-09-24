/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex25;
import java.util.Scanner;
public class App
{
    static void passwordValidator(String password)
    {
        /*check for number of characters
        int length = password.length();

        boolean numbersOnly = false, lettersOnly = false;

        if(numbersOnly == true && length < 8)
        {

        } */

        /* Uses a single output statement.
        if(password == numbers only && less than 8 characters)
        {
                very weak
        }
        else if(password == letters only && less than 8 characters)
        {
                weak
        }
        else if(password == >= 1 number && >= 8 characters)
        {
                strong
        }
        else
                very strong
         */
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = sc.next();
    }
}
