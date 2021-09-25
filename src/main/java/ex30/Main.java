/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex30;
import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args)
    {
        String b = JOptionPane.showInputDialog("Enter a number for your base:" );
        JOptionPane.showMessageDialog(null, "Multiplication table for " +b);
        int base =Integer.parseInt(b);
        int r, c;
        for(r = 1; r <= base; r++)
        {
            for(c = 1; c <= base; c++)
            {
                System.out.printf("%4d", r*c);
            }
            System.out.printf("\n");
        }
    }
}
