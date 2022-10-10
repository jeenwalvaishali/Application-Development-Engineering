package com.company;

import java.util.Scanner;

//Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

public class RansomNote {

    public static void main(String[] args)
    {
        //Creating object of scanner class for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ransom Note");
        //Taking user input ransomNote
        String ransomNode = scanner.nextLine();

        System.out.println("Enter Magazine");
        //Taking user input magazine
        String magazine = scanner.nextLine();

        boolean result = checkRansomNote(ransomNode, magazine);
        if(result){
            System.out.println("Ransom "+ransomNode+" can be constructed from magazine "+magazine);
        }else{
            System.out.println("Ransom "+ransomNode+" can not be constructed from magazine "+magazine);
        }

    }

    // Method to check that ransomNote string can be created from magazine string or not.
    public static boolean checkRansomNote(String ransomNote, String magazine)
    {
        int[] ransomNoteArray = new int[26];
        int[] magazineArray = new int[26];

        for(int i=0; i<ransomNote.length(); i++){
            ransomNoteArray[ransomNote.charAt(i)-'a']++;
        }

        for(int i = 0; i<magazine.length(); i++){
            magazineArray[magazine.charAt(i)-'a']++;
        }

        for(int i = 0; i<ransomNoteArray.length; i++)
        {
            if(!(magazineArray[i] >= ransomNoteArray[i]))
            {
                return false;
            }
        }
        return true;
    }

}
