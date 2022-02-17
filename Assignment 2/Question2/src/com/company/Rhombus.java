package com.company;

public class Rhombus extends Shape {

    private int diagonal1;
    private int diagonal2;

    public Rhombus(int diagonal1, int diagonal2) {
        super("Rhombus","Red");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(int diagonal1) {
        super("Rhombus","Red");
        this.diagonal1 =diagonal1;
        this.diagonal2=diagonal1;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {
        this.area = 0.5* (this.diagonal1 * this.diagonal2);
        return area;
    }

    @Override
    public double getPerimeter() {
        if(this.diagonal1 == this.diagonal2){
            this.perimeter = 2 * Math.sqrt(2)*diagonal1;
        }else {
            this.perimeter = 2 * Math.sqrt(diagonal1*diagonal1 + diagonal2*diagonal2);
        }
        return perimeter;
    }

    @Override
    public String printShape() {
        return this.name;
    }
}