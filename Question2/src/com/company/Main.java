package com.company;

//Create a Shape class and a sub classes triangle, rhombus
//1) Create getter and setter methods for all classes.
//2) Create printShape() method in Shape class that returns desired string output.
//3) Override the getArea() and getPerimeter() getter methods of Shape in triangle
//and rhombus to give desired output.


public class Main {

    public static void main(String[] args) {

        //Area of triangle(base and height given)
        Triangle triangleArea = new Triangle(20,30);
        double area = triangleArea.getArea();
        String shapeName = triangleArea.printShape();
        System.out.println("Area of " + shapeName + " is " + area);

        System.out.println("-------------------------------------------------------------------");

        //Area of triangle(single side given)
        Triangle equilateral = new Triangle(20);
        double equilateralArea = equilateral.getArea();
        System.out.println("Area of equilateral " + shapeName + " is " + equilateralArea);

        System.out.println("-------------------------------------------------------------------");

        //Perimeter of triangle(base and height give)
        Triangle trianglePerimeter = new Triangle(20,30);
        double perimeterTriangle = trianglePerimeter.getPerimeter();
        System.out.println("Perimeter of " + shapeName + " is " + perimeterTriangle);

        System.out.println("-------------------------------------------------------------------");

        //Perimeter of triangle(single side given)
        Triangle equilateralPerimeter = new Triangle(20);
        double perimeterEquilateralTriangle = equilateralPerimeter.getPerimeter();
        System.out.println("Perimeter of equilateral " + shapeName + " is " + perimeterEquilateralTriangle);

        System.out.println("-------------------------------------------------------------------");

        //Area of rhombus(base and height given)
        Rhombus rhombusArea = new Rhombus(12,26);
        double area2 = rhombusArea.getArea();
        String shapeName2 = rhombusArea.printShape();
        System.out.println("Area of " + shapeName2 + " when base and height is given: " + area2);

        System.out.println("-------------------------------------------------------------------");

        //Area of rhombus(single side is given)
        Rhombus singleSideRhombusArea = new Rhombus(12);
        double areaRhombus = singleSideRhombusArea.getArea();
        System.out.println("Area of " + shapeName2 + " when single side is given:  " + areaRhombus);

        System.out.println("-------------------------------------------------------------------");

        //Perimeter of rhombus(base and height is given)
        Rhombus rhombusPerimeter = new Rhombus(12, 13);
        double perimeterRhombus = rhombusPerimeter.getPerimeter();
        System.out.println("Perimeter of " + shapeName2 + " when base and height is given: " + perimeterRhombus);

        System.out.println("-------------------------------------------------------------------");

        //Perimeter of rhombus(Single Side given)
        Rhombus rhombusPerimeter2 = new Rhombus(12);
        double perimeterRhombus2 = rhombusPerimeter2.getPerimeter();
        System.out.println("Perimeter of " + shapeName2 + " when single side is given: " + perimeterRhombus2);

    }
}
