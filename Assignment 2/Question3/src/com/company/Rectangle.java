package com.company;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea(){
        this.area = this.length * this.width;
        System.out.println("Area of rectangle is " + area);
    }

    public void computePerimeter(){
        this.perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
