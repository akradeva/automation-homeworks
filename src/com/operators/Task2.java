package com.operators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please, enter your age: ");
        int age = myScanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are NOT eligible to work.");
        }




    }
}
