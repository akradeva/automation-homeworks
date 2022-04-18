package com.dataStructures;

public class Task1 {
    //print sum of a given array elements
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }
}
