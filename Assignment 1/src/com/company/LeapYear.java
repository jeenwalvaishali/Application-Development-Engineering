package com.company;

import java.util.Scanner;


//Question 5:  Write a program to determine whether the year is a leap year or not?
// Leap Years are any year that can be evenly divided by 4.
// A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.

public class
LeapYear {

    public static void main(String[] args){
        //Creating object of scanner class for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");

        //Taking user input year
        int year = scanner.nextInt();
        boolean result = isLeapYear(year);
        if(result){
            System.out.println(year + " is a leap year");
        }else
        {
            System.out.println(year + " is not a leap year");
        }

    }

    // Method to check that input year is leap year or not.
    public static boolean isLeapYear(int year){
        if (year%4 == 0){
            if(year%100 == 0)
            {
                if (year%400 == 0)
                {
                    return true;
                }else {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }


}
