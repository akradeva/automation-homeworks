package com.methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = myScanner.nextInt();

        System.out.println(isEven(num)) ;
    }

    public static boolean isEven (int number) {
        return number % 2 == 0;
        //return number % 2 == 0 ? true: false;
    }
}
