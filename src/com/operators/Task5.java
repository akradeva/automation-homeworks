package com.operators;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a destination: ");
        String destination = myScanner.nextLine();
        System.out.println("Enter a budget per day per person: ");
        int budget = myScanner.nextInt();

        switch(destination){
            case "Beach":
                if (budget < 50){
                    System.out.println("My advise is to choose Bulgaria as a destination.");
                } else {
                    System.out.println("You can afford to go outside Bulgaria as a destination.");
                }
                break;
            case "Mountain":
                if (budget < 30){
                    System.out.println("My advise is to choose Bulgaria as a destination.");
                } else {
                    System.out.println("You can afford to go outside Bulgaria as a destination.");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
        }
    }
}
