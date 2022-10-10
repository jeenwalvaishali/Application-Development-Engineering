package com.company;

import java.util.Scanner;

//Question 10: Implement a class Box {
//  double width;
//  double height;
//  double depth;
//}
//Initialize the value through constructor. Write a function to calculate the box volume.

public class Box {
    double width;
    double height;
    double depth;
    double volume;

    //constructor declaration of class box
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Method to calculate volume of a box
    public double getVolume()
    {
        this.volume = this.width * this.height * this.depth;
        return volume;
    }

}

class MainBoxVolume{

    public static void main(String[] args)
    {
        //Creating object of scanner class for taking user input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of Box");
        //Taking user input width
        double width = scanner.nextDouble();

        System.out.println("Enter height of Box");
        //Taking user input height
        double height = scanner.nextDouble();

        System.out.println("Enter depth of Box");
        //Taking user input depth
        double depth = scanner.nextDouble();

        //Creating object of class box
        Box box = new Box(width,height,depth);

        //Calculating box volume
        double volume = box.getVolume();
        System.out.println("Volume of box " + volume);

    }


}
