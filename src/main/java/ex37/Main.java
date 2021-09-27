/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex37;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    static int x;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length, specialCh, numbers;
        Random random = new Random();
        String randomPassword = " " ;

        System.out.println("What's the minimum length?");
        length = sc.nextInt();//8
        System.out.println("How many special characters?");
        specialCh = sc.nextInt();//2
        System.out.println("How many numbers?");
        numbers = sc.nextInt();//2

        //
        for(int i = 0; i >=length; i++)
        {
            //adding the special characters
            //adding the numbers
        }
        List<Integer> listCharacters = new ArrayList<Integer>();
        listCharacters.add(specialCh);
        List<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(numbers);//List will only have the number 2??

        while(listNumbers.size() < numbers)
        {
            x = random.nextInt(10);
            listNumbers.add(x);
        }
    }
}
