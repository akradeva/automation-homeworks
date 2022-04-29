package com.methods;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = myScanner.nextInt();

        if (input < 0) {
            System.out.println("Invalid input. The input must be a positive number.");
        } else if (isPalindrome(input)) {
            System.out.println("The entered number '" + input + "' is a palindrome.");
        } else {
            System.out.println("The entered number '" + input + "' is NOT a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {

        int input = number;
        int reverse = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            reverse *= 10;
            reverse += lastDigit;
            input /= 10;
        }

        return number == reverse;
        //return (number == reverse) ? true : false;
    }
}
