package com.methods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = myScanner.nextLine();

        displayMiddleChars(input);
    }

    public static void displayMiddleChars(String input) {

        System.out.println("The middle character(s) of the entered string '" + input + "' is(are): ");

        if (input.length() % 2 == 0) {
            System.out.println(input.charAt(input.length() / 2));
            System.out.println(input.charAt((input.length() / 2) - 1));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
