package com.methods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = myScanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = myScanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum = myScanner.nextInt();

        System.out.println(findSmallestNum(firstNum, secondNum, thirdNum));

    }

    public static int findSmallestNum(int firstNum, int secondNum, int thirdNum) {
        int smalestNum = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (smalestNum > i) {
                //smalestNum = [i];
            }
//            ArrayList<Integer> numbers = new ArrayList<>(3);
//            numbers.sort();
//
            return smalestNum;
        }
        return smalestNum;
    }
}

