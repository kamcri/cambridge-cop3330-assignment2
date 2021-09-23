/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex26;
import java.util.Scanner;
public class PaymentCalculator
{
    static double calculateMonthsUntilPaidOff(double balance, double apr, double monthPay)
    {
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double n;
        n = ((-1.0 / 30.0) * (Math.log(1.0 + (balance / monthPay) * (1.0 - Math.pow(1.0 + apr, 30.0)))))
                / Math.log(1.0 + apr);
        n = Math.ceil(n);

        return n;
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double months;

        System.out.println("Enter the balance on your card: ");
        double balance = sc.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");

        double APR = sc.nextDouble();
        APR /= 100.0;
        APR /= 365.0;

        System.out.println("What is the monthly payment you can make?");
        double monthPay = sc.nextDouble();

        months = calculateMonthsUntilPaidOff(balance, APR, monthPay);

        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
