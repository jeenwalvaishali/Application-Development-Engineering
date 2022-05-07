package com.company.question3;
/*Question 3: Given a string s, find the length of the longest substring without repeating characters.

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
public int lengthOfLongestSubstring(String s) {
         //TODO: Write your code here
}
* */


import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        String s = "bbbbb";
        String s2 = "pwwkew";
        System.out.println("Length of Longest substring " + lengthOfLongestSubstring(s));
        System.out.println("Length of Longest substring " + lengthOfLongestSubstring(s2));
    }

    public static int lengthOfLongestSubstring(String s){
        if(s == null){
            throw new NullPointerException();
        }

        int strLength = s.length();

        if (strLength <= 1 ){
            return strLength;
        }

        int maxLength = 0;
        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < strLength; end++){
            char eChar = s.charAt(end);
            if(map.containsKey(eChar)){
                start = Math.max(start, map.get(eChar) + 1);
            }
            map.put(eChar,end);
            maxLength = Math.max(maxLength, end-start + 1);
        }
        return maxLength;
    }
}
