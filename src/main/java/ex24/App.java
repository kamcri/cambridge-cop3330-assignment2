/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex24;
import java.util.Arrays;
import java.util.Scanner;
public class App
{
    static void isAnagram(String s1, String s2)
    {
        if(s1.length() == s2.length())
        {
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean ans = Arrays.equals(str1, str2);
            if (ans)
            {
                System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are anagrams.");
            }
            else {
                System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are not anagrams.");
            }
        }
        else
            System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are not anagrams.");
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams");
        System.out.println("Enter the first string:");
        String first = sc.next();
        System.out.println("Enter the second string:");
        String second = sc.next();

        isAnagram(first, second);
    }
}
