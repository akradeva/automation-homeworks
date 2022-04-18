package com.dataStructures;

import java.util.Arrays;
import java.util.Scanner;


public class Task4 {
    //Find biggest element of an array and print it in the console

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the count of the elements in the array: ");
        int count = myScanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            int num = myScanner.nextInt();
            arr[i] = num;
        }

        Arrays.sort(arr);
        int largestNum = arr[arr.length-1];

        System.out.println("The largest number is: ");
        System.out.println(largestNum);
    }
}
