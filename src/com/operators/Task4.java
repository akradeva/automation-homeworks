package com.operators;

public class Task4 {
    public static void main(String[] args) {
        int arr[] = {21,1,3, 23, 103};
        int largestNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (largestNum < arr[i]) {
                largestNum = arr[i];
            }
        }
        System.out.println(largestNum);
    }
}
