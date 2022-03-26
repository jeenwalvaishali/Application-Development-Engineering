package com.question1;

public class Main {

    public static void main(String[] args) {


        /*Shallow Copy*/
        Student student = new Student("Vaishali", 112, 10 );
        student.printDetails();

        /*Deep Copy*/
        Student student1 = new Student(student);
        student1.printDetails();



    }
}
