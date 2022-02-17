package com.company;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height ) {
        super("Triangle","Blue");
        this.base = base;
        this.height = height;
    }

    public Triangle(int side) {
        super("Triangle","Blue");
        this.base = side;
        this.height = side;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        this.area = 0.5 * this.base * this.height;
        return area;
    }

    @Override
    public double getPerimeter() {
        if(this.base == this.height){
            // Assuming Triangle is Equilateral Triangle
            this.perimeter = this.base + this.base + this.base;
        }else{
            // Assuming Triangle is Right Angle Triangle
            double c = Math.sqrt(this.base*this.base + this.height*this.height);
            this.perimeter = this.base + this.height + c;
        }

        return perimeter;
    }

    @Override
    public String printShape() {
        return this.name;
    }
}
