/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex27;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
public class Main
{
    static String valid = "";
    static boolean validateName(String Name)
    {
        boolean result = true;

        if(Name.length() < 2)
        {
            valid = valid + "The first name must be at least 2 characters long.\n";
            result = false;
        }
        if(Name.length() == 0)
        {
            valid = valid + "The first name must be filled in.\n";
            result = false;
        }
        return result;
    }
    static boolean validateID(String empID)
    {
        boolean result = true;

        Pattern p = Pattern.compile("[a-zA-Z]{2}[-]{1}[0-9]{4}");
        Matcher m = p.matcher(empID);
        if(!empID.equals(p))
        {
            valid = valid + "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }
    static boolean validateZip(String zipCode)
    {
        boolean result = true;
        try
        {
            int zip = Integer.parseInt(zipCode);
            if(zipCode.length() != 5)
            {
                valid = valid + "The zipcode must be a 5 digit number.\n";
                result = false;
            }
        }
        catch (Exception e)
        {
            valid = valid + "The zipcode must be a 5 digit number.\n";
            result = false;
        }
        return result;
    }
    public static void validateAll(String first, String last, String ID, String zip)
    {
        boolean firstN = validateName(first);
        boolean lastN = validateName(last);
        boolean emp = validateID(ID);
        boolean zipCode = validateZip(zip);

        if(firstN && lastN && emp && zipCode)
        {
            valid = "There were no errors found.\n";
        }
        System.out.println(valid);
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String fName, lName, empID, zipCode;

        System.out.println("Enter the first name:");
        fName = sc.next();
        System.out.println("Enter the last name:");
        lName = sc.next();
        System.out.println("Enter the ZIP code:");
        zipCode = sc.next();
        System.out.println("Enter the employee ID:");
        empID = sc.next();

        validateAll(fName, lName, empID, zipCode);
    }
}
