package com.methods;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("The average of the entered numbers is: " +
                String.format("%.2f", computeAverageNum(1, 5, 8)));
    }

    static double computeAverageNum(double firstNum, double secondNum, double thirdNum) {
        return (firstNum + secondNum + thirdNum) / 3.0;
    }
}
