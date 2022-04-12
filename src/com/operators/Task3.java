package com.operators;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        int unitPrice = myScanner.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = myScanner.nextInt();
        double discount;
        double percentage = 0;
        if (quantity < 100) {
            discount = 0;
        } else if (quantity <= 120) {
            discount = (quantity * unitPrice) * 0.15;
            percentage = 15.0;
        } else {
            discount = (quantity * unitPrice) * 0.20;
            percentage = 20.0;
        }

        System.out.println("The revenue from sale: " + ((quantity * unitPrice) - discount) + "$");
        if (discount != 0) {
            System.out.println("Discount: " + discount + "$(" + percentage + "%)");
        }
    }
}
