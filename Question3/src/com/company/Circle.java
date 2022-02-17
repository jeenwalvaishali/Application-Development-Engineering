package com.company;

public class Circle extends Shape{

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea(){
        area = 3.14 * this.radius * this.radius;
        System.out.println("Area of the circle is " + area);
    }

    public void computePerimeter(){
        perimeter = 2 * 3.14 * this.radius;
        System.out.println("Perimeter of the circle is " + perimeter);
    }

}
