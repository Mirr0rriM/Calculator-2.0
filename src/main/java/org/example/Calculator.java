package org.example;

public class Calculator {

    public int addition(int a, int b){
        int result = a + b;
        return result;
    }

    public int subtraction (int a, int b){
        int result = a - b;
        return result;
    }

    public int multiplication (int a, int b){
        int result = a * b;
        return result;
    }

    public int division (int a, int b) throws Exception {
        int result = a / b;
        return result;
    }
}

