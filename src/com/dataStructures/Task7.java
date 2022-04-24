package com.dataStructures;

public class Task7 {
    public static void main(String[] args) {
        String input = "madame";
        char[] inputArr = input.toCharArray();
        char[] reversedArr = new char[inputArr.length];
        boolean isPalindrome = true;

        for (int i=0; i<inputArr.length; i++){
            reversedArr[inputArr.length-1-i] = inputArr[i];   //input.charAt(i)
        }

        for (int j=0; j<inputArr.length; j++){
            if (inputArr[j] != reversedArr[j]) {
                System.out.println("The word " + input + " is NOT a palindrome!");
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The word " + input + " is a palindrome!");
        }
    }
}
