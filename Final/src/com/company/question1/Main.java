package com.company.question1;

/*Question1: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Input: s = "()[]{}"
Output: true
Input: s = "(]"
Output: false
public boolean isValid(String s) {
        //TODO: Write your code here
}
*
*
* */

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
         String str1 = "()[]{}";
         String str2 = "(]";
         System.out.println("Is given string is valid " + isValid(str1));
         System.out.println("Is given string is  valid " + isValid(str2));
    }

    public static boolean isValid(String str) {
        char[] strToCharArray = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (Character ch : strToCharArray) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size() == 0;
    }

}
