package com.company.question4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int n2 = 3;
        System.out.println("Unique Integer Array is " + Arrays.toString(sumZero(n)));
        System.out.println("Unique Integer Array is" + Arrays.toString(sumZero(n2)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            result[i] = i + 1;
            result[i + 1] = -(i + 1);
        }
        return result;
    }

}
