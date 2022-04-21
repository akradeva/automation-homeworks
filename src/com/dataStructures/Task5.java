package com.dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task5 {
    //Reverse the order of the elements in a LinkedList using algorithm

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the count of the elements in the linked list: ");
        int count = myScanner.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            int num = myScanner.nextInt();
            list1.add(num);
        }
        System.out.println("The given list is: " + list1);
        Collections.reverse(list1);
        System.out.println("The reversed list is: " + list1);
    }
}
