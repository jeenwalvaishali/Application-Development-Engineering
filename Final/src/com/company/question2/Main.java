package com.company.question2;

/*Question 2: String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

Input: "aabcccccaaa"
Output: "a2b1c5a3"
Input: "ab"
Output: "ab"
public String compressString(String str){
     //TODO: Write your code here
}
*
* */

public class Main {

    public static void main(String[] args){

        String str1 = "aabcccccaaa";
        String str2 = "ab";
        System.out.println("Compressed String is " + compressString(str1));
        System.out.println("Compressed string is " + compressString(str2));
    }

    public static String compressString(String str){
        char current  = str.charAt(0);
        int count =1;
        StringBuilder result = new StringBuilder();

        for (int i =1; i< str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count = count+1;
            }else {
                result.append(current);
                result.append(count+"");
                count = 1;
                current = str.charAt(i);
            }
        }
        result.append(current);
        result.append(count);
        return result.toString();
    }
}
