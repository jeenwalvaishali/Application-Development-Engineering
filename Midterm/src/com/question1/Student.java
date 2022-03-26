package com.question1;

public class Student {

    private String studentName;
    private int studentId;
    private int gpa;

    public Student(String studentName, int studentId, int gpa) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public Student(Student student){
        this.studentName = student.getStudentName();
        this.studentId = student.getStudentId();
        this.gpa = student.getGpa();
    }

    /*getter and setter*/
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    /*Method to printDetails of student*/
    public void printDetails(){
        System.out.println("Name of student: " + this.studentName);
        System.out.println("Id of student: " + this.studentId);
        System.out.println("Gpa of student: " + this.gpa);
    }
}
