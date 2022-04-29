package com.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("The smallest from all entered numbers is: " + findSmallestNum());

    }

    public static int findSmallestNum() {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the count of the numbers you want to check from: ");
        int smallestNum = Integer.MAX_VALUE;
        int count = myScanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>(count);

        for (int i=0; i<count; i++){
            System.out.println("Enter a number: ");
            int inputNum = myScanner.nextInt();
            numbers.add(i, inputNum);
        }
        // with foreach:
        for (Integer number : numbers) {
            if (smallestNum > number) {
                smallestNum = number;
            }
        }

        // with for loop:
//        for (int j = 0; j < numbers.size(); j++){
//            if (smallestNum > numbers.get(j)) {
//                smallestNum = numbers.get(j);
//            }
//        }

        return smallestNum;
    }
}

