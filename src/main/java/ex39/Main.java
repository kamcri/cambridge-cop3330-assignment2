/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex39;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Map<String,String> myMap = new HashMap<>();

        myMap.put("John Johnson", "Manager");
        myMap.put("Tou Xiong", "Software Engineer");
        myMap.put("Michaela Michaelson", "District Manager");
        myMap.put("Jake Jacobson", "Programmer");
        myMap.put("Jacquelyn Jackson", "DBA");
        myMap.put("Sally Webber", "Web Developer");

        displayMap(myMap);
    }
    private static void displayMap(Map<String, String> map)
    {
        Set<String> positions = map.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(positions);

        System.out.printf("Name\t\t\t\t|Position\t\t\t |Separation Date%n");
        System.out.println("--------------------|--------------------|-----------------");
        for(String position : sortedKeys)
        {
            System.out.printf("%-20s|%-20s|%n", position, map.get(position));
        }
    }
}

