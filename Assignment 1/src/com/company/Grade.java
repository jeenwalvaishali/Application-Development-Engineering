package com.company;

import java.util.Scanner;

//Question 8 : Write a program that prompts the user’s grade.
// Your program should display the corresponding meaning of grade as per the following table
//Grade Meaning
//A Excellent
//B Good
//C Average
//D Deficient
//F Failing

public class Grade {

    public static void main(String[] args)
    {
        //Creating object of scanner class for taking user input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a marks");
        //Taking user input marks
        int marks = scanner.nextInt();
        String result = gradeCalculateSystem(marks);
        System.out.println(result);

        System.out.println("Enter a grade");
        //Taking user input grade
        char gradeSwitch = scanner.next().charAt(0);
        String performanceGrade = switchGrade(gradeSwitch);
        System.out.println(performanceGrade);

    }

    //Method 1 :  function to display grade meaning on the basis of user input grade.

    public static String switchGrade(char grade) {
        String result = null;
       switch(grade){
           case 'A' :
               result ="Excellent Performance";
               break;
           case 'B' :
               result ="Good Performance";
               break;
           case 'C' :
               result ="Average Performance";
               break;
           case 'D' :
               result ="Deficient Performance";
               break;
           case 'E' :
               result ="Failing";
               break;
       }

         return result;

    }

    //Method 2 :  function to display grade, and it's meaning on the basis of user input marks.

    public static String gradeCalculateSystem(int marks)
    {
        String grade;
        if(marks > 90 &&  marks < 100)
        {
             grade = "A";
             return "Your grade is " + grade + " :Excellent Performance";

        }else if(marks > 80 &&  marks < 90)
        {
            grade = "B";
            return "Your grade is " + grade + " :Good Performance";
        }else if(marks > 70 &&  marks < 80)
        {
            grade = "C";
            return "Your grade is " + grade + " :Average Performance";
        }else if(marks > 60 &&  marks < 70)
        {
            grade = "D";
            return "Your grade is " + grade + " :You are Deficient";
        }

        grade = "E";
        return "Your grade is " + grade + " :You are Failed the Exam";
    }
}
