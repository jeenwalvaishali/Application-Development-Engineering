package com.company;

public class Shape {

     String name;
     double perimeter;
     double area;

    public Shape() {
    }

    public void display(){
        System.out.println("Perimeter " + this.perimeter );
        System.out.println("Area " + this.area );
    }
}
