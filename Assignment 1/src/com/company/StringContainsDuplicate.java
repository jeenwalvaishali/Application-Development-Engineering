package com.company;

import java.util.Scanner;

//Question 3: Write a program to check if string contains duplicates?

public class StringContainsDuplicate {

    public static void main(String[] args) {

        //Creating object of scanner class for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        //Taking user input word
        String word = scanner.nextLine();

        boolean duplicateChar = duplicateCharacters(word);
        if (duplicateChar) {
            System.out.println(word + " is a string with duplicate characters");
        } else {
            System.out.println(word + " is not an duplicate characters string");
        }
    }

    // Method to find duplicate characters in a string input by a user
    public static boolean duplicateCharacters(String word)
    {
        int stringLength = word.length();
        for (int i = 0; i<stringLength ; i++) {
            char fixed = word.charAt(i);
            for (int j = i + 1; j < stringLength; j++) {
                if (fixed == word.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
