package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string?

public class AnagramStrings {

    public static void main(String[] args) {

        //Creating object of scanner class for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first string");

        //Taking user input word1
        String word1 =  scanner.nextLine();
        System.out.println("Enter a first string");

        //Taking user input word2
        String word2 = scanner.nextLine();
        boolean isAnagram =  anagramString(word1, word2);
        if(isAnagram)
        {
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("Stings are not Anagram");
        }
    }

    // Method to check that input strings are anagram or not.
    public static boolean anagramString(String word1, String word2)
    {
        int length1= word1.length();
        int length2 = word2.length();

        if(length1 == length2)
        {
            //converting string to lower case
            String str1 = word1.toLowerCase();
            String str2 = word2.toLowerCase();

            //sorting string using sortWord method
            String sortedWord1 = sortWord(str1);
            String sortedWord2 = sortWord(str2);

            //comparing both strings
            if(sortedWord1.equals(sortedWord2))
            {
                return true;
            }
        }
        return false;
    }

    public static String sortWord(String word){
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }


}
