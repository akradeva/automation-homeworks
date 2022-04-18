package com.dataStructures;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Print elements of a given 2-d matrix with dynamic rows and columns taken from user input

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of the rows: ");
        int rows = myScanner.nextInt();
        System.out.println("Enter the number of the columns: ");
        int columns = myScanner.nextInt();

        int[][] arr = new int[rows][columns];
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j] = i+1;            //опитах да въведа поредни цифри, ама нещо не ми се получи
            }
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
