package com.question4;

public class MultiplyOperation implements MathOperation{
    @Override
    public int performOperation(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }
}
