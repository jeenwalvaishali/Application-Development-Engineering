package com.company;

import java.util.Scanner;

 //Question 1: Write a program find if String is Palindrome?

public class Palindrome {

    public static void main(String[] args) {
        //Creating object of scanner class for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        //Taking user input word
        String word = scanner.nextLine();

        boolean result = palindromeString(word);
        if (result) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    // Method to check whether string is palindrome or not.
    public static boolean palindromeString(String word)
    {
        int mid = word.length()/2;
        int stringLength = word.length();
        for(int i = 0; i < mid;  i++){
            if (word.charAt(i) == word.charAt(stringLength-1))
            {
                stringLength--;
            }else{

                return false;
            }
        }
        return true;
    }


}
