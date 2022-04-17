package com.operators;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        //Solution with a list:

        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200));

        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i) % 5 == 0){
                if (list1.get(i) > 150){
                    break;
                }
                System.out.println(list1.get(i));
            }
        }


        //Solution with an array:

//        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] % 5 == 0){
//                if (arr[i] > 150){
//                    break;
//                }
//                System.out.println(arr[i]);
//            }
//        }
    }
}
