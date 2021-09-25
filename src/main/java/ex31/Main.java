/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex31;
import java.util.Scanner;
import java.lang.String;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int restPulse = 0, age = 0;
        double targetHR;

        while(age < 1)
        {
            System.out.println("What is your age: ");
            age = sc.nextInt();

            if(age < 1)
                System.out.println("Invalid age.");
        }
        while (restPulse < 1)
        {
            System.out.println("What is your resting heart rate: ");
            restPulse = sc.nextInt();

            if(restPulse < 1)
                System.out.println("Invalid heart rate.");
        }

        System.out.printf("Resting Pulse: %d  Age: %d\n", restPulse, age);
        System.out.println("Intensity   | Rate");
        System.out.println("------------|---------");
        for(int intensity = 55; intensity <= 95; intensity += 5)
        {
            targetHR = (((220 - age) - restPulse) * (intensity/100.0)) + restPulse;
            System.out.printf("%d%% \t\t| %.0f bpm\n", intensity, targetHR);
        }
    }
}
