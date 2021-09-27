/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex33;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();

        magicBall(question);
    }
    public static void magicBall(String question)
    {
        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

        Random random = new Random();
        int i = random.nextInt(3);

        System.out.println(answers[i]);
    }
}
