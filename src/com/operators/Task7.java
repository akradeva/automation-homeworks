package com.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> newList = new ArrayList<>();

        for (int i = list1.size()-1; i >= 0; i--){
            newList.add(list1.get(i));
        }
        System.out.println("The given list: " + list1.toString());
        System.out.println("The reversed list: " + newList.toString());
    }
}
