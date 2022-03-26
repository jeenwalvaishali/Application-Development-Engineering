package com.question4;

public class SubtractOperation implements MathOperation{
    @Override
    public int performOperation(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }
}
