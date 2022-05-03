package com.methods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = myScanner.nextLine();

        displayMiddleChars(input);

        System.out.println("Enter a string to count the words in: ");
        String inputWords = myScanner.nextLine();
        System.out.println("The count of the words in the entered string '"
                + inputWords + "' is: " + countWords(inputWords));
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

    public static int countWords(String input) {

        // A solution with an array:
        String[] words = input.split(" ");
        return words.length;


        // A solution with a loop:

//        int count = 1;
//        for (int i=0; i<input.length(); i++) {
//           if (input.charAt(i) == ' '){
//               count++;
//           }
//        }
//        return count;
    }
}
