package com.question4;

public class AddOperation implements MathOperation{
    @Override
    public int performOperation(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
