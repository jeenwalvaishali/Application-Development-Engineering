package com.company;

import java.util.Scanner;

//Question2: Write a program to check if a string has all unique characters.

public class UniqueCharacters {

    public static void main(String[] args) {

        //Creating object of scanner class for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        //Taking user input word.
        String word = scanner.nextLine();
        boolean uniqueChar = uniqueCharacters(word);
        if (uniqueChar) {
            System.out.println(word + " is a string with unique characters");
        } else {
            System.out.println(word + " is not an unique characters string");
        }
    }

    // Method to check string contains unique characters or not/
    public static boolean uniqueCharacters(String word)
    {
        int stringLength = word.length();
        for (int i = 0; i<stringLength ; i++)
        {
            char fixed = word.charAt(i);
            for (int j = i+1;  j<stringLength; j++) {
                if (fixed == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    }
