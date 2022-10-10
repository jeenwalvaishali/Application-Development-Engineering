package com.company;

//Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
//Plus $ 0.60 per call for next 50 calls.
//Plus $ 0.50 per call for next 50 calls.
//Plus $ 0.40 per call for any call beyond 200 calls.
//Use Switch Statement in the function.

public class Billing {

    public static void main(String[] args) {
        int calls = 201;
        double bill = 0;

        if (calls > 200) {
            bill = 0.40 * (calls - 200);
            calls = 200;
            bill = calculateBill(calls, bill);
            calls = 0;
        }

        if (calls <= 200 && calls > 150) {
            bill = 0.50 * (calls - 150);
            calls = 150;
            bill = calculateBill(calls, bill);
            calls = 0;
        }

        if (calls <= 150 && calls > 100) {
            bill = 0.60 * (calls - 100);
            calls = 0;
            bill = calculateBill(calls, bill);
        }

        if (calls <= 100 && calls > 0) {
            bill = calculateBill(calls, bill);
        }

        System.out.println("Bill " + bill);
    }

    //Method to calculate telephone bill on the basis of input call
    public static double calculateBill(int calls, double bill) {
        switch (calls) {
            case 200:
                bill = bill + 0.50 * 50;
                calls = 150;
            case 150:
                bill = bill + 0.60 * 50;
                calls = 100;
            default:
                bill = bill + 200;
        }
        return bill;
    }

}
