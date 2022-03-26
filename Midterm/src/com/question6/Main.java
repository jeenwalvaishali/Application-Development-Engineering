package com.question6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        longestSubstring();
    }

    public static void longestSubstring(){
        String str = "abcabcbb";
        int strLength = str.length();
         for (int i=0; i<strLength; i++){
             char fixed = str.charAt(i);
             for (int j=1; j<strLength; j++){
                 if(fixed == str.charAt(j)){
                     System.out.println("string" + fixed + str.charAt(j) );
                 }
             }
         }

    }

}
